package SHA;

public class Minus implements Command {

    private Button botton;

    public Minus(Button botton) {
        this.botton = botton;
    }

    @Override
    public String execute() {
        return botton.minus();
    }
}
