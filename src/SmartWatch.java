public class SmartWatch extends SmartDevice {
    boolean cronometer;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, String color, int year, boolean bluetooth, boolean cronometer) {
        super(fabricante, modelo, color, year, bluetooth);
        this.cronometer = cronometer;
    }
}
