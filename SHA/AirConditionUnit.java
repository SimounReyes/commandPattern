package SHA;

public class AirConditionUnit implements Button {


    @Override
    public String powerOn() {
        return "The Air-Conditioning Unit is powered on.";
    }

    @Override
    public String powerOff() {
        return "The Air-Conditioning Unit is powered off.";
    }

    @Override
    public String plus() {
        return "The AC's temperature has increased!";
    }

    @Override
    public String minus() {
        return "The AC's temperature has decreased!";
    }
}
