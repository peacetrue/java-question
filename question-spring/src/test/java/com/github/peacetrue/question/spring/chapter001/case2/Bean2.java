package com.github.peacetrue.question.spring.chapter001.case2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
//tag::class[]
@Component
public class Bean2 {
    @Autowired
    private Bean1 bean1;
}
//end::class[]

