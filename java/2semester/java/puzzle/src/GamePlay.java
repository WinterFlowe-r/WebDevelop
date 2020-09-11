import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//패널을 이용한 그림퍼즐게임

public class GamePlay extends JFrame implements MouseListener {
 
 int count=0,game[];  // count : 증가변수, game : 실제 저장된 값
 int row=4,col=4;  // 행, 열
 Image original;   // 원본 이미지
 BufferedImage img[];  // 원본 이미지를 잘라 저장할 배열
 int width,height;   // 잘라낸 그림 1개의 크기
 int clickCount,oldNum;  // 클릭수 카운트, 이전에 클릭한 위치
 int level=0;
Connection con;
Statement stmt;
PreparedStatement psmt;
ResultSet rs;

String uid = "";
String picname = "";
 static String timerBuffer; // 04:11:15 등의 경과 시간 문자열이 저장될 버퍼 정의
 static int oldTime; // 타이머가 ON 되었을 때의 시각을 기억하고 있는 변수
 
 //타이머 관련(백그라운드)
 public static void stopwatch(int onOff) {
	    if (onOff == 1) // 타이머 켜기
	      oldTime = (int) System.currentTimeMillis() / 1000;

	    if (onOff == 0) // 타이머 끄고, 시분초를 timerBuffer 에 저장
	      secToHHMMSS(  ((int) System.currentTimeMillis() / 1000) - oldTime  );
	  }
	  
 // 정수로 된 시간을 초단위(sec)로 입력 받아, "04:11:15" 등의 형식의 문자열로 시분초를 저장
	  public static void secToHHMMSS(int secs) {
	    int hour, min, sec;

	    sec  = secs % 60;
	    min  = secs / 60 % 60;
	    hour = secs / 3600;

	    timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
	    System.out.println();
	  }


	  public static void pause() {
	    try {
	      System.in.read();
	    } catch (IOException e) { }
	  }
//타이머 끝
	  
//생성자  매개변수로 그림파일이름과 유저아이디를 받아옴
 public GamePlay(String a, String userid, int level) {
	 
	 
	 row = level;
	 col = level;
	 uid = userid;
	 picname = a;
	 stopwatch(1); // 1을 인수로 넣으면 타이머가 켜짐
	 

  
  // 원본 그림 읽기
  MediaTracker tracker = new MediaTracker(this);    ////이미지에만 적용되는 쓰레드역할 단독사용해야함
   /* 이미지가 올려지는동안 부분적으로 보여지는것을 볼수있다. 이런현상을 방지하기위해 MediaTracker를 사용한다.
      MediaTracker는 그림이 완전히 올려지면 그이미지를 보여준다.  */

  original = Toolkit.getDefaultToolkit().getImage("src/imgs/"+a+".jpg");
  tracker.addImage(original, 0);
     try { 
      tracker.waitForAll();
     } catch (InterruptedException e) { ; }
     
     width = original.getWidth(this)/col;
     height = original.getHeight(this)/row;
     setSize(new Dimension(width*col,height*row));
     
     // 이미지 자르기
     img = new BufferedImage[row*col];
     int cnt=0;
     for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
       img[cnt] = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
       Graphics g = img[cnt].getGraphics();
       
       // 원본이미지에서 필요한 부분만 잘라서 그리기
       g.drawImage(original, 0, 0,  width, height,    //그려질 위치
             j*width, i*height,(j+1)*width, (i+1)*height,this);  //그림을 잘라낼부분
       cnt++;
      }
     }
   
     JPanel panel = new JPanel();
	 JLabel label = new JLabel("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	 label.setBounds(1000, 50, 200, 200);
	panel.add(label);
	 add(panel);
	 
  shuffle();    //숫자 섞기
  setTitle("플레이");
  addMouseListener(this); // 마우스 리스너 등록
  setSize(1050,730);
  setVisible(true);
 }
 
 
 //game배열의 숫자 섞기
 private void shuffle() {
     game = new int[row*col];  
  Random rnd = new Random();
  for(int i=0;i<row*col;i++) game[i] = 0; 
  for(int i=0;i<row*col;i++){
   int temp = 0;
   do{
    temp = rnd.nextInt(row*col);
   }while(game[temp]!=0);
   game[temp] = i;
  }
  System.out.println(Arrays.toString(game));
 }
 
 
 // 그리기 코드에 paint에 몰아준다.
 public void paint(Graphics g) {
  int cnt=0;
  for(int i=0;i<row;i++){
   for(int j=0;j<col;j++){
    g.drawImage(img[game[cnt]],
     j*width, i*height, (j+1)*width, (i+1)*height, //그려질위치
     0,0,width,height,this);       //잘라낼부분
    cnt++;
   }
  }
 }
 
 // 마우스 리스너 구현
 public void mouseClicked(MouseEvent e) {
  int x = e.getX();   // x좌표
  int y = e.getY();   // y좌표
  int r = y/height;   // 그림 한개의 높이로 나눈다
  int c = x/width;   // 그림 한개의 폭으로 나눈다
  int imgNo = r*row + c;  // 배열 첨자
  String coord = "(" + x + ", " + y  + 
    ") - (" + r + ", " + c + ") - " + imgNo + " : " + game[imgNo]; 
  
  //=======================================================
   System.out.println("img"+imgNo);
  if(clickCount==0){ // 첫번째 클릭이면
   clickCount++;
      oldNum = imgNo;
      System.out.println("원클릭"+oldNum);
  }else{ // 두번째 클릭이면
   if(oldNum!=imgNo){
    int temp = game[oldNum];
    game[oldNum] = game[imgNo];
    game[imgNo] = temp;
    System.out.println("두번쨰클릭ㅓ"+temp);
    repaint();
    endGame();
   }
   clickCount = 0;
  }
 }
 
 // 게임 종료를 확인하는 메소드
 private void endGame() {
  boolean endGame = true;
  for(int i=0; i<game.length; i++){
   if(i != game[i]){
    endGame = false;
   }
  }
  
  //if(조건식)에서 조건식이 true면 if문실행
  if(endGame){        
   JOptionPane.showMessageDialog(this, "짝짝짝 잘 맞추셨어요!");
   stopwatch(0); // 0을 넣으면 타이머가 꺼지고 시간 문자열을 버퍼에 설정
  // System.out.format("Timer OFF! 경과 시간: [%s]%n", timerBuffer); // 경과 시간 화면에 출력
   DBManager dbManager;
	dbManager = new DBManager();
	dbManager.gameadd(uid, picname, timerBuffer);
	
   //게임 재시작을 확인
   int reStart = JOptionPane.showConfirmDialog(this, "다시 시작?", "종료확인", JOptionPane.YES_NO_OPTION);
   if(reStart == JOptionPane.YES_OPTION){
    //배열을 다시 섞고 다시 그리기를 한다
    shuffle();   //섞기
    repaint();   //다시 그리기
   }else{
	   dispose();
    new SelectMode(uid);
   }
  }
 }
 public void mousePressed(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
}