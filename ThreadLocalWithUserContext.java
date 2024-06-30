package com.test.practice;

public class ThreadLocalWithUserContext implements Runnable {
	 
    //private static ThreadLocal<Context> userContext = new ThreadLocal<>();
    private static Context userContext = new Context();
    private Integer userId;

    public ThreadLocalWithUserContext(int i) {

    	this.userId=i;
    }

	@Override
    public void run() {
    	String userName="";
    	if(userId==1) {
    		 userName =	"1";
    	}else {
    		 userName =	"2";
    	}
        userContext.set(new Context(userName));
        System.out.println("thread context for given userId: " 
          + userId + " is: " + userContext.get());
    }
    
    public static void main(String[] args) {
    	ThreadLocalWithUserContext firstUser 
    	  = new ThreadLocalWithUserContext(1);
    	ThreadLocalWithUserContext secondUser 
    	  = new ThreadLocalWithUserContext(2);
    	new Thread(firstUser).start();
    	new Thread(secondUser).start();
	}
}