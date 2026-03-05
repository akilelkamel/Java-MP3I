
public class CompteBancaire {
    private String nom;
    private int solde;

    public CompteBancaire(String n, int s) {
        nom = n;
        solde = s;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        nom = n;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int s) {
        solde = s;
    }
    
    public void depot(int mt){
        solde = solde + mt; // solde += mt;
    }
    
    public void retrait(int mt){
        solde = solde - mt; // solde -= mt;
    }
    
}
