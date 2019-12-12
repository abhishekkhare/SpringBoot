package com.abhi.spring.edu.springboot.api.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/rqTest")
public class RequestMappingTest {
    /**
     * Mapping by path
     *
     * @return
     */
    @RequestMapping(value = "/ex/foos", method = GET)
    public String getFoosBySimplePath() {
        return "Get some Foos";
    }

    @RequestMapping(value = "/ex/foos", method = POST)
    public String postFoos() {
        return "Post some Foos";
    }

    /**
     * The HTTP method parameter has no default – so if we don't specify a value, it's going to map to any HTTP request.
     *
     * @return
     */
    @RequestMapping(value = "/ex/foos/all")
    public String fooAll() {
        return "Handle any foo as nothing is by default";
    }

    @RequestMapping(value = "/ex/foos/allh", headers = {"reqTypeG=GET", "reqTypeP=POST"}, method = {GET, POST})
    public String getFoosWithHeader() {
        return "Get some Foos with Header";
    }

    @RequestMapping(value = {"", "/page", "page*", "view/*,**/msg"})
    public String indexMultipleMapping() {
        return "Hello from index multiple mapping.";
    }

    @RequestMapping(value = "/ex/foos/json", method = GET, produces = "application/json")
    public String getFoosAsJsonFromREST() {
        return "Get some Foos with Header New";
    }

    @RequestMapping(value = "/ex/foos/jsonh", method = GET, headers = "Accept=application/json")
    public String getFoosAsJsonFromBrowser() {
        return "Get some Foos with Header Old";
    }

    @RequestMapping(value = "/ex/foos/{id}", method = GET)
    public String getFoosBySimplePathWithPathVariable(@PathVariable("id") long id) {
        return "Get a specific Foo with id=" + id;
    }

    @RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = GET)
    public String getFoosBySimplePathWithPathVariables(@PathVariable long fooid, @PathVariable long barid) {
        return "Get a specific Bar with id=" + barid +
                " from a Foo with id=" + fooid;
    }

    @RequestMapping(value = "/ex/bars/{numericId:[\\d]+}", method = GET)
    public String getBarsBySimplePathWithPathVariable(@PathVariable long numericId) {
        return "Get a specific Bar with id=" + numericId;
    }

    @RequestMapping(value = "/ex/bars", method = GET)
    public String getBarBySimplePathWithRequestParam(@RequestParam("id") long id) {
        return "Get a specific Bar with id=" + id;
    }
}
