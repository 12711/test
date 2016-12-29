package com.lsm.factory;

public interface Provider {
	/* 用来创建Sender子类对象 */
	Sender process();
}
