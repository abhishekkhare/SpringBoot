package com.abhi.spring.edu.springboot.service.basic;

import org.springframework.stereotype.Service;

@Service("ms")
public class MathService {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }
}
