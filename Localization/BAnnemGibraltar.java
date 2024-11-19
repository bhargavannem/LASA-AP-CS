public class BAnnemGibraltar extends AbstractLocale {
    public BAnnemGibraltar() {
        super("Gibraltar", "English");
    }

    public BAnnemGibraltar(String Country, String Language){
        super(Country, Language);
    }
    @Override
    public String getGreeting() {
        return "Hello!";
    }

    @Override
    public String getCurrencySymbol() {
        return "£";
    }

    @Override
    public String getLocalTime(int hour, int min) {
        int temp = (hour + 8) % 24;
        return String.format("%d:%02d", temp, min);
    }

    @Override
    public double getCurrencyValue(double dollarAmount){
        return dollarAmount * 0.780634;
    }
}