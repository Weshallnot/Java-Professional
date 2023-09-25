package com.demo.test;

import com.demo.beans.A;
import com.demo.beans.B;
import com.demo.beans.C;
import com.demo.javaannotations.InheritedAnnotationType;
import com.demo.javaannotations.UninheritedAnnotationType;

public class TestInheritedAnnotation {

	public static void main(String[] args) {
		System.out.println(new A().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println(new B().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println(new C().getClass().getAnnotation(InheritedAnnotationType.class));
		System.out.println("_________________________________");
		System.out.println(new A().getClass().getAnnotation(UninheritedAnnotationType.class));
		System.out.println(new B().getClass().getAnnotation(UninheritedAnnotationType.class));
		System.out.println(new C().getClass().getAnnotation(UninheritedAnnotationType.class));

	}

}
