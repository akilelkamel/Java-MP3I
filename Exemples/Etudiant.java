
public class Etudiant {
    //Attributes ou proprietes
    int numInscription;
    String nom;
    String filiere;
    int niveau;

    //Constructeur
    public Etudiant(int ni, String n, String f, int niv) {
        numInscription = ni;
        nom = n;
        filiere = f;
        niveau = niv;
    }

    //une simple procedure pour afficher les info d'un etudiant
    void afficher(){
        System.out.println("NUM INSC: " + numInscription);
        System.out.println("NOM : " + nom);
        System.out.println("FILIERE : " + filiere);
        System.out.println("NIVEAU : " + niveau);
    }
}
