package src.rpg;

public class character implements movable{

    /** @name : le nom du personnage **/
    private String name;
    /** @rpgClass : la classe du personnage**/
    private String rpgClass;
    /**
     * @life : la vie du personnage
     * @strength : la force du personnage
     * @agility : son agilité
     * @wit : son intelligence
     **/
    private int life, strength, agility, wit;

    /** constructeur**/
    public character(){} // constrcteur vide

    public character(String name, String rpgClass) // cnstructeur générique
    {
        this.setName(name);
        this.setRpgClass(rpgClass);
        this.setLife(50);
        this.setAgility(2);
        this.setStrength(2);
        this.setWit(2);
    }

    /** methodes **/

    public void attack(String weapon) // méthode attaque -> ovveridable selon besoin
    {
        System.out.println(this.getName() + ": voici mon coup de "+ weapon);
    }

    @Override
    public void moveRight()
    {
        System.out.println(this.getName()+ " se déplace sur la droite.");
    }

    @Override
    public void moveLeft()
    {
        System.out.println(this.getName()+ " se déplace sur la gauche.");

    }

    @Override
    public void moveForward()
    {
        System.out.println(this.getName()+ " avance de quelques pas.");

    }

    @Override
    public void moveBack()
    {
        System.out.println(this.getName()+ " recule de quelques pas.");

    }
    /** Setter **/
    public void setName(String name) {
        this.name = name;
    }

    public void setRpgClass(String rpgClass) {
        this.rpgClass = rpgClass;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    /** getter **/
    public String getName() {
        return name;
    }

    public String getRpgClass() {
        return rpgClass;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getWit() {
        return wit;
    }
}
