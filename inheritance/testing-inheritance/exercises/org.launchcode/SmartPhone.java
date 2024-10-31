public class SmartPhone extends Computer {
    private final double cameraResolution;
    private final boolean new5G;
    private final String size;

    public SmartPhone(String brand, String model, String OS, int storage, int RAM, double cameraResolution, boolean new5G, String size) {
        super(brand, model, OS, storage, RAM);
        this.cameraResolution = cameraResolution;
        this.new5G = new5G;
        this.size = size;
    }

    @Override
    public void getSpecs() {
        super.getSpecs();
        System.out.println("Camera Resolution: " + cameraResolution + " MP\n" +
                "5G: " + new5G + "\n" +
                "Size: " + size);
    }
}
