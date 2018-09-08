package com.github.peacetrue.question.spring.chapter001.case3;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
//tag::class[]
@Component
public class Bean1 {
    @Autowired
    private Bean2 bean2;
}
//end::class[]


