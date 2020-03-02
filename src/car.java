public class car {
    private int speed;
    private int distance;
    private int positiveacceleration;
    private int negativeacceleration;

    public car(int speed, int distance, int positiveacceleration, int negativeacceleration) {
        if(speed<20 || speed>80){
            throw new Error("Speed is Wrong");
        }
        if(distance<10 || distance>150){
            throw new Error("Distance is Wrong");
        }
        if(positiveacceleration<1 || positiveacceleration>3){
            throw new Error("Positive Acceleration is Wrong");
        }
        if(negativeacceleration<1 || negativeacceleration>3){
            throw new Error("Negative Acceleration is Wrong");
        }

        this.speed = speed;
        this.distance = distance;
        this.positiveacceleration = positiveacceleration;
        this.negativeacceleration = negativeacceleration;
    }

    public int getSpeed() {
        return speed*1000/3600;
    }

    public int getDistance() {
        return distance;
    }

    public int getPositiveacceleration() {
        return positiveacceleration;
    }

    public int getNegativeacceleration() {
        return negativeacceleration;
    }
}
