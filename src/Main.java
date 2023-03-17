public class Main {
    public static void main(String[] args) {
        Boss firstBoss = new Boss("Boss - 1", 50, 700, new Weapon(WeaponType.STEEL_ARMS, "AXE"));
        Skeleton skeleton1 = new Skeleton("skeleton1", 12, 100, new Weapon(WeaponType.GUNSHOT, "BOW"));
        Skeleton skeleton2 = new Skeleton("Skeleton2", 13, 90, new Weapon(WeaponType.GUNSHOT, "BOW"));
        System.out.println(firstBoss.printInfo());
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}