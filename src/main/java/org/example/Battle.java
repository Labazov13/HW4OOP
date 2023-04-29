package org.example;

public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
    }

    public Warrior fight() {
        while (one.getHealthPoint() > 0 && two.getHealthPoint() > 0) {    //Пока Здоровье обоих больше 0
            int punch = one.hit();      // Урон первого воина
            int pointOfProtectTwo = two.protect();      //Очки защиты второго воина
            if (two.isChance()) {     //Если у второго есть шанс отразить удар (true)
                if (pointOfProtectTwo > punch) {
                    System.out.println("Второй воин отражает удар!");
                    System.out.println("Второй воин, остаток здоровья: " + two.getHealthPoint());
                }
                System.out.printf("Второй воин отражает удар противника на %d очков", pointOfProtectTwo);
                System.out.println("\n");
                System.out.println("Первый воин наносит удар, урон: " + (punch - pointOfProtectTwo));
                two.setHealthPoint((two.getHealthPoint()) - (punch - pointOfProtectTwo));   //Устанавливаем здоровье второму воину: удар - защита
                System.out.println("Второй воин получает урон, остаток здоровья: " + two.getHealthPoint());
            } else {   //Если шанса защиты нет, то
                System.out.println("Первый воин наносит удар, урон: " + punch);
                two.setHealthPoint((two.getHealthPoint()) - punch);
                System.out.println("Второй воин получает урон, остаток здоровья: " + two.getHealthPoint());
            }

            if (two.getHealthPoint() <= 0) {      //Если второй не имеет здоровья, победил первый
                return one;
            }
            int punchTwo = two.hit();   //Удар второго воина
            int pointOfProtectOne = one.protect();  //Вероятные очки защиты первого воина
            if (one.isChance()) {     //Если первый имеет шанс отразить удар
                if (pointOfProtectOne > punch) {
                    System.out.println("Первый воин отражает удар!");
                    System.out.println("Первый воин, остаток здоровья: " + two.getHealthPoint());
                }
                System.out.printf("Первый воин отражает удар противника на %d очков", pointOfProtectOne);
                System.out.println("\n");
                System.out.println("Второй воин наносит удар, урон: " + (punchTwo - pointOfProtectOne));
                one.setHealthPoint((one.getHealthPoint()) - (punchTwo - pointOfProtectOne));       //Устанавливаем здоровье первому воину: удар - защита
                System.out.println("Первый воин получает урон, остаток здоровья: " + one.getHealthPoint());
            } else {
                System.out.println("Второй воин наносит удар, урон: " + punchTwo);
                one.setHealthPoint((one.getHealthPoint()) - punchTwo);
                System.out.println("Первый воин получает урон, остаток здоровья: " + one.getHealthPoint());
            }
        }
        return two;
    }
}