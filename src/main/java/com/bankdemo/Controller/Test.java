package com.bankdemo.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		
		/*
		 * Random rd = new Random();
		 * 
		 * String acNo = "hcl"+rd.nextInt();
		 * 
		 * System.out.println(acNo);
		 */
		
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		      LocalDate localDate = LocalDate.now();
		      System.out.println(dtf.format(localDate));    // 2021/03/22
		      


	}

}
