package com.neusoft.oop;

/**
 * 汽车类
 * @author Neuedu
 */
public class Car {
	
	public Car() {
		System.out.println("父类的汽车");
	}

	// 成员变量
	// 车型
	String type;
	
	// 速度
	int speed;
	
	// 品牌
	String brand;
	
	// 成员方法
	public void run() {
		System.out.println("运动");
	}
	
}