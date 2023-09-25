package com.demo.test;

/**
 * In Java, an annotation is a form of syntactic metadata that can be added to Java source code. It provides data about
a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they
annotate. Classes, methods, variables, parameters and packages are allowed to be annotated.
**/

import java.lang.annotation.Annotation;
import java.util.Arrays;

import com.demo.javaannotations.MyDefaultAnnotation;
import com.demo.javaannotations.MyRuntimeVisibleAnnotation;

public class TestJavaAnnotations {

	@MyDefaultAnnotation
	static class RuntimeCheck1 {
	}
	
	@MyRuntimeVisibleAnnotation
	static class RuntimeCheck2 {
	}
	
	public static void main(String[] args) {
		
		
		 Annotation[] annotationsByType = RuntimeCheck1.class.getAnnotations();
		 Annotation[] annotationsByType2 = RuntimeCheck2.class.getAnnotations();
		 System.out.println("default retention: " + Arrays.toString(annotationsByType));
		 System.out.println("runtime retention: " + Arrays.toString(annotationsByType2));
		 

	}

}
