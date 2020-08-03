

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
       Main window = new Main();
       window.run();
      
    }

    public class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }

        @Override
        public void paint(Graphics g){

            for(int i = 10; i < 710; i+=35){
                for(int j = 10; j <710; j+=35){
                g.setColor(Color.WHITE);            
                g.fillRect(i, j, 35, 35);
                g.setColor(Color.BLACK);
                g.drawRect(i, j, 35, 35);
             }
            }
            if(getMousePosition() != null){
                g.setColor(Color.RED);
                g.fillOval((int)getMousePosition().getX()-5, (int)getMousePosition().getY()-5, 10, 10);
            }
           
    }
}


    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run(){
        while(true){
            this.repaint();
        }
    }

    }


//task 4

    //public class Grid(){

    

   // public class Cell(){

