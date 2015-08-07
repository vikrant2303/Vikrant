package com.practice.thread;

public class InSync extends Thread{
	StringBuffer letter;
	  public InSync(StringBuffer letter) { this.letter = letter; }
	  public void run() {
	    synchronized(letter) {      // #1
	      for(int i = 1;i<=100;++i) System.out.print(letter);
	      try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      System.out.println(" \n");
	      char temp = letter.charAt(0);
	      ++temp;         // Increment the letter in StringBuffer:
	      letter.setCharAt(0, temp);
	    }     // #2
	  }
	  public static void main(String [] args) {
	    StringBuffer sb = new StringBuffer("A");
	    new InSync(sb).start();  new InSync(sb).start();
	    new InSync(sb).start();
	  }

}
