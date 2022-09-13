package src.rpg;

public class warrior extends character{

    /** constructeur**/
    public warrior(){}

    public warrior(String name, String rpgClass)
    {
        super(name,rpgClass);
        this.setRpgClass("Warrior");
        this.setLife(100);
        this.setStrength(10);
        this.setAgility(3);
        this.setWit(3);

        System.out.println(this.getName()+" : contemple ma force !");
    }

    @Override
    public void moveRight() // adaptation de la methode de deplacement pour le guerrier
    {
        System.out.println(this.getName()+ " se déplace sur la droite de façon virile.");
    }

    @Override
    public void moveLeft()
    {
        System.out.println(this.getName()+ " se déplace sur la gauche de façon virile.");
    }

    @Override
    public void moveForward()
    {
        System.out.println(this.getName()+ " avance de quelques pas de façon virile.");
    }

    @Override
    public void moveBack()
    {
        System.out.println(this.getName()+ " recule de quelques pas de façon virile.");
    }


    /** metthode **/
    @Override
    public void attack(String weapon) // methode attaque rééecrite au besoin
    {
        if (weapon.equals("hammer") || weapon.equals("sword")) // test si l'arme est bonne
        {
            System.out.println(this.getName() + " utilise " + weapon); // oui
        }
        else System.out.println(this.getName()+ ": je vais pas pouvoir faire grand chose sans arme... "); //non
    }
}
