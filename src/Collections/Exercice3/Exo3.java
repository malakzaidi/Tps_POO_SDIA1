package Collections.Exercice3;
import java.util.Set;
import java.util.HashSet;
public class Exo3 {
        public static void main(String[] args) {
            // 1. Création de deux HashSets
            Set<String> groupeA = new HashSet<>();
            Set<String> groupeB = new HashSet<>();
            // 2. Ajout de noms d'étudiants
            groupeA.add("Ali");
            groupeA.add("Sara");
            groupeA.add("Youssef");
            groupeA.add("Nadia");

            groupeB.add("Youssef");
            groupeB.add("Fatima");
            groupeB.add("Nadia");
            groupeB.add("Mohammed");

            // 3. Intersection des deux HashSets
            Set<String> intersection = new HashSet<>(groupeA);
            intersection.retainAll(groupeB);
            System.out.println("Intersection des deux groupes : " + intersection);

            // 4. Union des deux HashSets
            Set<String> union = new HashSet<>(groupeA);
            union.addAll(groupeB);
            System.out.println("Union des deux groupes : " + union);
        }
    }


