package com.dfbz.comfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.dfbz")
@EnableAspectJAutoProxy//开启aop切点注释
public class Config {

}
