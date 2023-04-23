public class Tank {
    public int position;

    public void goForward(int pos){
        this.position += pos;
    }

    public void goBackward(int pos){
        this.position -= pos;
    }

    public void printPosition(){
        System.out.println("The Tank is at " + position + " now.");
    }
}


