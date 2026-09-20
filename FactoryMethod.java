interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivery by truck");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivery by ship");
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

class RoadTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Ship();
    }
}
