package com.imooc.operator;

public class MathDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		x=4;
		y=(x++)+5;
		System.out.println("x="+x+"\ty="+y);
		x=4;
		y=(++x)+5;
		System.out.println("x="+x+"\ty="+y);
		
		x=4;
		y=(x--)+5;
		System.out.println("x="+x+"\ty="+y);
		x=4;
		y=(--x)+5;
		System.out.println("x="+x+"\ty="+y);
		System.out.println("x="+x++);
		

	}

}
