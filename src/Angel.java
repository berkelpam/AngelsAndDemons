public class Angel extends Character {


    public Angel(String name, String gender) {
        super(name, gender);
        this.stamina=70;
        this.health=100;
        this.mana=150;
        this.strength=90;

    }
    private int stamina;
    private int health;
    private int mana;
    private int strength;
    private boolean WingsOpen;
    private boolean flying;

    public int getStamina() {
        return stamina;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isWingsOpen() {
        return WingsOpen;
    }

    public boolean isFlying() {
        return flying;
    }

    public void fly(){
        this.WingsOpen=true;
        this.flying=true;
    }

}
