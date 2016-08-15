package com.jensonjo;

import java.io.Serializable;

public class A_2_Parent {
	protected int field;

	protected A_2_Parent() {
		//field = fNO;
		System.out.println("Parent constructor");
	}

	public int getField() {
		return field;
	}
}
