package Streams.Ex2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class Exercice2 {
        public static void main(String[] args) {
            // Création de la liste des employés
            List<Employe> employes = new ArrayList<>();
            employes.add(new Employe("Ali", "IT", 4500));
            employes.add(new Employe("Sara", "Finance", 5000));
            employes.add(new Employe("Youssef", "Marketing", 4000));
            employes.add(new Employe("Nadia", "IT", 6000));
            employes.add(new Employe("Mohammed", "HR", 3500));
            // 1. Somme totale des salaires
            double sommeTotaleSalaires = employes.stream()
                    .mapToDouble(Employe::getSalaire)
                    .sum();
            System.out.println("Somme totale des salaires : " + sommeTotaleSalaires);
            // 2. Trier la liste des employés par ordre alphabétique du nom
            List<Employe> employesTries = employes.stream()
                    .sorted(Comparator.comparing(Employe::getNom))
                    .toList();
            System.out.println("Employés triés par nom : " + employesTries);

            // 3. Trouver l'employé avec le salaire le plus bas
            Optional<Employe> employeSalaireMin = employes.stream()
                    .min(Comparator.comparingDouble(Employe::getSalaire));
            employeSalaireMin.ifPresent(emp -> System.out.println("Employé avec le salaire le plus bas : " + emp));
            // 4. Liste des employés ayant un salaire supérieur à une valeur donnée
            double seuilSalaire = 4000;
            List<Employe> employesFiltre = employes.stream()
                    .filter(emp -> emp.getSalaire() > seuilSalaire)
                    .toList();
            System.out.println("Employés avec un salaire > " + seuilSalaire + " : " + employesFiltre);
            // 5. Trouver l'employé avec le salaire le plus élevé
            Optional<Employe> employeSalaireMax = employes.stream()
                    .reduce((emp1, emp2) -> emp1.getSalaire() > emp2.getSalaire() ? emp1 : emp2);
            employeSalaireMax.ifPresent(emp -> System.out.println("Employé avec le salaire le plus élevé : " + emp));
            // 6. Concaténer les noms de tous les employés
            String nomsConcatenes = employes.stream()
                    .map(Employe::getNom)
                    .reduce("", (nom1, nom2) -> nom1.isEmpty() ? nom2 : nom1 + ", " + nom2);
            System.out.println("Noms de tous les employés : " + nomsConcatenes);
        }
    }

