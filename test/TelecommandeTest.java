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

        assertEquals();

    }

}
