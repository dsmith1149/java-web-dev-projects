public class Laptop extends Computer {
    private final String weight;
    private final boolean touchscreen;
    private final double batteryLife;

    public Laptop(String brand, String model, String OS, int storage, int RAM, String weight, boolean touchscreen, double batteryLife) {
        super(brand, model, OS, storage, RAM);
        this.weight = weight;
        this.touchscreen = touchscreen;
        this.batteryLife = batteryLife;
    }

    @Override
    public void getSpecs() {
        super.getSpecs();
        System.out.println("Weight: " + weight + "\n" +
                "Touchscreen: " + touchscreen + "\n" +
                "Battery Life: " + batteryLife + " hours");
    }
}
