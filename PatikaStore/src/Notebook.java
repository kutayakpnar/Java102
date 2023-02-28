public class Notebook extends Devices {
    private double ram;
    private double gpu;

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getGpu() {
        return gpu;
    }

    public void setGpu(double gpu) {
        this.gpu = gpu;
    }

    public Notebook(int id, double price, double discountRate, double stock, String name, Brand brand, double ram, double gpu) {
        super(id, price, discountRate, stock, name, brand);
        this.ram = ram;
        this.gpu = gpu;
    }
}
