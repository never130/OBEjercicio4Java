public class SmartDevice {

    public String fabricante;
    public String modelo;
    public String color;
    public int year;
    public boolean bluetooth;


    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, String color, int year,boolean bluetooth){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.bluetooth = bluetooth;

    }



}
