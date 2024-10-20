public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 50, "FIREBALL"),
                new Medic(80, 30, "HEAL", 50),
                new Warrior(120, 70, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Medic увеличил количество единиц лечения до: " + medic.getHealPoints());
            }
        }
    }
}
