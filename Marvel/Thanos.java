package Marvel;

import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // Créer les héros
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        // Ajouter les héros dans une liste
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        thor.setAge(1501);

        Collections.shuffle(heroes);

        int halfSize = heroes.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            System.out.println(heroes.get(i));
        }
    }
}
