package Question2;

public class Computer {
    private double wordSize;
    private double memorySize;
    private double storageSize;
    private double speed;

    public Computer(){
        wordSize = 100;
        memorySize = 100;
        storageSize = 100;
        speed = 2.0;
    }
    public Computer(double wordSize, double memorySize, double speed, double storageSize){
        this.speed = speed;
        this.memorySize= memorySize;
        this.storageSize = storageSize;
        this.wordSize = wordSize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public void setWordSize(double wordSize) {
        this.wordSize = wordSize;
    }
    public void display(){
        System.out.print("Word Size: "+wordSize+"\nMemory Size: "+memorySize+"\nStorage Size: "+storageSize+"\nSpeed: "+speed);
    }
}
