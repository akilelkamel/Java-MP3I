
public class EtudiantMaster extends Etudiant {

    private String specialite;

    public EtudiantMaster(String nom, int age, int numeroEtudiant, String specialite) {
        super(nom, age, numeroEtudiant);
        this.specialite = specialite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Numéro étudiant: " + numeroEtudiant);
        System.out.println("Spécialité: " + specialite);
    }
}
