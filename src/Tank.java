public class Tank {
    int x,y;
    int dir;
    int fuel = 100;

    public Tank(){

    }

    public Tank(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Tank(int x, int y, int fuel){
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public void goForward(int i) {
        if (fuel >= i){
            fuel -= i;
        }else {
            i = fuel;
        }
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;

    }
    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;

    }

    public void turnRight() {
        dir++;
        if (dir == -1) dir = 3;

    }

    public void goBackward(int i) {
        goForward(-i);
    }
}


