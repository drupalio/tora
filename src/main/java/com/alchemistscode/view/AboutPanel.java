package com.alchemistscode.view;

import java.awt.Dimension;

import javax.annotation.PostConstruct;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alchemistscode.helpers.FileHelper;

@Component
public class AboutPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7212178433048651318L;

	@Autowired
	private FileHelper fileHelper;
	
	@PostConstruct
	public void init() {
		setLayout(null);
		
		Dimension dimension=new Dimension(360, 400);
		setPreferredSize(dimension);
		
		ImageIcon icon=new ImageIcon(fileHelper.loadResource("images/logo.png"));
		
		JLabel lblIcon = new JLabel(icon);
		JLabel lblMessage = new JLabel("Powered by www.alchemistscode.com");
		
		lblIcon.setBounds(0,0,360,360);
		lblMessage.setBounds(50,360,360,30);
		
		add(lblIcon);
		add(lblMessage);
	}



}
