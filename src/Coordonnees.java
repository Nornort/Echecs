public class Coordonnees {
    private int ligne;
    private int colonne;
    /*
        CONSTRUCTEUR
        @param prend en paramètre les numéros de ligne et de colonne
    */
    Coordonnees (int ligne, int colonne){
        this.ligne = ligne;
        this.colonne = colonne;
    }
    //Getters
    int getLigne(){
        return ligne;
    }

    int getColonne(){
        return colonne;
    }

    //Setters
    public void setLigne(int ligne){
        this.ligne = ligne;
    }

    public void setColonne(int colonne){
        this.colonne = colonne;
    }
}
