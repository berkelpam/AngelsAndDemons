public class Character implements ICharacter {

    private int stamina;
    private int health;
    private int mana;
    private int strength;
    private String name;
    private String gender;

    public Character(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.stamina=100;
        this.health=100;
        this.mana=100;
        this.strength=100;
    }

    @Override
    public Integer Stamina() {
        return stamina;
    }

    @Override
    public Integer Health() {
        return health;
    }

    @Override
    public Integer Mana() {
        return mana;
    }

    @Override
    public Integer Strength() {
        return strength;
    }

    @Override
    public String Name() {
        return name ;
    }

    @Override
    public String Gender() {
        return gender;
    }

}
