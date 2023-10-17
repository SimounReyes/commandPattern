package SHA;

public class PowerOn implements Command {

    private Button botton;

    public PowerOn(Button botton) {
        this.botton = botton;
    }

    @Override
    public String execute() {
        return botton.powerOn();
    }
}
