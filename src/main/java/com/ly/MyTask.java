package com.ly;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTask {

	public void work() throws InterruptedException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(" do work" + formatter.format(new Date()));

		
	}
	
	
}
