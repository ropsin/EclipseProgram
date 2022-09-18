package com.OOPSprogram;

class Bank
{
	double InterestRate() {
		return 12.5;
	}
}

class Axis extends Bank{
	double InterestRate() {
		return 10.5;
	}
}

class ICICI extends Bank{
	double InterestRate() {
		return 9.7;
	}
}

class HDFC extends Bank{
	double InterestRate() {
		return 8.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Axis axis=new Axis();
		System.out.println(axis.InterestRate());
		
		ICICI icici=new ICICI();
		System.out.println(icici.InterestRate());
		
		HDFC hdfc=new HDFC();
		System.out.println(hdfc.InterestRate());
	}

}
