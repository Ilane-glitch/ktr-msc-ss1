package character;

import org.testng.annotations.Test;
import src.exceptions.weaponException;
import src.rpg.*;

public class CharacterTest {

    @Test
    public void CTest() // test statistiques du perso
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
    public void MTest() // test statistiques du mage
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
    public void WTest() // test statistique du guerrier
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
    public void WalkTest() // test marche
    {
        character c = new character();
        c.moveLeft();
        c.moveRight();
        c.moveForward();
        c.moveBack();
    }
    @Test
    public void WalkTest_2() // test marche (cas guerrier/mage)
    {
        mage m = new mage();
        warrior w = new warrior();
        m.moveLeft();
        m.moveBack();
        w.moveRight();
        w.moveForward();
    }
    @Test
    public void DegTest() // test degainer arme
    {
        mage m = new mage();
        warrior w = new warrior();

        m.degainage();
        w.degainage();
    }

    @Test
    public void ExcepMTest() throws weaponException // test Exception arme
    {
        mage m = new mage();
        try // test sans armes
        {
            m.tryAtk("");
        }
        catch (weaponException e)
        {
            System.out.println(e.getMessage());
        }

        try  // test avec arme erronée
        {
            m.tryAtk("sword");
        }
        catch (weaponException e)
        {
            System.out.println(e.getMessage());
        }

        try  // test avec une bonne arme
        {
            m.tryAtk("wand");
        }
        catch (weaponException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void ExcepWTest() throws weaponException // test Exception arme
    {
        warrior m = new warrior();
        try // test sans armes
        {
            m.tryAtk("");
        }
        catch (weaponException e)
        {
            System.out.println(e.getMessage());
        }

        try  // test avec arme erronée
        {
            m.tryAtk("sword");
        }
        catch (weaponException e)
        {
            System.out.println(e.getMessage());
        }

        try  // test avec une bonne arme
        {
            m.tryAtk("wand");
        }
        catch (weaponException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
