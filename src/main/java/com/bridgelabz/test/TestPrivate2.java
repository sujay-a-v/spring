package com.bridgelabz.test;

import java.lang.reflect.Constructor;

public class TestPrivate2 {

	public static void main(String[] args) {
		try{
			Class c=Class.forName("com.bridgelabz.model.PrivateConstructor2");
			Constructor con= c.getDeclaredConstructor();
			con.setAccessible(true);
			con.newInstance(null);
			
		}catch (Exception e) {
		}

	}

}
