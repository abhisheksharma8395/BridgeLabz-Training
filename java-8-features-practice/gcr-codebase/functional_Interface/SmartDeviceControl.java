package functional_interface;

public class SmartDeviceControl {
    public static void main(String[] args) {
        // Creating the objects of Light , AC and TV class
        Light light = new Light();
        AC ac = new AC();
        TV tv = new TV();

        // Calling the methods turnOn and turnOff for each object
        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();

        tv.turnOn();
        tv.turnOff();
    }
}

// Interface
interface DeviceBehaviour{
    // Abstract method
    void turnOn();
    void turnOff();
}

// Light class implementing the interface DeviceBehaviour
class Light implements DeviceBehaviour{

    @Override
    public void turnOn() {
        System.out.println("Lights turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights turned off");
    }
}

// AC class implementing the interface DeviceBehaviour
class AC implements DeviceBehaviour{

    @Override
    public void turnOn() {
        System.out.println("AC turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("AC turned off");
    }
}

// TV class implementing the interface DeviceBehaviour
class TV implements DeviceBehaviour{

    @Override
    public void turnOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off");
    }
}
