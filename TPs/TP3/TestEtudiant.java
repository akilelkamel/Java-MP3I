
public class TestEtudiant {

    public static void main(String[] args) {
        // Création d’un tableau d’étudiants
        Etudiant[] etudiants = new Etudiant[3];
        etudiants[0] = new Etudiant("Info-001", "Tounsi", "Ahmed", 12.53);
        etudiants[1] = new Etudiant("Electr-052", "Belhaj", "Amine", 8.67);
        etudiants[2] = new Etudiant("Math-123", "Ayadi", "Sirine", 15.08);

        // Parcours et affichage
        for (int i = 0; i < etudiants.length; i++) {
            etudiants[i].afficher();
            if (etudiants[i].admis()) {
                System.out.println("L'étudiant est admis.");
            } else {
                System.out.println("L'étudiant n'est pas admis.");
            }
            System.out.println("-----------------------------");
        }
    }
}
