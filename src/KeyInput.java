import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    public static boolean N;
    public static boolean E;
    public static boolean S;
    public static boolean W;

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        //KeyEvent Player

        if(key == KeyEvent.VK_W){
            //Player.playerWalkDirection = 'N';
            Player.playerVelY = - 5;
            N = true;

        }

        if(key == KeyEvent.VK_A){
            //Player.playerWalkDirection = 'W';
            Player.playerVelX = - 5;
            W = true;
        }

        if(key == KeyEvent.VK_S){
            //Player.playerWalkDirection = 'S';
            Player.playerVelY = 5;
            S = true;
        }

        if(key == KeyEvent.VK_D){
            //Player.playerWalkDirection = 'E';
            Player.playerVelX = 5;
            E = true;
        }

        if(key == KeyEvent.VK_ESCAPE) System.exit(0);
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        //KeyEvent Player

        if(key == KeyEvent.VK_W){
            N = false;
            Player.playerVelY = 0;
        }

        if(key == KeyEvent.VK_A){
            W = false;
            Player.playerVelX = 0;
        }

        if(key == KeyEvent.VK_S){
            S = false;
            Player.playerVelY = 0;
        }

        if(key == KeyEvent.VK_D){
            E = false;
            Player.playerVelX = 0;
        }
    }
}
