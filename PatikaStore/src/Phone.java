public class Phone extends Devices{
    private double gb;
    private double screen;
    private double battery;

    public double getGb() {
        return gb;
    }

    public void setGb(double gb) {
        this.gb = gb;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public Phone(int id, double price, double discountRate, double stock, String name, Brand brand, double gb, double screen, double battery) {
        super(id, price, discountRate, stock, name, brand);
        this.gb = gb;
        this.screen = screen;
        this.battery = battery;
    }
}


