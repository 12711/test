package com.lsm.factory;

public class SmsFactory implements Provider {

	@Override
	public Sender process() {

		return new SmsSemder();
	}

}
