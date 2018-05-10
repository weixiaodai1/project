package com.luck.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest{
    @Test
	public void testHello(){
	  Assert.assertEquals("hi girl!",new HelloWorld.sayHello());
	}
}