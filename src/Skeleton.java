public class Skeleton extends Boss {

    private int arrows;

    public Skeleton(String name, int damage, int health, Weapon weapon) {
        super(name, damage, health, weapon);
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String printInfo() {
        return "Skeleton: " + getName() + "; " + " Health: " + getHealth() + "; " + "Damage: " + getDamage() + "; " + " Weapon Type: " + WeaponType.GUNSHOT + "; " + " Named: " + getWeaponName() + ".";
    }
    public String getWeaponName(){
        return "BOW";
    }
}
