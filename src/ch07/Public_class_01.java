package ch07;

import java.lang.*;

public class Public_class_01 {

	public static void main(String args[]) {
		CCar bus = new CCar();
		CCar truck = new CCar();
		CCar taxi = new CCar();

		bus.name = "公車";
		bus.wheel = 6;
		bus.person = 4;

		truck.name = "卡車";
		truck.wheel = 8;
		truck.person = 3;

		taxi.name = "計程車";
		taxi.wheel = 4;
		taxi.person = 5;
		//taxi.engine = "V16";

		System.out.print(bus.name + "有" + bus.wheel + "個輪子");
		System.out.println("可載" + bus.person + "人");
		System.out.print(bus.name + "有" + truck.wheel + "個輪子");
		System.out.println("可載" + truck.person + "人");
		System.out.print(bus.name + "有" + taxi.wheel + "個輪子");
		System.out.println("可載" + taxi.person + "人");
	}

}

class CCar {
	public int wheel;
	public int person;
	public String name;
	private String engine;
}