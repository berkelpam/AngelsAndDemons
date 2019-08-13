public class Character implements ICharacter {

    private int stamina;
    private int health;
    private int mana;
    private int strength;
    private String name;
    private String gender;
    private boolean alive;

    @Override
    public Boolean Alive() {
        return alive;
    }

    public Character(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.stamina=100;
        this.health=100;
        this.mana=100;
        this.strength=100;
        this.alive=true;
    }

    @Override
    public Integer Stamina() {
        return this.stamina;
    }

    public int getHealth() {
        return this.health;
    }

    @Override
    public Integer Health() {
        return health;
    }

    @Override
    public Integer Mana() {
        return this.mana;
    }

    @Override
    public Integer Strength() {
        return this.strength;
    }

    @Override
    public String Name() {
        return this.name ;
    }

    @Override
    public String Gender() {
        return this.gender;
    }

    public void hit(Integer damage){

        if ((this.health-damage)<0){
            this.alive=false;
            System.out.println(this.name +" died!");
        }
        else {
            this.health=this.health-damage;
            System.out.println(this.health);
        }
    }

}
