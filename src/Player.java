import java.awt.*;

public class Player {
    public static int playerX = 100;
    public static int playerY = 100;

    public static int playerVelX;
    public static int playerVelY;

    public static char playerWalkDirection;

    boolean sus = true;

    public void tick(){
        playerX += playerVelX;
        playerY += playerVelY;

        findDirection();

        playerX = clamp(playerX,0 + 1 , 623 - 11);
        playerY = clamp(playerY,0 + 1, 437 - 11);
    }

    public void render(Graphics g){
        g.setColor(Color.BLUE);
        g.drawRect(playerX, playerY, 10, 10);
    }

    public static int clamp(int var, int min, int max){
        if(var >= max)
            return var = max;
        else if(var <= min)
            return var = min;
        else
            return var;
    }

    public void findDirection(){
        while(sus) {

            //W = N, D = E, S = S, A = W

            //N E S W, N E W , N W, N E, N S
            //S E W, S W, S E
            //W N S
            //E N S

            if (KeyInput.N && KeyInput.E && KeyInput.S && KeyInput.W) { // N E S W
                Player.playerWalkDirection = 'B';
                break;
            }  if(KeyInput.N && KeyInput.E && KeyInput.W){ // N E W
                Player.playerWalkDirection = 'N';
                break;
            }  if(KeyInput.N && KeyInput.E){ // N E
                Player.playerWalkDirection = 'T';
                break;
            }  if(KeyInput.N && KeyInput.W) { //N W
                Player.playerWalkDirection = 'F';
                break;
            }  if(KeyInput.S && KeyInput.E && KeyInput.W) { //S E W
                Player.playerWalkDirection = 'S';
                break;
            }  if(KeyInput.S && KeyInput.W) { //S W
                Player.playerWalkDirection = 'G';
                break;
            }  if(KeyInput.S && KeyInput.E) { //S E
                Player.playerWalkDirection = 'H';
                break;
            }  if(KeyInput.N) { //N
                Player.playerWalkDirection = 'N';
                break;
            } if(KeyInput.W) { //W
                Player.playerWalkDirection = 'W';
                break;
            } if(KeyInput.S) { //S
                Player.playerWalkDirection = 'S';
                break;
            }  if(KeyInput.E) { //E
                Player.playerWalkDirection = 'E';
                break;
            } else {
                break;
            }
        }
    }
}
