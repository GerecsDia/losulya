import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.MainController;

public class testWeight {
    MainController mc;

    @BeforeEach
    public void initEach() {
        mc = new MainController();
    }

    // Első tesztünk
    @Test
    public void testCalcWeight01() {
        double actual = mc.calcWeight(30, 35);
        double expected = 2.6521848951755493;
        assertEquals(expected, actual);
    }
    // Második tesztünk

    @Test
    public void testCalcWeight02() {
        double actual = mc.calcWeight(130, 135);
        double expected = 192.0939631220005;
        assertEquals(expected, actual, 0.01);    //delta érték: megengedett eltérés
    }

    @Test
    public void testCalcWeight03() {

        double actual = mc.calcWeight(150, 160);
        double expected = 303.1068451629199;
        assertEquals(expected, actual);
    }

}
