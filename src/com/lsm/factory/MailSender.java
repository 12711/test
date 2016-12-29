package com.lsm.factory;

public class MailSender implements Sender {

	@Override
	public void send() {
	   System.out.println("MailSerder-------");
	}

}
