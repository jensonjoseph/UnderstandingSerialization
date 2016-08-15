package com.jensonjo;

import java.io.Serializable;

public class A_3_Child extends A_2_Parent implements Serializable {
	protected int i;
	private Student test;

	public A_3_Child(int _i, Student _test) {
		i = _i;
		this.test = _test;
		System.out.println("Child Constructor");

		// Overriding field of parent class
		field = 33;
	}

	public A_3_Child() {
		System.out.println("Child constructor");
	}

	public int getI() {
		return i;
	}

	public Student getTest(){
		return test;
	}
}
