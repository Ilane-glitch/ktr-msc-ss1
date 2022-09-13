package src.rpg;

public class mage extends character {

    /** Constructeur **/
    public mage(){}

    public mage(String name, String rpgClass)
    {
        super(name,rpgClass);
        this.setRpgClass("Mage");
        this.setLife(70);
        this.setStrength(3);
        this.setAgility(10);
        this.setWit(10);

        System.out.println(this.getName()+" : ressent la force !");
    }

    /** methode**/
    @Override
    public void moveRight()
    {
        System.out.println(this.getName()+ " se déplace sur la droite avec agilité.");
    }

    @Override
    public void moveLeft()
    {
        System.out.println(this.getName()+ " se déplace sur la gauche avec agilité.");

    }

    @Override
    public void moveForward()
    {
        System.out.println(this.getName()+ " avance de quelques pas avec agilité.");

    }

    @Override
    public void moveBack()
    {
        System.out.println(this.getName()+ " recule de quelques pas avec agilité.");

    }
    @Override
    public void attack(String weapon) // méthode attaque réécrite
    {
        if (weapon.equals("magic") || weapon.equals("wand")) // test si l'arme utilisée est la bonne
        {
            System.out.println(this.getName() + " utilise " + weapon); // oui
        }
        else System.out.println(this.getName()+ ": je vais pas pouvoir faire grand chose sans arme... "); // non
    }
}
