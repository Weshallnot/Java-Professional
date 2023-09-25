package com.demo.javaannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//The @Target meta-annotation restricts the types the annotation can be applied to.
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	
	String param1();
	 boolean param2();
	 int[] param3(); // array parameter

}

//For default values

//@interface MyAnnotation {
//	 String param1() default "someValue";
//	 boolean param2() default true;
//	 int[] param3() default {};
//}
