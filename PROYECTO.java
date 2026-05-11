package proyecto;

import java.util.ArrayList; 
import java.util.Scanner;

public class PROYECTO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<HuellaDeCarbono> lista = new ArrayList<>();

        System.out.println("--- CALCULADORA DE HUELLA DE CARBONO ---");

        System.out.print("Ingrese galones gastados por el carro: ");
        double galones = leer.nextDouble();
        lista.add(new Carro("Vehiculo", galones));

        // 2. Solo consumo para el Edificio
        System.out.print("Ingrese consumo electrico del edificio (Kwh): ");
        double kwh = leer.nextDouble();
        lista.add(new Edificio("Propiedad", kwh));

        lista.add(new Bicicleta("Generica"));

        System.out.println("\n--- REPORTE FINAL ---");
        for (HuellaDeCarbono objeto : lista) {
            System.out.println(objeto.TraerInfo() + " | Huella: " + objeto.TraerHuellaDeCarbono() + " kg CO2");
        }
    }
}
