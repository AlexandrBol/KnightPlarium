package characterUtils;

public class Knight {
    private int attack;
    private int defense;

    int money;

    private Weapon equipedWeapon;
    private Armor equipedArmor;


    public void addAttack(Weapon weapon) {
        if (equipedWeapon == null) {
            setAttack(getAttack() + weapon.getWeaponAttack());
            setEquipedWeapon(weapon);
        } else {
            setAttack(getAttack() + weapon.getWeaponAttack() - equipedWeapon.getWeaponAttack());
            setEquipedWeapon(weapon);
        }
    }

    public void addDefence(Armor armor) {
        if (equipedArmor == null) {
            setDefense(getDefense() + armor.getArmorDefence());
            setEquipedArmor(armor);
        } else {
            setDefense(getDefense() + armor.getArmorDefence() - equipedArmor.getArmorDefence());
            setEquipedArmor(armor);
        }
    }

    public Armor getEquipedArmor() {
        return equipedArmor;
    }

    public void setEquipedArmor(Armor equipedArmor) {
        this.equipedArmor = equipedArmor;
    }

    public Weapon getEquipedWeapon() {
        return equipedWeapon;
    }

    public void setEquipedWeapon(Weapon equipedWeapon) {
        this.equipedWeapon = equipedWeapon;
    }

    public Knight(int attack, int defense, int money) {
        this.attack = attack;
        this.defense = defense;
        this.money = money;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", money=" + money +
                '}';
    }
}
