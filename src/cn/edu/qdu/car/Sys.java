package cn.edu.qdu.car;

import java.util.Scanner;

public class Sys {
	// public void welcome(){
	//
	// }
	public void rentMoto() {
		String[] carType = { "bmw", "benc", "audi" };
		int[] busType = { 11, 32 };
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("������Ҫ������죿");
		int day = input.nextInt();
		System.out.println("1 car or 2 bus");
		int sel = input.nextInt();
		if (sel == 1) {
			System.out.println("type:1 bmw 2 audi 3 benc");
			Car car = new Car("³B");
			car.setType(carType[sel - 1]);
			// �������
			double totalFee = car.rentFee(day);
			// ���
			System.out.println("**car,*day,toralfee ***" + totalFee);
		} else {
			System.out.println("seatCount:1 <16  2 >16");
			Bus bus = new Bus("³A");
			bus.setSeatCount(busType[sel - 1]);
			double totalFee = bus.rentFee(day);
			System.out.println("**car,*day,toralfee ***" + totalFee);
		}
	}

	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
