package com.rgbcolorpanel;

import javax.swing.JFrame;

public class Main extends JFrame{
	private Main() {
		super();
		setBounds(400, 200, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(RGBColorPanel.createRGBSelectPanel());
		setTitle("RGB Color Palette");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}


