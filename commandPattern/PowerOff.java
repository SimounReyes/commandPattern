package commandPattern;

public class PowerOff implements Command {

    private Button botton;

    public PowerOff(Button botton) {
        this.botton = botton;
    }

    @Override
    public String execute() {
        return botton.powerOff();
    }
}