package com.github.peacetrue.question.spring.chapter001.case3;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//tag::class[]
@Component
public class Bean2 {
    private Bean1 bean1;

    public Bean2(Bean1 bean1) {
        this.bean1 = bean1;
    }
}
//end::class[]


