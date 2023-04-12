public class ChemineeAdaptateur implements Appareils{

    private Cheminee cheminee;

    public ChemineeAdaptateur(){

        cheminee = new Cheminee();
    }

    public void allumer(){

        this.cheminee.changerIntensite(this.cheminee.getLumiere() + 10);
    }

    public void eteindre(){

        this.cheminee.changerIntensite(0);
    }

    public String toString(){

        return("Cheminee : " + this.cheminee.getLumiere());
    }
}
