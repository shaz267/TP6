import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    private ArrayList<Hifi> hifis;

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

        for (int i = 0; i < this.hifis.size(); i++){

            this.hifis.get(i).allumer();
        }
    }

    public void ajouterHifi(Hifi hifi){

        this.hifis.add(hifi);
    }

    public void activerHifi(int indiceHifi){

        this.hifis.get(indiceHifi).allumer();
    }

    public void desactiverHifi(int indiceHifi){

        this.hifis.get(indiceHifi).eteindre();
    }

    public String toString(){

        String rep = "";
        for (int i = 0; i < this.lampes.size(); i++){

            rep += this.lampes.toString() + "\n";
        }

        for (int i = 0; i < this.hifis.size(); i++){

            rep += this.hifis.toString() + "\n";
        }

        return rep;
    }

    public ArrayList<Lampe> getLampes() {
        return lampes;
    }
}
