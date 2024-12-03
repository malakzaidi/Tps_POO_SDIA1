package Tp4.Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class Exo1 {
        public static void main(String[] args) {
            List<String> mots = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

            // 1. Filtrer les mots qui contiennent la lettre "a".
            List<String> motsAvecA = mots.stream()
                    .filter(mot -> mot.contains("a"))
                    .toList();
            System.out.println("Mots contenant 'a': " + motsAvecA);

            // 2. Filtrer les mots de longueur > 3 et inverser chaque mot.
            List<String> motsInverses = mots.stream()
                    .filter(mot -> mot.length() > 3)
                    .map(mot -> new StringBuilder(mot).reverse().toString())
                    .toList();
            System.out.println("Mots inversés de longueur > 3: " + motsInverses);

            // 3. Filtrer les chaînes contenant "e" et aplatir chaque chaîne en une liste de caractères.
            List<Character> caracteresAvecE = mots.stream()
                    .filter(mot -> mot.contains("e"))
                    .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                    .toList();
            System.out.println("Caractères des mots contenant 'e': " + caracteresAvecE);

            // 4. Transformer chaque chaîne en majuscules.
            List<String> motsMajuscules = mots.stream()
                    .map(String::toUpperCase)
                    .toList();
            System.out.println("Mots en majuscules: " + motsMajuscules);

            // 5. Convertir chaque chaîne en sa longueur.
            List<Integer> longueurs = mots.stream()
                    .map(String::length)
                    .toList();
            System.out.println("Longueurs des mots: " + longueurs);

            // 6. Transformer chaque chaîne en une liste de caractères et aplatir le tout.
            List<Character> tousLesCaracteres = mots.stream()
                    .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                    .toList();
            System.out.println("Tous les caractères: " + tousLesCaracteres);

            // 7. Transformer chaque mot en "Nom - Index".
            List<String> motsAvecIndex = IntStream.range(0, mots.size())
                    .mapToObj(i -> mots.get(i) + " - " + i)
                    .toList();
            System.out.println("Mots avec index: " + motsAvecIndex);
        }
    }

