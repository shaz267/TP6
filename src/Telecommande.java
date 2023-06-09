import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareils> appareils;

    public Telecommande(){

        this.appareils = new ArrayList<Appareils>();
    }

    public void ajouterAppareil(Appareils appareil){

        this.appareils.add(appareil);
    }

    public void activerAppareil(int indiceAppareil){

        this.appareils.get(indiceAppareil).allumer();
    }

    public void desactiverAppareil(int indiceAppareil){

        this.appareils.get(indiceAppareil).eteindre();
    }

    public void activerTout(){

        for (int i = 0; i < this.appareils.size(); i++){

            this.appareils.get(i).allumer();
        }
    }

    public String toString(){

        String rep = "";
        for (int i = 0; i < this.appareils.size(); i++){

            rep += this.appareils.get(i).toString() + "\n";
        }
        return rep;
    }


    public ArrayList<Appareils> getAppareils() {
        return this.appareils;
    }

    public int getNombre(){

        return this.appareils.size();
    }
}
