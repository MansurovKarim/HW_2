import Hero.Hero;

public class HW_5main {
    public static <Hero> void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Magical");

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defence type: " + boss.getDefenceType());

        Hero[] heroes = (Hero[]) createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getClass() +
                    ", damage: " + hero.getClass() +
                    ", super ability: " + hero.equals(1));

        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 20, "Fireball");
        Hero hero2 = new Hero(200, 15);
        Hero hero3 = new Hero(300, 25, "Shield");

        return new Hero[]{hero1, hero2, hero3};
    }
}


