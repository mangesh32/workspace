package com.psl.client;

import java.util.Scanner;

import com.psl.util.MyThread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread("first");
		MyThread t2=new MyThread("second");
		MyThread t3=new MyThread("third");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
