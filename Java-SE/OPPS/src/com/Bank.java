package com;

public class Bank implements Customer, BankEmployee, Manager {

	@Override
	public void openAccount() {
		System.out.println(">>> Opening Account");
	}

	@Override
	public void closeAccount() {
		System.out.println(">>> Closing account");
	}

	@Override
	public void withDraw() {
		System.out.println(">>> WithDrawing");
	}

	@Override
	public void deposit() {

		System.out.println(">>> Depositiing");

	}

	@Override
	public void lockerAcess() {
		System.out.println(">>> Locker Access Given");
	}

}
