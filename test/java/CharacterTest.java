import org.testng.annotations.Test;
import rpg.*;

public class CharacterTest {

    @Test
    public void CharacterTest()
    {
        character c = new character("Jean", "rogue");
        c.attack("attaque cool");

        System.out.println(" ");

        System.out.println(c.getName());
        System.out.println(c.getRpgClass());
        System.out.println(c.getLife());
        System.out.println(c.getAgility());
        System.out.println(c.getStrength());
        System.out.println(c.getWit());
    }
}
