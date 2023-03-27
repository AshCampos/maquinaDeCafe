
package poo.unam.mx;


public class CafeteraDriver {
    public static void main(String[] args) {
        Cafetera cafesito = new Cafetera();
        System.out.println("Maquina de café");
        cafesito.setAgua(5000);
        cafesito.setCafe(1000);
        cafesito.setCrema(1500);
        cafesito.setVasos(50);
        
        System.out.println("Recursos de la cafetera: "+ cafesito);
        cafesito.restantes();
        
        while(cafesito.americano());
        System.out.println("Recursos de la cafetera: " + cafesito);
           
    }
}
