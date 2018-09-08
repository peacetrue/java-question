package com.github.peacetrue.question.spring.chapter001.case2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//tag::class[]
@Component
public class Bean1 {
    private Bean2 bean2;

    public Bean1(Bean2 bean2) {
        this.bean2 = bean2;
    }
}
//end::class[]

