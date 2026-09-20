public class Main {
    public static void main(String[] args) {
        System.out.println("Nurzhan Zeinulla, SE-2506");

        System.out.println("Factory Method:");
        TransportFactory road = new RoadTransportFactory();
        TransportFactory sea = new SeaTransportFactory();
        road.planDelivery();
        sea.planDelivery();

        System.out.println("Abstract Factory:");
        Application windows = new Application(new WindowsFactory());
        Application mac = new Application(new MacFactory());
        windows.render();
        mac.render();
    }
}
