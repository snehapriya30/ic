
interface SmartDevice {
    void connectWifi();
    default void deviceStatus() {
        System.out.println("Smart device is ready");
    }
}
class SmartTV implements SmartDevice {

    @Override
    public void connectWifi() {
        System.out.println("Smart TV connected to WiFi");
    }
}
class SmartWatch implements SmartDevice {

    @Override
    public void connectWifi() {
        System.out.println("Smart Watch connected to WiFi");
    }
}
public class Task28 {

    public static void main(String[] args) {
        SmartDevice tv = new SmartTV();
        tv.connectWifi();
        tv.deviceStatus();
        SmartDevice watch = new SmartWatch();
        watch.connectWifi();
        watch.deviceStatus();
    }
}
