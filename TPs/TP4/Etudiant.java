
public class Etudiant extends Personne {

    protected int numeroEtudiant;

    public Etudiant(String nom, int age, int numeroEtudiant) {
        super(nom, age);
        this.numeroEtudiant = numeroEtudiant;
    }
}
