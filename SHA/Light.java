package SHA;

public class Light implements Button{


    @Override
    public String powerOn() {

        return "The Light is powered on." ;
    }

    @Override
    public String powerOff() {
        return "The Light is powered off.";
    }

    @Override
    public String plus() {
        return "The Light's brightness has increased!";
    }

    @Override
    public String minus() {
        return "The Light's brightness has decreased!";
    }
}
