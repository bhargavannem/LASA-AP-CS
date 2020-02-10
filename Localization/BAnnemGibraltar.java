public class BAnnemGibraltar extends AbstractLocale {
    public BAnnemGibraltar() {
        super("Gibraltar", "English");
    }

    @Override
    public String getGreeting() {
        // TODO Auto-generated method stub
        return "Hello!";
    }

    @Override
    public String getCurrencySymbol() {
        // TODO Auto-generated method stub
        return "£";
    }

    @Override
    public String getLocalTime(int hour, int min) {
        int temp = (hour + 8) % 24;
        return String.format("%d:%02d", temp, min);
    }

    @Override
    public double getCurrencyValue(double dollarAmount) {
    return dollarAmount * 0.780634;
    }

}