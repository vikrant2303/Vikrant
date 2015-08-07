package com.practice.Others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AppMain {
	
	private static Logger logger=LoggerFactory.getLogger(AppMain.class);

	static boolean foo(char c){
		System.out.print(c);
		return true;
	}

	public static void main(String[] args) {
		logger.info("Logs printed......");
		int i=1;
		int x=0;
		
		for(foo('A');foo('B')&&i>0;foo('C')){
			i++;
			System.out.print("D");
			x++;
			if(x>11)
				break;
		}
		
	}
	
}
