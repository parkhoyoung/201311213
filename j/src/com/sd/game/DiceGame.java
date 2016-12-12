package com.sd.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;



public class DiceGame extends JFrame{
    Player p1;
    Player p2;
    String APlayerName;
    String BPlayerName;
    Scanner scanner = new Scanner(System.in);
    int p1win=0;
    int p2win=0;
    JLabel labelA,labelB,labelC,labelD,labelResult,labelScore,labelPlayerA,labelPlayerB;
   
    public void startGame() {
    
    	  ImageIcon Icon[] = {
    			   new ImageIcon("./src/com/sd/game/one.png"),
    			   new ImageIcon("./src/com/sd/game/two.png"),
    			   new ImageIcon("./src/com/sd/game/three.png"),
    			   new ImageIcon("./src/com/sd/game/four.png"),
    			   new ImageIcon("./src/com/sd/game/five.png"),
    			   new ImageIcon("./src/com/sd/game/six.png")
    			 };
    	  
    	  setSize(800, 600);
    	  setTitle("주사위 게임");
    	  setLayout(null);
    	  Container ct = getContentPane();
    	  ct.setBackground(Color.white);
    	  
    	  labelA = new JLabel();
    	  labelA.setBounds(50,100,100,100);
    	  labelB = new JLabel();
    	  labelB.setBounds(200,100,100,100);
    	  labelC = new JLabel();
    	  labelC.setBounds(500,100,100,100);
    	  labelD = new JLabel();
    	  labelD.setBounds(650,100,100,100);
    	  labelResult = new JLabel();
    	  labelResult.setFont(new Font("돋움", Font.BOLD, 30));
    	  labelResult.setBounds(300,200,200,300);
    	  labelScore=new JLabel();
    	  labelScore.setFont(new Font("돋움", Font.BOLD, 50));
    	  labelScore.setBounds(350,100,200,300);
    	  labelPlayerA=new JLabel();
    	  labelPlayerA.setFont(new Font("돋움", Font.BOLD, 30));
    	  labelPlayerA.setBounds(100,0,100,100);
    	  labelPlayerB=new JLabel();
    	  labelPlayerB.setFont(new Font("돋움", Font.BOLD, 30));
    	  labelPlayerB.setBounds(550,0,100,100);
    	  
    	scanner = new Scanner(System.in);
  		System.out.println("플레이어 A의 이름을 입력하세요. ");
  		APlayerName = scanner.nextLine();
  		System.out.println("플레이어 B의 이름을 입력하세요. ");
  		BPlayerName = scanner.nextLine();
        Player p1 = new Player(APlayerName);
        Player p2 = new Player(BPlayerName);
        
        p1.play();
        labelA.setIcon(Icon[p1.num1-1]);
        labelB.setIcon(Icon[p1.num2-1]);
        
        p2.play();
        labelC.setIcon(Icon[p2.num1-1]);
        labelD.setIcon(Icon[p2.num2-1]);
        if (p1.getNum() > p2.getNum()) {
            
            labelResult.setText(p1.getName() + " win");
            p1win++;
        }
        else if (p1.getNum() == p2.getNum()) {
            
            labelResult.setText(" draw");
        }
        else{
        
            labelResult.setText(p2.getName() + " win");
            p2win++;
        }
        labelScore.setText(p1win + ":"+ p2win);
        labelPlayerA.setText(p1.getName());
        labelPlayerB.setText(p2.getName());
        
        ct.add(labelA);
        ct.add(labelB);
        ct.add(labelC);
        ct.add(labelD);
        ct.add(labelResult);
        ct.add(labelScore);
        ct.add(labelPlayerA);
        ct.add(labelPlayerB);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }




public static void main(String[] args){
DiceGame dg=new DiceGame();
dg.startGame();
 }


}