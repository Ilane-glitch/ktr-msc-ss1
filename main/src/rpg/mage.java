package src.rpg;

import src.exceptions.weaponException;

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

    public void tryAtk(String weapon) throws weaponException // methode d'attaque avec utilisation d'exceptions
    {
        if (weapon.equals(""))
            throw new weaponException(this.getName()+ " : Je ne peux pas malheureusement  pas me battre a main nues.");
        else if (weapon.equals("magic") || weapon.equals("wand")) {
            System.out.println(this.getName() + ":  utilise " + weapon);
        }
        else throw new weaponException(this.getName()+ " : je ne pas me servir de " + weapon + " ...");
    }

    @Override
    public void moveRight() // adaptation de la methode de deplacement pour le mage
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
    public void attack(String weapon) // méthode attaque réécrite pour le mage
    {
        if (weapon.equals("magic") || weapon.equals("wand")) // test si l'arme utilisée est la bonne
        {
            System.out.println(this.getName() + " utilise " + weapon); // oui
        }
        else System.out.println(this.getName()+ ": je vais pas pouvoir faire grand chose sans arme... "); // non
    }
}
