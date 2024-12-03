package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class TeslaBot extends Tesla {
    private String bot;

    public TeslaBot(String info, String guides, String bot) {
        super(info, guides);
        this.bot = bot;
    }

    public String getBot() {
        return bot;
    }

    public void setBot(String bot) {
        this.bot = bot;
    }

    @Override
    public String toString() {
        return "TeslaBot{" +
                "bot='" + bot + '\'' +
                ", info='" + info + '\'' +
                ", guides='" + guides + '\'' +
                '}';
    }
}
