package SHA;

public class Plus implements Command {

    private Button botton;

    public Plus(Button botton) {
        this.botton = botton;
    }

    @Override
    public String execute() {
        return botton.plus();
    }
}
