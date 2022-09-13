package rpg;

public class character {

    private String name;
    private String rpgClass;
    private int life, strength, agility, wit;

    /** constructeur**/
    public character(){}

    public character(String name, String rpgClass)
    {
        this.setName(name);
        this.setRpgClass(rpgClass);
        this.setLife(50);
        this.setAgility(2);
        this.setStrength(2);
        this.setWit(2);
    }

    /** methodes **/

    public void attack(String natk)
    {
        System.out.println(this.getName() + ": voici mon attaque finale : "+ natk);
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
