public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.MAGIC, "Fire Staff");
        B0SS boss = new B0SS("Dark Lord", 500, bossWeapon);
        boss.printInfo();

        Weapon skeletonWeapon1 = new Weapon(WeaponType.RANGED, "Bow");
        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 150, skeletonWeapon1, 20);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.RANGED, "Crossbow");
        Skeleton skeleton2 = new Skeleton("Skeleton Warrior", 200, skeletonWeapon2, 15);

        skeleton1.printInfo();
        skeleton2.printInfo();

    }
}
