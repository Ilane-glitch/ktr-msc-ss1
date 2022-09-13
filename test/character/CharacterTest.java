package character;

import org.testng.annotations.Test;
import src.rpg.*;

public class CharacterTest {

    @Test
    public void CTest()
    {
        character c = new character("Jean", "rogue");
        c.attack("fist");

        System.out.println();

        System.out.println(c.getName());
        System.out.println(c.getRpgClass());
        System.out.println(c.getLife());
        System.out.println(c.getAgility());
        System.out.println(c.getStrength());
        System.out.println(c.getWit());
    }

    @Test
    public void MTest()
    {
        mage m = new mage("Jean", "mage");
        m.attack("wand");
        m.attack("hammer");
        System.out.println();

        System.out.println(m.getName());
        System.out.println(m.getRpgClass());
        System.out.println(m.getLife());
        System.out.println(m.getAgility());
        System.out.println(m.getStrength());
        System.out.println(m.getWit());
    }

    @Test
    public void WTest()
    {
        warrior w = new warrior("Jean", "warrior");
        w.attack("sword");
        w.attack("staff");
        System.out.println();

        System.out.println(w.getName());
        System.out.println(w.getRpgClass());
        System.out.println(w.getLife());
        System.out.println(w.getAgility());
        System.out.println(w.getStrength());
        System.out.println(w.getWit());
    }

    @Test
    public void WalkTest()
    {
        character c = new character();
        c.moveLeft();
        c.moveRight();
        c.moveForward();
        c.moveBack();
    }
}
