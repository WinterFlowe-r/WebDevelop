
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class SelectMode extends JFrame {
	//공통변수
	Image img = null;
	private Font f1,f2,f3,f4;
	Connection con;
	Statement stmt;
	PreparedStatement psmt;
	ResultSet rs;
	public SelectMode(String userid) {
		
		System.out.println("selectMode클래스");
		JPanel panel = new JPanel();
		panel.setLayout(null); //
		JLabel label = new JLabel("게임모드를 선택하세요");
		f1 = new Font("Malgun gothic",Font.BOLD,27);
		label.setFont(f1);
		
		JButton bt = new JButton("싱글플레이");
		JButton bt2 = new JButton("멀티플레이");
		JButton bt3 = new JButton("내 기록보기");
		
		label.setBounds(215, 165, 300, 50); 
		bt.setBounds(80,256,155,45);
		bt2.setBounds(273,256,155,45);
		bt3.setBounds(463,256,155,45);
		add(label);
		add(bt);
		add(bt2);
		add(bt3);
		add(panel);
		setSize(700,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("게임모드 선택");
		setVisible(true);
		
		//싱글플레이 선택
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Level_select(userid);
				//new Picture_Select(userid);
			}
		});
		
		//멀티플레이 선택
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MultiMode(userid);
				
			}
			
		});
		
		//내 기록보기 선택		
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Myinfo(userid);
				setVisible(false);
			}
			
		});
	}
}
