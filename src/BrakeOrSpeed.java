public class BrakeOrSpeed {
    public static void AccORBrake(car c1, road r1){
        double Accelerate = c1.getSpeed()*r1.getLightduration() + c1.getPositiveacceleration()*Math.pow(r1.getLightduration(), 2)/2;
        double t = c1.getSpeed()/c1.getNegativeacceleration();
        double Brake = c1.getSpeed()*t-(c1.getNegativeacceleration()*Math.pow(t, 2)/2);
        if(Accelerate>=c1.getDistance()+r1.getWidth())
            System.out.println("Accelerate");
        else if(Brake<=c1.getDistance())
            System.out.println("Brake!");
        else
            System.out.println("Its over");
    }

    public static void ForMax(car c1, road r1, int MaxSpeed){
        double MS = MaxSpeed*1000/3600;
        double t = (MS-c1.getSpeed())/c1.getPositiveacceleration();
        double Accelerate;
        if(t>r1.getLightduration()) // This is when yellow light holds greater than car could reach Max Speed.
            Accelerate = c1.getSpeed()*r1.getLightduration() + c1.getPositiveacceleration()*Math.pow(r1.getLightduration(), 2)/2;
        else
            Accelerate = (c1.getSpeed()*t + c1.getPositiveacceleration()*Math.pow(t, 2)/2) + MS*(r1.getLightduration()-t);
        double whenBraking = c1.getSpeed()*t-(c1.getNegativeacceleration()*Math.pow(t, 2)/2);
        if(c1.getSpeed()>MS||whenBraking<=c1.getDistance() )
            System.out.println("Brake");
        else if(Accelerate>=c1.getDistance()+r1.getWidth())
            System.out.println("Accelerate");
        else
            System.out.println("Its over");

    }
    public static void ForTwoCars(car c1, car c2, road r1, double distance ){
        double Acceleratec1 = c1.getSpeed()*r1.getLightduration() + c1.getPositiveacceleration()*Math.pow(r1.getLightduration(), 2)/2;
        double Acceleratec2 = c2.getSpeed()*r1.getLightduration() + c2.getPositiveacceleration()*Math.pow(r1.getLightduration(), 2)/2;
        double t1 = c1.getSpeed()/c1.getNegativeacceleration();
        double t2 = c1.getSpeed()/c2.getNegativeacceleration();
        double Brake1 = c1.getSpeed()*t1-(c1.getNegativeacceleration()*Math.pow(t1, 2)/2);
        double Brake2 = c2.getSpeed()*t2-(c2.getNegativeacceleration()*Math.pow(t2, 2)/2);
        if(Acceleratec1>=c1.getDistance()+r1.getWidth())
            System.out.println("Accelerate car 1");
        else if(Brake1<=c1.getDistance())
            System.out.println("Brake!");
        if(c1.getSpeed()>c2.getSpeed()&&c1.getPositiveacceleration()>c2.getPositiveacceleration()&&Acceleratec2>=c1.getDistance()+distance+r1.getWidth())
            System.out.println("Accelerate car 2");
        else  System.out.println("Brake car 2");






    }



}
