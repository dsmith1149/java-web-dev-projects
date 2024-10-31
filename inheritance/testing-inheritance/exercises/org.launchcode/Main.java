public class Main {
    public static void main(String[] args) {
        Computer pavilion = new Computer("Dell", "Pavilion", "Windows 10", 512, 16);
        System.out.println("Computer Specifications: ");
        pavilion.getSpecs();

        Laptop lenovo = new Laptop("Lenovo", "ThinkPad", "Windows 11", 1024, 16, "2.0 kg", true, 11);
        System.out.println("\nLaptop Specifications: ");
        lenovo.getSpecs();

        SmartPhone iPhone15 = new SmartPhone("Apple", "iPhone 16", "iOS", 128, 8, 2600, true, "Pro Max");
        System.out.println("\nSmartPhone Specifications: ");
        iPhone15.getSpecs();
    }
}
