package com.alchemistscode.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alchemistscode.helpers.FileHelper;

@Component
public class WindowsContainer extends JDesktopPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5578977844704006096L;
	
	@Autowired
	private FileHelper fileHelper;

	public void addJInternalFrame(JInternalFrame component){
		if(!validateIfComponentIsAdded(component)){
			add(component);
		}
		else{
			component.setVisible(true);
		}
	}
	
	private boolean validateIfComponentIsAdded(JInternalFrame component) {
		boolean flag = false;
		for (JInternalFrame internal : getAllFrames()) {
			if (internal.equals(component)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void centerWindow(JInternalFrame component) {
		Point point=new Point();
		point.x=(getWidth()/2)-(component.getWidth()/2);
		point.y=(getHeight()/2)-(component.getHeight()/2);
		component.setLocation(point);
	}
	
	@Override
	  protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image image=new ImageIcon(fileHelper.loadResource("images/bg.jpg")).getImage();
	    g.drawImage(image, 0, 0,this.getWidth(), this.getHeight(), null);
	}
}
