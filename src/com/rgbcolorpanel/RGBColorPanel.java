package com.rgbcolorpanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class RGBColorPanel extends JPanel{
	private RGBColorPanel() {
		super();
		setLayout(new FlowLayout(FlowLayout.CENTER,10,40));
		setBorder(BorderFactory.createTitledBorder("RGB Color Palette"));
		
		var red_text = new JTextField(3);
		var green_text = new JTextField(3);
		var blue_text = new JTextField(3);
		var generate = new JButton("generate");
		var display = new JLabel();
		var text = new JLabel(" ");
		var reset = new JButton("Reset");
		
		text.setBorder(BorderFactory.createLineBorder(Color.black));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setFont(new Font("Sancerif",Font.PLAIN,15));
		display.setHorizontalAlignment(JLabel.CENTER);
		display.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		display.setPreferredSize(new Dimension(150,150));
		display.setOpaque(true);
		
		add(new JLabel("Red"));
		add(red_text);
		add(new JLabel("Green"));
		add(green_text);
		add(new JLabel("Blue"));
		add(blue_text);
		add(generate);
		add(reset);
		add(display);
		add(text);
		
		
		generate.addActionListener((e)-> {
			try {
				int red = Integer.valueOf(red_text.getText());
				int green = Integer.valueOf(green_text.getText());
				int blue = Integer.valueOf(blue_text.getText());
				display.setBackground(new Color(red,green,blue));
				text.setText("Color Displayed");
				text.setForeground(new Color(red,green,blue));
			}catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(RGBColorPanel.this, "Invalid Input!");
			}catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(RGBColorPanel.this, "Invalid Input!");
			}catch(IllegalArgumentException e1) {
				JOptionPane.showMessageDialog(RGBColorPanel.this, "Invalid Input!");
			}
		});
		
		reset.addActionListener((e)-> {
			red_text.setText("");
			green_text.setText("");
			blue_text.setText("");
			red_text.requestFocus();
			display.setBackground(null);
			text.setForeground(null);
			
			text.setText(" ");
		});
		
		red_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
						green_text.requestFocus();
				}
			}
		});
		
		green_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					blue_text.requestFocus();
				}
			}
		});
		blue_text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					try {
						int red = Integer.valueOf(red_text.getText());
						int green = Integer.valueOf(green_text.getText());
						int blue = Integer.valueOf(blue_text.getText());
						display.setBackground(new Color(red,green,blue));
						text.setText("Color Displayed");
						text.setForeground(new Color(red,green,blue));
					}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(RGBColorPanel.this, "Invalid Input!");
					}catch (NullPointerException e1) {
						JOptionPane.showMessageDialog(RGBColorPanel.this, "Invalid Input!");
					}catch(IllegalArgumentException e1) {
						JOptionPane.showMessageDialog(RGBColorPanel.this, "Invalid Input!");
					}
				}
			}
		});
	}
	
	public static RGBColorPanel createRGBSelectPanel() {
		return new RGBColorPanel();
	}
	
}
