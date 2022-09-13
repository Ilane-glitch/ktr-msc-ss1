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
