package com.ibm.sample;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Hello");
		Foo f=new Foo();
		list.add(f);
		f=(Foo) list.get(1);
		System.out.println(list.get(0)+" "+f);
	}

}
