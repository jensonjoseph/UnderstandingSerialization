package com.jensonjo;

import java.io.Serializable;

public class Student implements Serializable {
	String name;

	public String getName() {
		return name;
	}

	Student(String _name) {
		name = _name;
	}
}
