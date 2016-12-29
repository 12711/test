package com.lsm.factory;

public class MailFactory implements Provider {

	@Override
	public Sender process() {

		return new MailSender();
	}

}
