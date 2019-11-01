package com.dfbz.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Sell implements Entity {
    @Override
    public void retail() {
        int a=1/0;      //丢出异常， @AfterThrowing才会执行

        System.out.println("--零售--");
    }

    @Override
    public void Direct() {
        System.out.println("--直售--");
    }
}
