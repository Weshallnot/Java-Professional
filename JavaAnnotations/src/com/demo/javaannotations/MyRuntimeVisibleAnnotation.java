package com.demo.javaannotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface MyRuntimeVisibleAnnotation {

}
