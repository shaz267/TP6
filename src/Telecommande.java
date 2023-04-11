import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande(){


    }

    public void ajouterLampe(Lampe lampe){

        this.lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe){

        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){

        this.lampes.get(indiceLampe).eteindre();
    }

    public void activerTout(){

        for (int i = 0; i < this.lampes.size(); i++){

            this.lampes.get(i).allumer();
        }
    }

    public String toString(){

        String rep = "";
        for (int i = 0; i < this.lampes.size(); i++){

            rep += this.lampes.toString() + "\n";
        }

        return rep;
    }

    public ArrayList<Lampe> getLampes() {
        return lampes;
    }
}
