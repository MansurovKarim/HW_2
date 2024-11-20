public class Skeleton extends B0SS{
    private int arrowCount;

    public Skeleton(String name, int healt, Weapon weapon, int arrowCount){
        super(name, healt, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Skeleton info: ");
        System.out.println("Name: " + getName());
        System.out.println("Healt: " + getHealt());
        System.out.println("Weapon:" + getWeapon().getName() + " (" + getWeapon().getType() + ")");
        System.out.println("Arrow Count: " + arrowCount);
    }
}

