package Hero;

public class Hero {
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int i, int i1, String fireball) {

    }

    public Hero(int i, int i1) {

    }

    public void Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public void Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}

