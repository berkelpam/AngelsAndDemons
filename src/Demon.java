public class Demon extends Character {
    public Demon(String name, String gender) {
        super(name, gender);
        this.stamina=70;
        this.health=100;
        this.strength=90;
    }

    private int stamina;
    private int health;
    private int strength;

    public int getStamina() {
        return this.stamina;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public Boolean Alive() {
        return super.Alive();
    }

    @Override
    public Integer Stamina() {
        return super.Stamina();
    }

    @Override
    public Integer Health() {
        return super.Health();
    }

    @Override
    public Integer Mana() {
        return super.Mana();
    }

    @Override
    public Integer Strength() {
        return super.Strength();
    }

    @Override
    public String Name() {
        return super.Name();
    }

    @Override
    public String Gender() {
        return super.Gender();
    }

    @Override
    public void hit(Integer damage) {
        super.hit(damage);
    }


}
