package com.jensonjo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A_1_ParentDeserializationTest {
	public static void main(String[] args) {
		try {
			System.out.println("Creating...");
			A_3_Child c = new A_3_Child(1,new Student("Jenson"));
			System.out.println("c.field=" + c.field);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			c.field = 10;
			c.i = 99;
			System.out.println(c.getTest().getName());
			System.out.println("Serializing...");
			oos.writeObject(c);
			oos.flush();
			baos.flush();
			oos.close();
			baos.close();
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			System.out.println("Deserializing...");
			A_3_Child c1 = (A_3_Child) ois.readObject();
			System.out.println("c1.i=" + c1.getI());
			System.out.println("c1.field=" + c1.getField());
			System.out.println("c1.getTest() "+c1.getTest().getName());
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
