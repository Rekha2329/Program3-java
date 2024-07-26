package com.jspiders.passingobject;

import java.util.Scanner;
class Account{
	int cid;
	long accountNumber;
	double accountBalance;
	Account(int c, long an,double ab)
	{
		cid =c;
		accountNumber=an;
		accountBalance=ab;
	}
}
class Bank
{
	static Account createAccount()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter cid");
		int cid=scn.nextInt();
		System.out.println("Enter Account Number");
		long accountNumber=scn.nextLong();
		System.out.println("Enter Accout Balance");
		double accountBalance=scn.nextDouble();
		return new Account(cid,accountNumber,accountBalance);
	}
	static void displayAccountInfo(Account a) {
		System.out.println("CID :"+a.cid);
		System.out.println("accountNumber :"+ a.accountNumber);
		System.out.println("accountBalance :"+a.accountBalance);
	}
	static Account debitAccount(Account a,double amt)
	{
		a.accountBalance=a.accountBalance-amt;
		return a;
	}
}

public class Program3 {
	public static void main(String[ ]args) {
		Account a1=Bank.createAccount();
		Account a2=Bank.createAccount();
		Bank.displayAccountInfo(a1);
		Bank.displayAccountInfo(a2);
	}

}
