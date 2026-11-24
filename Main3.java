
class Device {
    String powerSource = "x";

    void turnOn() {
        System.out.println("Device Powered on");
    }
}

class Mobile extends Device {
    double screenSize = 44.67;

    void makecall() {
        System.out.println(screenSize);
    }
}

class Android extends Mobile {
    void openPlayStore() {
        turnOn();
        makecall();
    }
}

class Iphone extends Mobile {
    void openAppStore() {
        turnOn();
        makecall();
    }
}

public class Main3 {
    public static void main(String[] args) {

        Android a = new Android();
        a.openPlayStore();

        Iphone i = new Iphone();
        i.openAppStore();
    }
}
