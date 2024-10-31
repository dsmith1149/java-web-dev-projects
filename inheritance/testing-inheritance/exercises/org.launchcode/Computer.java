public class Computer {
    private final String brand;
    private final String model;
    private final String OS;
    private final int storage;
    private final int RAM;

    public Computer(String brand, String model, String OS, int storage, int RAM) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.storage = storage;
        this.RAM = RAM;
    }

    public void getSpecs() {
        System.out.println("Brand: " + brand + "\n"
                + "Model: " + model + "\n"
                + "Operating System: " + OS + "\n"
                + "Storage: " + storage + " GB\n"
                + "RAM: " + RAM + " GB");
    }
}
