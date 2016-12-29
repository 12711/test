package com.lsm.factory;

public class SmsSemder implements Sender {

	@Override
	public void send() {
		System.out.println("SmsSender-----");
	}

}
