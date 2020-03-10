package com.abhi.edu.mockito.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;

import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @InjectMocks
    MathApplication mathApplication1 = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService1;


    @Before
    public void setUp() {
        mathApplication1 = new MathApplication();
        Calculator calculator = new Calculator();
        calcService1 = spy(calculator);
        mathApplication1.setCalculatorService(calcService1);
    }


    @Test
    public void testAdd() {
        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0, 20.0)).thenReturn(30.00);

        //add the behavior of calc service to subtract two numbers
        when(calcService.subtract(20.0, 10.0)).thenReturn(10.00);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);

        //test the subtract functionality
        Assert.assertEquals(mathApplication.subtract(20.0, 10.0), 10.0, 0.0);

        //default call count is 1
        verify(calcService).subtract(20.0, 10.0);

        //check if add function is called three times
        //verify call to add method to be completed within 100 ms
        verify(calcService, timeout(100).times(3)).add(10.0, 20.0);

        //verify that method was never called on a mock
        verify(calcService, never()).multiply(10.0, 20.0);

        //check a minimum 1 call count
        verify(calcService, atLeastOnce()).subtract(20.0, 10.0);

        //check if add function is called minimum 2 times
        verify(calcService, atLeast(2)).add(10.0, 20.0);

        //check if add function is called maximum 3 times
        verify(calcService, atMost(3)).add(10.0, 20.0);
    }

    @Test(expected = RuntimeException.class)
    public void testAddWithException() {
        //add the behavior to throw exception
        doThrow(new RuntimeException("Add operation not implemented"))
                .when(calcService).add(10.0, 20.0);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
    }

    @Test
    public void testAddAnswer() {

        //add the behavior to add numbers
        when(calcService.add(20.0, 10.0)).thenAnswer(new Answer<Double>() {
            public Double answer(InvocationOnMock invocationOnMock) throws Throwable {
                //get the arguments passed to mock
                Object[] args = invocationOnMock.getArguments();

                //get the mock
                Object mock = invocationOnMock.getMock();

                //return the result
                return 30.0;
            }
        });

        //test the add functionality
        Assert.assertEquals(mathApplication.add(20.0, 10.0), 30.0, 0);
    }

    @Test
    public void testAddSpying() {

        //perform operation on real object
        //test the add functionality
        //In the real calculator we add extra 10 and hence answer is 40
        Assert.assertEquals(mathApplication1.add(20.0, 10.0), 40.0, 0);
    }
}
