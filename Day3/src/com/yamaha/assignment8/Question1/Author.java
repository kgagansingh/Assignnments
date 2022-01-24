package com.yamaha.assignment8.Question1;

import java.lang.annotation.*;

@Target(value = { ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	String name() default "unknown";
}