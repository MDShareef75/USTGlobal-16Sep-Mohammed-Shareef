package com.ust.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.ust.springcore.di")
public class ComponentScanConfiguration {

}
