package com.alchemistscode.tora;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Launcher {

	public static void main(String[] args) {
		String[] contextPaths = new String[] { "tora.xml" };
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(contextPaths);
		ctx.close();
	}
}
