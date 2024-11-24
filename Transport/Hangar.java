package Transport;

public class Hangar {
    public static void main(String[] args){
        Car myCar = new Car("Toyota", 120000);
        System.out.println(myCar.doStuff()); // Affiche : Je suis Toyota et je fais vroum vroum !

        // Création d'un bateau
        Boat myBoat = new Boat("Zodiac", 5000);
        System.out.println(myBoat.doStuff()); 
    }
}
