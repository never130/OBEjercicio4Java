public class Main {
    public static void main(String[] args) {

        SmartPhone samsungJ7 = new SmartPhone("samsung", "j7","black", 2019,true,true,true,200,200);

        samsungJ7.fabricante = "samsung";
        samsungJ7.addMemory(300);

        System.out.println("Nombre del fabricante: " + samsungJ7.fabricante);
        System.out.println("Nombre del modelo: " + samsungJ7.modelo);
        System.out.println("color: " + samsungJ7.color);
        System.out.println("year: " + samsungJ7.year);
        System.out.println("memoria en gigas: " + samsungJ7.memory);
        System.out.println("memoria agregada en gigas: " + samsungJ7.addMemory);

    }
}