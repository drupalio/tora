package com.alchemistscode.helpers;

import java.awt.Toolkit;

import org.springframework.stereotype.Component;

@Component
public class ScreenHelper {
	private   Toolkit tk ;
	
	public ScreenHelper() {
		 tk=Toolkit.getDefaultToolkit();
	}
	
	public Integer getScreenWidth(){
		return (int) tk.getScreenSize().getWidth();
	}
	
	public Integer getScreenHeight(){
		return (int) tk.getScreenSize().getHeight();
	}
	
}
