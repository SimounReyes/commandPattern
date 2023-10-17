package commandPattern;

public class PowerOn implements Command {

    private Button button;

    public PowerOn(Button button) {
        this.button = button;
    }

    @Override
    public String execute() {
        return button.powerOn();
    }
}
