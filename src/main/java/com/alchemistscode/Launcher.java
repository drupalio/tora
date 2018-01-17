package com.alchemistscode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alchemistscode.view.PrincipalFrame;

public class Launcher {

	public static void main(String[] args) {
		String[] contextPaths = new String[] { "tora.xml" };
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(contextPaths);
		PrincipalFrame windows=(PrincipalFrame) ctx.getBean("window");
		windows.init();
		ctx.close();
	}
}
