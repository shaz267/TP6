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

        t.ajouterLampe(l);

        assertEquals(1, t.getLampes().size(), "La lampe doit contenir un seul élément");

    }

    @Test
    public void TestAjoutNonVide() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");
        Lampe l2 = new Lampe("Lef");

        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        assertEquals(2, t.getLampes().size(), "La lampe doit contenir un seul élément");

    }

    @Test
    public void TestActivation0() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");
        t.ajouterLampe(l);

        t.activerLampe(0);

        assertEquals(true, l.isAllume(), "La lampe doit etre allumé");

    }

    @Test
    public void TestActivation1() {

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Laf");
        Lampe l2 = new Lampe("Lef");
        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        t.activerLampe(1);

        assertEquals(true, l.isAllume(), "La lampe doit etre allumé");

    }

    @Test
    public void TestActivationInexi() {

        Telecommande t = new Telecommande();

        t.activerLampe(0);

        assertEquals(null, t.getLampes().get(0).isAllume(), "La lampe doit etre inexistante");

    }

}
