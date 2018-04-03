package characterUtils;

import java.util.LinkedList;

public class Inventory {
    public Inventory() {
    }

    Knight knight;
    public Inventory(Knight knight) {

        this.knight = knight;
    }

    private LinkedList<Weapon> InvWeapons = new LinkedList<>();
    private LinkedList<Armor> InvArmors = new LinkedList<>();

    public void EquipWeapon(int id) {
        Weapon w = InvWeapons.get(id);
        knight.addAttack(w);
        InvWeapons.remove(id);
    }

    public void EquipArmor(int id) {
        knight.addDefence(InvArmors.get(id));
        InvArmors.remove(id);
    }

    public void addArmor(Armor armor) {
        InvArmors.add(armor);
    }

    public void addWeapon(Weapon weapon) {
        InvWeapons.add(weapon);
    }

    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    public LinkedList<Weapon> getInvWeapons() {
        return InvWeapons;
    }

    public LinkedList<Armor> getInvArmors() {
        return InvArmors;
    }

    @Override
    public String toString() {
        System.out.println(InvWeapons);
        System.out.println(InvArmors);
        return
                ", InvWeapons=" + InvWeapons +
                ", InvArmors=" + InvArmors;
    }
}
