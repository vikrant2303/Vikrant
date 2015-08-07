package com.practice.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInvocationHandler implements InvocationHandler{

	public Object testInterfaceImpl;
	public TestInvocationHandler(Object testInterfaceImpl){
		this.testInterfaceImpl=testInterfaceImpl;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("proxy object :"+proxy.getClass().getCanonicalName());
		System.out.println("args :"+args);
		System.out.println("method.getName():"+method.getName());
		
		return method.invoke(testInterfaceImpl, args);
	}

}
