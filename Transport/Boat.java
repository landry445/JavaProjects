package Transport;

public class Boat extends Vehicle {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    // Implémentation de la méthode doStuff()
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
}