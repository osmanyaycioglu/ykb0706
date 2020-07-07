package com.training.ykb;

import java.util.Enumeration;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Component
//@Controller
//@Configuration
//@Repository
//@Service

@RestController
@RequestMapping("/first")
@Validated
public class MyFirstRest {

    @Autowired
    @Qualifier("osman")
    private IMyObject       xyz;

    @Qualifier("mehmet")
    private final IMyObject abc;
    @MapMeQ
    private IMyObject       uvf;

    @Autowired
    public MyFirstRest(final IMyObject myObject) {
        this.abc = myObject;
    }

    @Autowired
    public void myMethod(final IMyObject myObject) {
        this.uvf = myObject;
    }

    @PostConstruct
    public void xyz() {
        this.xyz.execute();
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world GET";
    }

    @PostMapping("/hello")
    public String hello2() {
        return "hello world POST";
    }

    @GetMapping("/hello2/{xyz}/{abc}")
    public String hello2(@PathVariable("xyz") final String name,
                         @PathVariable("abc") final String surname) {
        return "hello world 2 " + name + " " + surname;
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam("xyz") final String name,
                         @RequestParam("abc") final String surname) {
        return "hello world 3 " + name + " " + surname;
    }

    @GetMapping("/hello4/{uvf}")
    public String hello4(@RequestParam("xyz") final String name,
                         @RequestParam("abc") final String surname,
                         @PathVariable("uvf") final int age) {
        return "hello world 4 " + name + " " + surname + " yaş : " + age;
    }

    @GetMapping("/hello5")
    public String hello5(@NotEmpty @RequestHeader("xyz") final String name,
                         @RequestHeader("abc") final String surname) {
        return "hello world 5 " + name + " " + surname;
    }

    @PatchMapping("/hello6")
    public String hello6(@RequestBody final Person person) {
        return "hello world 6 " + person.getName() + " " + person.getSurname() + " " + person.getAge();
    }

    @PostMapping(value = "/hello7",
                 consumes = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 },
                 produces = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 })
    public Person hello7(@RequestBody final Person person) {
        return person;
    }

    @PostMapping("/hello8")
    public String hello8(@Validated @RequestBody final Person person,
                         final HttpServletRequest requestParam) {
        Enumeration<String> headerNamesLoc = requestParam.getHeaderNames();
        System.out.println(headerNamesLoc);
        if (true) {
            throw new IllegalStateException("Error oluştu");
        }
        return "hello world 8 " + person.getName() + " " + person.getSurname() + " " + person.getAge();
    }


}

