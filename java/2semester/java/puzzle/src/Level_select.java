
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class Level_select extends JFrame {
	//공통변수
	Image img = null;
	int level=1;
	private Font f1,f2,f3,f4;
	Connection con;
	Statement stmt;
	PreparedStatement psmt;
	ResultSet rs;
	
	public Level_select(String userid) {
		System.out.println("Level_select클래스"+userid);
		JPanel panel = new JPanel();
		panel.setLayout(null); //
		JLabel label = new JLabel("난이도를 선택하세요");
		f1 = new Font("Malgun gothic",Font.BOLD,27);
		label.setFont(f1);
		
		JButton bt = new JButton("쉬움");
		JButton bt2 = new JButton("어려움");
		JButton bt3 = new JButton("매우 어려움");
		
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
		
		//쉬움클릭 4x4
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Picture_Select(userid,4);
			}
		});
		
		//어려움 클릭 6x6
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Picture_Select(userid,6);
				
			}
			
		});
		
		//매우어려움 클릭 8x8
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Picture_Select(userid,8);
				
				
			}
			
		});
	}
}
