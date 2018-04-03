package characterUtils;

public class Weapon {
    String WeaponName;
    int WeaponAttack;
    int Price;

    public Weapon(String weaponName, int weaponAttack, int price) {
        WeaponName = weaponName;
        WeaponAttack = weaponAttack;
        Price = price;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public int getWeaponAttack() {
        return WeaponAttack;
    }

    public void setWeaponAttack(int weaponAttack) {
        WeaponAttack = weaponAttack;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return
                WeaponName + "   | WeaponAttack = " + WeaponAttack +
                "   | Price = " + Price ;
    }
}
