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
        System.out.println(InvWeapons.get(id));
        knight.addAttack(InvWeapons.get(id));
    }
    public void EquipArmor(int id) {
        knight.addDefence(InvArmors.get(id));
    }

    public void addArmor(Armor armor) {
        InvArmors.add(armor);
    }

    public void addWeapon(Weapon weapon) {
        InvWeapons.add(weapon);
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
