public class SmartPhone extends SmartDevice {
    public boolean smsAndCalls;
    public boolean apps;
    public int memory;
    public int addMemory;

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, String color, int year, boolean bluetooth, boolean smsAndCalls, boolean apps, int memory, int addMemory) {
        super(fabricante, modelo, color, year, bluetooth);
        this.smsAndCalls = smsAndCalls;
        this.apps = apps;
        this.memory = memory;
        this.addMemory = addMemory;
    }

    public void addMemory(int quantity){
        this.addMemory += quantity;
    }
}
