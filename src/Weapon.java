public class Weapon {
    private WeaponType type;
    private String weaponName;

    public Weapon(WeaponType type, String weaponName) {
        this.type = type;
        this.weaponName = weaponName;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
