package com.github.peacetrue.question.spring.chapter001;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuestionTest {

    //tag::package[]
    String basePackages = "com.github.peacetrue.question.spring.chapter001";
    //end::package[]

    //tag::case1[]
    @Test
    public void cycleReference1() throws Exception {
        new AnnotationConfigApplicationContext(basePackages + ".case1");
    }
    //end::case1[]

    //tag::case2[]
    @Test
    public void cycleReference2() throws Exception {
        new AnnotationConfigApplicationContext(basePackages + ".case2");
    }
    //end::case2[]

    //tag::case3[]
    @Test
    public void cycleReference3() throws Exception {
        new AnnotationConfigApplicationContext(basePackages + ".case3");
    }
    //end::case3[]

}