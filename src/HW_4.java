import java.util.Random;

public class HW_4 {

    public static int bossHealth = 1500;
    public static int bossDamage = 50;
    public static String bossDefence;
    public static int[] heroesHealth = {270, 260, 250, 200, 700, 280, 300, 270};
    public static int[] heroesDamage = {20, 15, 10, 0, 5, 15, 0, 25};
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Medic", "Golem", "Lucky", "Witcher", "Thor"};
    public static int roundNumber;
    public static boolean bossStunned = false;

    public static void main(String[] args) {
        printStatistics();

        while (!isGameOver()) {
            playRound();
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        if (!bossStunned) {
            bossAttack();
        } else {
            System.out.println("Boss is stunned and misses this round!");
            bossStunned = false;
        }
        heroesAttack();
        medicHeal();
        printStatistics();
    }

    public static void chooseBossDefence() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length - 1);
        bossDefence = heroesAttackType[randomIndex];
    }

    public static void bossAttack() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                int damageTaken = bossDamage;

                if (heroesAttackType[i].equals("Golem")) {
                    damageTaken -= bossDamage / 5;
                }


                if (heroesAttackType[i].equals("Lucky")) {
                    Random random = new Random();
                    if (random.nextBoolean()) {
                        System.out.println("Lucky dodged the attack!");
                        damageTaken = 0;
                    }
                }

                if (heroesAttackType[i].equals("Witcher") && heroesHealth[i] <= 0) {
                    reviveHero();
                    continue;
                }

                if (heroesHealth[i] - damageTaken < 0) {
                    heroesHealth[i] = 0;
                } else {
                    heroesHealth[i] -= damageTaken;
                }
            }
        }
    }

    public static void heroesAttack() {
        for (int i = 0; i < heroesDamage.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                int damage = heroesDamage[i];
                if (heroesAttackType[i].equals(bossDefence)) {
                    Random random = new Random();
                    int coeff = random.nextInt(9) + 2;
                    damage *= coeff;
                    System.out.println("Critical damage: " + damage);
                }

                if (heroesAttackType[i].equals("Thor")) {
                    Random random = new Random();
                    if (random.nextBoolean()) {
                        bossStunned = true;
                        System.out.println("Thor stunned the Boss!");
                    }
                }

                if (bossHealth - damage < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth -= damage;
                }
            }
        }
    }

    public static void medicHeal() {
        int healAmount = 30;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (i != 3 && heroesHealth[i] > 0 && heroesHealth[i] < 100) {
                heroesHealth[i] += healAmount;
                System.out.println("Medic healed " + heroesAttackType[i] + " for " + healAmount);
                break;
            }
        }
    }

    public static void reviveHero() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] <= 0) {
                System.out.println("Witcher sacrificed himself to revive " + heroesAttackType[i]);
                heroesHealth[i] = heroesHealth[6];
                heroesHealth[6] = 0;
                break;
            }
        }
    }

    public static void printStatistics() {
        System.out.println("ROUND " + roundNumber + " ---------------");
        System.out.println("BOSS health: " + bossHealth + " damage: " + bossDamage
                + " defence: " + (bossDefence == null ? "No defence" : bossDefence));
        for (int i = 0; i < heroesAttackType.length; i++) {
            System.out.println(heroesAttackType[i] +
                    " health: " + heroesHealth[i] + " damage: " + heroesDamage[i]);
        }
    }
}