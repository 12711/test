package com.lsm.factory;

import org.junit.Test;

public class TestFactory {
   @Test
   public void test(){
	   Provider provider=new SmsFactory();
	   
	   Sender sender=provider.process();
	   sender.send();
   }
}
