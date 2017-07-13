package com.test;

import java.lang.invoke.SwitchPoint;

public class Single {
	
	static{
		
		System.out.println("66666");
	}
	

	private Single(){
	}
	
    /**
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
	private static class SingleHolder{
		/**
         * 静态初始化器，由JVM来保证线程安全
         */
		private static Single instance = new Single();
	}
	
	private static Single getInstance(){
		return SingleHolder.instance;
	}

	public int getNo(int input){
		
		
		
		switch (input) {
		case 3:
			return input;

		default:
			return 0;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Single single = new Single();
		System.out.println(single.getNo(4));


		
		
	}
			
			
	

}
