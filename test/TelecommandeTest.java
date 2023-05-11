import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {


    @Test
    public void TestAjoutVide() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");

        t.ajouterAppareil(l);

        assertEquals(1, t.getAppareils().size(), "La lampe doit contenir un seul élément");

    }

    @Test
    public void TestAjoutNonVide() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");
        Lampe l2 = new Lampe("Lef");

        t.ajouterAppareil(l);
        t.ajouterAppareil(l2);

        assertEquals(2, t.getAppareils().size(), "La lampe doit contenir un seul élément");

    }

    @Test
    public void TestActivation0() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");
        t.ajouterAppareil(l);

        t.activerAppareil(0);

        assertEquals(true, l.isAllume(), "La lampe doit etre allumé");

    }

    @Test
    public void TestActivation1() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");
        Lampe l2 = new Lampe("Lef");
        t.ajouterAppareil(l);
        t.ajouterAppareil(l2);

        t.activerAppareil(1);

        assertEquals(true, l2.isAllume(), "La lampe doit etre allumé");

    }

    @Test
    public void TestActivationInex() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");
        t.ajouterAppareil(l);

        try{
            t.activerAppareil(1);
        }
        catch (IndexOutOfBoundsException i){

            assertEquals(false, l.isAllume(), "aucune lampe ne doit etre allumé");
        }


        assertEquals(false, l.isAllume(), "aucune lampe ne doit etre allumé");

    }


}
