import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Line {

    int x1, y1, x2, y2;
    int checkX;
    int checkY;

    double m;
    double b;

    WallID id;

    boolean forty_five_deegre;

    String forty_five_direction;
    String direction;

    public void drawLine(int x1, int y1, int x2, int y2, WallID id,Graphics g){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.id = id;

        //WD; N E = T, WA; N W = F, SA; S W = G, SD; S E = H

        //if(Player über Linie) -> irgendwas passiert

        direction = facing();

        if(this.id == WallID.UNPASSABLE) {
            if (Objects.equals(direction, "east")) {
                if (this.x1 < this.x2) {
                    checkX = this.x1;
                    if (Player.playerX >= this.x1 && Player.playerX <= this.x2 || (Player.playerX + 10) >= this.x1 && Player.playerX <= this.x2) {
                        if (Player.playerWalkDirection == 'N') {
                            for (int x = checkX; x < this.x2 + 1; x++) {
                                if (Player.playerX == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }

                                if ((Player.playerX + 10) == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'S') {
                            for (int x = checkX; x < this.x2 + 1; x++) {
                                if (Player.playerX == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }

                                if ((Player.playerX + 10) == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'T') {
                            for (int x = checkX; x < this.x2 + 1; x++) {
                                if (Player.playerX == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }

                                if ((Player.playerX + 10) == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'F') {
                            for (int x = checkX; x < this.x2 + 1; x++) {
                                if (Player.playerX == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }

                                if ((Player.playerX + 10) == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'G') {
                            for (int x = checkX; x < this.x2 + 1; x++) {
                                if (Player.playerX == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }

                                if ((Player.playerX + 10) == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'H') {
                            for (int x = checkX; x < this.x2 + 1; x++) {
                                if (Player.playerX == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }

                                if ((Player.playerX + 10) == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }
                                checkX++;
                            }
                        }
                    }
                }
                if (this.x1 > this.x2) {
                    checkX = this.x2;
                    if (Player.playerX <= this.x1 && Player.playerX >= this.x2 || Player.playerX <= this.x1 && (Player.playerX + 10) >= this.x2) {
                        if (Player.playerWalkDirection == 'N') {
                            for (int x = checkX; x < this.x1 + 1; x++) {
                                if (Player.playerX == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }

                                if ((Player.playerX + 10) == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'S') {
                            for (int x = checkX; x < this.x1 + 1; x++) {
                                if (Player.playerX == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }

                                if ((Player.playerX + 10) == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'T') {
                            for (int x = checkX; x < this.x1 + 1; x++) {
                                if (Player.playerX == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }

                                if ((Player.playerX + 10) == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'F') {
                            for (int x = checkX; x < this.x1 + 1; x++) {
                                if (Player.playerX == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }

                                if ((Player.playerX + 10) == checkX && Player.playerY <= y1 && Player.playerY >= y1 - 5) {
                                    Player.playerY = y1 + 1;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'G') {
                            for (int x = checkX; x < this.x1 + 1; x++) {
                                if (Player.playerX == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }

                                if ((Player.playerX + 10) == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }
                                checkX++;
                            }
                        }
                        if (Player.playerWalkDirection == 'H') {
                            for (int x = checkX; x < this.x1 + 1; x++) {
                                if (Player.playerX == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }

                                if ((Player.playerX + 10) == checkX && (Player.playerY + 10) >= y1 && (Player.playerY + 10) <= y1 + 5) {
                                    Player.playerY = y1 - 11;
                                }
                                checkX++;
                            }
                        }
                    }
                }
            }

            if (Objects.equals(direction, "south")) {
                if (this.y1 < this.y2) {
                    checkY = this.y1;
                    if (Player.playerY >= this.y1 && Player.playerY <= this.y2 || (Player.playerY + 10) >= this.y1 && Player.playerY <= this.y2) {
                        if (Player.playerWalkDirection == 'E') {
                            for (int y = checkY; y < this.y2 + 1; y++) {
                                if (Player.playerY == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }

                                if ((Player.playerY + 10) == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'W') {
                            for (int y = checkY; y < this.y2 + 1; y++) {
                                if (Player.playerY == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }

                                if ((Player.playerY + 10) == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'T') {
                            for (int y = checkY; y < this.y2 + 1; y++) {
                                if (Player.playerY == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }

                                if ((Player.playerY + 10) == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'H') {
                            for (int y = checkY; y < this.y2 + 1; y++) {
                                if (Player.playerY == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }

                                if ((Player.playerY + 10) == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'F') {
                            for (int y = checkY; y < this.y2 + 1; y++) {
                                if (Player.playerY == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }

                                if ((Player.playerY + 10) == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'G') {
                            for (int y = checkY; y < this.y2 + 1; y++) {
                                if (Player.playerY == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }

                                if ((Player.playerY + 10) == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }
                                checkY++;
                            }
                        }
                    }
                }
                if (this.y1 > this.y2) {
                    checkY = this.y2;
                    if (Player.playerY <= this.y1 && Player.playerY >= this.y2 || Player.playerY <= this.y1 && (Player.playerY + 10) >= this.y2) {
                        if (Player.playerWalkDirection == 'E') {
                            for (int y = checkY; y < this.y1 + 1; y++) {
                                if (Player.playerY == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }

                                if ((Player.playerY + 10) == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'W') {
                            for (int y = checkY; y < this.y1 + 1; y++) {
                                if (Player.playerY == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }

                                if ((Player.playerY + 10) == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'T') {
                            for (int y = checkY; y < this.y1 + 1; y++) {
                                if (Player.playerY == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }

                                if ((Player.playerY + 10) == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'H') {
                            for (int y = checkY; y < this.y1 + 1; y++) {
                                if (Player.playerY == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }

                                if ((Player.playerY + 10) == checkY && (Player.playerX + 10) >= x1 && (Player.playerX + 10) <= x1 + 5) {
                                    Player.playerX = x1 - 11;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'F') {
                            for (int y = checkY; y < this.y1 + 1; y++) {
                                if (Player.playerY == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }

                                if ((Player.playerY + 10) == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }
                                checkY++;
                            }
                        }
                        if (Player.playerWalkDirection == 'G') {
                            for (int y = checkY; y < this.y1 + 1; y++) {
                                if (Player.playerY == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }

                                if ((Player.playerY + 10) == checkY && Player.playerX <= x1 && Player.playerX >= x1 - 5) {
                                    Player.playerX = x1 + 1;
                                }
                                checkY++;
                            }
                        }
                    }
                }
            }

            if (Objects.equals(direction, "45degree")) {
                if (this.y1 < this.y2) {
                    checkX = x1;
                    checkY = y1;
                    //Left
                    if (Player.playerWalkDirection == 'N') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'T') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'E') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'B') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    //Right
                    if (Player.playerWalkDirection == 'S') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'G') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'W') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'H') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'F') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                    if (Player.playerWalkDirection == 'B') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY++;
                        }
                    }
                }
                if (this.y1 > this.y2) {
                    checkX = x1;
                    checkY = y1;
                    //Right
                    if (Player.playerWalkDirection == 'N') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'F') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'W') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'T') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'G') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'F') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'B') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                Player.playerX = checkX + 2;
                                Player.playerY = checkY + 2;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    //Left
                    if (Player.playerWalkDirection == 'S') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'H') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'E') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'T') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                    if (Player.playerWalkDirection == 'B') {
                        for (int i = 1; i < ((x2 - x1) + 1); i++) {
                            if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                Player.playerX = checkX - 11;
                                Player.playerY = checkY - 11;
                            }
                            checkX++;
                            checkY--;
                        }
                    }
                }
            }

            if (Objects.equals(direction, "vertical")) {
                if(this.y1 < this.y2){
                    if(x1 > x2) {
                        System.out.println("x1 can't be higher than x2");
                        System.exit(1);
                    }
                    //y1=x1*m+b  y2=x2*m+b
                    formula();
                    checkX = x1;
                    checkY = y1;
                    if(x2 - x1 > y2 - y1) {
                        //Left
                        if(Player.playerWalkDirection == 'N') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'T') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'E') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        /*
                        if(Player.playerWalkDirection == 'H') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }

                         */
                        //Right
                        if(Player.playerWalkDirection == 'S') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'G') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'W') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'H') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'F') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'H') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                    }
                    if(x2 - x1 < y2 - y1) {
                        //Left
                        if(Player.playerWalkDirection == 'N') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'T') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'E') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY + 2;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        //Right
                        if(Player.playerWalkDirection == 'S') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'G') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'W') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'H') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'F') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkY; i < y2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY - 11;
                                }
                                checkY++;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                    }
                }

                if(this.y1 > this.y2){
                    if(x1 > x2){
                        System.out.println("x1 can't be higher than x2");
                        System.exit(1);
                    }
                    //y1=x1*m+b  y2=x2*m+b
                    formula();
                    checkX = x1;
                    checkY = y1;
                    if(x2 - x1 > y1 - y2){
                        //Right
                        if(Player.playerWalkDirection == 'N') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'F') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'W') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'T') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        //Left
                        if(Player.playerWalkDirection == 'S') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'H') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'T') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'E') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                        if(Player.playerWalkDirection == 'G') {
                            for (int i = checkX; i < x2 + 1; i++) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkX++;
                                checkY = (int) (checkX * m + b);
                            }
                        }
                    }
                    if(x2 - x1 < y1 - y2){
                        //Right
                        if(Player.playerWalkDirection == 'N') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'F') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'W') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'G') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if (Player.playerX <= checkX && Player.playerX >= (checkX - 5) && Player.playerY <= checkY && Player.playerY >= (checkY - 5)) {
                                    Player.playerX = checkX + 2;
                                    Player.playerY = checkY + 2;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        //Left
                        if(Player.playerWalkDirection == 'S') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'T') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'H') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'E') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                        if(Player.playerWalkDirection == 'B') {
                            for (int i = checkY; i > y2 - 1; i--) {
                                if ((Player.playerX + 10) >= checkX && (Player.playerX + 10) <= (checkX + 5) && (Player.playerY + 10) >= checkY && (Player.playerY + 10) <= (checkY + 5)) {
                                    Player.playerX = checkX - 11;
                                    Player.playerY = checkY - 11;
                                }
                                checkY--;
                                checkX = (int) ((checkY - b) / m);
                            }
                        }
                    }
                }
            }
        }

        render(g);
    }

    public void render(Graphics g){
        if(id == WallID.UNPASSABLE) {
            g.setColor(Color.green);
        } else if(id == WallID.PASSABLE) {
            g.setColor(Color.blue);
        }
        g.drawLine(x1, y1, x2, y2);
    }

    public String facing(){
        if(y1 == y2){
            return "east";
        }else if (x1 == x2){
            return "south";
        }else if (x1 == y2 && x2 == y1 && x1 == x2 && y1 == y2){
            return "cube";
        }else {
            forty_five();

            if(forty_five_deegre){
                return "45degree";
            } else {
                return "vertical";
            }
        }
    }

    public void forty_five(){
        if(x1 < x2 && y1 < y2){
            int xLine = x2 - x1;
            int yLine = y2 - y1;
            if(xLine == yLine) {
                forty_five_deegre = true;
                forty_five_direction = "LUp_RDown";
            }
        }
        else if(x1 < x2 && y1 > y2){
            int xLine = x2 - x1;
            int yLine = y1 - y2;
            if(xLine == yLine) {
                forty_five_deegre = true;
                forty_five_direction = "LDown_RUp";
            }
        }
        else if(x1 > x2){
            System.out.println("x1 can't be higher than x2 with a vertical line");
            System.exit(1);
        }
        else {
            forty_five_deegre = false;
        }
    }

    public void formula(){
        //y1 = x1 * m + b |-b
        //y1 - b = x1 * m |/x1
        //(y1 / x1) - (b / x1) = m

        //1 = 1 * m + b |-b
        //1 - b = 1 * m |/1
        //1 - (b / 1) = m

        //y2 = ((1 * x2) - ((b * x2)) / 1) + b

        //2 = ((1 * 3) - (b * 3)) / 1 + b
        //2 = 3 - 3b + b |-3
        //-1 = -2b |/(-2)
        //0.5  = b

        //1 - (0.5 / 1) = m
        //0.5 = m

        int x1 = this.x1;
        int y1 = this.y1;
        int x2 = this.x2;
        int y2 = this.y2;

        double q = y2 - (((double) y1 / (double) x1) * x2);
        double w = (((double) x2 / (double) x1)* -1) + 1;
        b = q / w;

        m = ((double) y1 / (double) x1) - (b / (double) x1);

        //System.out.println("y=" + m + "x+" + b);
    }
}
