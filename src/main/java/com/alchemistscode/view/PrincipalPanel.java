package com.alchemistscode.view;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;

import javax.annotation.PostConstruct;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alchemistscode.helpers.ScreenHelper;

@Component
public class PrincipalPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1415766294776144065L;

	private JMenuBar menuBar = new JMenuBar();
	private JMenu HelpMenu = new JMenu("Ayuda");

	private JMenuItem aboutItem = new JMenuItem("Acerca de");

	@Autowired
	private ScreenHelper screenHelper;
	
	@Autowired
	private WindowsContainer internalDesktop;
	
	@PostConstruct
	public void init() {

		menuBar.setBounds(0, 0, screenHelper.getScreenWidth(), 30);
		internalDesktop.setBounds(0, 30, screenHelper.getScreenWidth(), screenHelper.getScreenHeight() - 30);

		add(menuBar);
		add(internalDesktop);

		menuBar.add(HelpMenu);

		HelpMenu.add(aboutItem);

		setLayout(null);
		setPreferredSize(new Dimension(screenHelper.getScreenWidth(), screenHelper.getScreenHeight() - 100));
	}

}
