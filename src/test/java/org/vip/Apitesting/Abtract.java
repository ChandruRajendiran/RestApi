package org.vip.Apitesting;


public  class Abtract extends Sample{
	
	public void bank() {
		System.out.println("no back details");
	}
	public static void main(String[] args) {
		
		Abtract n= new Abtract();
		n.bank();
		
	}

public abstract class Sample
{
	abstract void bank();
	public void branchdetai() {
		
		System.out.println("chennai");
	}
}



}
