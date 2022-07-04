import java.awt.*;
import java.awt.image.BufferStrategy;

public class Main extends Canvas implements Runnable {

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    private Thread thread;
    private boolean running = false;

    int FPS;

    Line line = new Line();
    Player player = new Player();

    public Main(){
        this.addKeyListener(new KeyInput());

        new Window(WIDTH, HEIGHT, "2.5D", this);
    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }

    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running)
                render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println("FPS: " + frames);
                FPS = frames;
                frames = 0;
            }
        }
        stop();
    }

    public void tick(){
        player.tick();
    }

    public void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);

            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // True Width: 623 True Height: 437
        g.setColor(Color.WHITE);

        g.drawLine(623, 0 , 623, 437);
        g.drawLine(0, 437 , 623, 437);
        g.drawLine(0, 0 , 0, 437);
        g.drawLine(0, 0 , 623, 0);

        g.drawString("FPS: " + FPS, 560, 430);

        line.drawLine(20, 20, 80, 20, WallID.UNPASSABLE, g);
        line.drawLine(20, 20, 20, 80, WallID.UNPASSABLE, g);
        line.drawLine(20, 80, 80, 80, WallID.UNPASSABLE, g);
        line.drawLine(80, 20, 80, 80, WallID.UNPASSABLE, g);
        //line.drawLine(200, 200, 400, 400, WallID.UNPASSABLE, g);
        //g.setColor(Color.WHITE);
        //g.drawLine(201, 201, 201, 201);
        //line.drawLine(200, 400, 400, 200, WallID.UNPASSABLE, g);

        /*
        line.drawLine(100, 200, 100, 300, WallID.UNPASSABLE, g);
        line.drawLine(100, 200, 175, 125, WallID.UNPASSABLE, g);
        line.drawLine(175, 125, 275, 125, WallID.PASSABLE, g);
        line.drawLine(275, 125, 350, 200, WallID.UNPASSABLE, g);
        line.drawLine(350, 200, 350, 300, WallID.UNPASSABLE, g);
        line.drawLine(275, 375, 350, 300, WallID.UNPASSABLE, g);
        line.drawLine(175, 375, 275, 375, WallID.UNPASSABLE, g);
        line.drawLine(100, 300, 175, 375, WallID.UNPASSABLE, g);
         */

        //line.drawLine(100, 100, 200, 300, WallID.UNPASSABLE, g);
        line.drawLine(200, 200, 400, 400, WallID.UNPASSABLE, g);
        player.render(g);

        g.dispose();
        bs.show();
    }
}
