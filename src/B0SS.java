public class B0SS extends GameEntity {
    private Weapon weapon;

    public B0SS(String name, int healt, Weapon weapon) {
        super(name, healt);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printInfo(){
        System.out.println("Boss info: ");
        System.out.println("Name: " + getName());
        System.out.println("Healt: " + getHealt());
        System.out.println("Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");

    }
}
