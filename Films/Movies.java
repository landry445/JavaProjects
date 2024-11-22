package Films;

public class Movies {
    
    public static void main(String[] args) {

        String[] movies = {
            "Les Aventuriers de l'Arche perdue",
            "Indiana Jones et le Temple maudit",
            "Indiana Jones et la Dernière Croisade"
        };
        
        String[][] moviesActors = {
            {"Harrison Ford", "Karen Allen", "Paul Freeman"},
            {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
            {"Harrison Ford", "Sean Connery", "Denholm Elliott"}
        };
        

        for (int i = 0; i < movies.length; i++) {
            
            String actors = String.join(", ", moviesActors[i]);

            System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont : " + actors);
        }
    }
}
