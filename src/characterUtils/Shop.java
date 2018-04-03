package characterUtils;

import java.util.LinkedList;

public class Shop {

    int gold = 0;
    public Shop(int gold) {
        this.gold = gold;
    }
    Inventory inventory= new Inventory();

    private LinkedList<Weapon> ShopWeapons = new LinkedList<>();
    private LinkedList<Armor> ShopArmors = new LinkedList<>();

    public void AddWeaponToShop(Weapon weapon){
        ShopWeapons.add(weapon);
    }

    public void AddArmorToShop(Armor armor){
        ShopArmors.add(armor);
    }

    public int sellWeapon(int wID){
        System.out.println( ShopWeapons.get(wID));
        Weapon w =ShopWeapons.get(wID);
        System.out.println(w);
        if(gold >= w.getPrice()){
            inventory.addWeapon(w);
            System.out.println("Weapon buy succ");
            return (gold-w.getPrice());
        }
        else {
            System.out.println("You have enough money for this weapon");
            return gold;
        }
    }

    public int sellArmor(int aID){
        System.out.println(gold);
        Armor a = ShopArmors.get(aID);
        if(gold>= a.getPrice()){
            inventory.addArmor(a);
            System.out.println("Armor buy succ");
            return gold-a.getPrice();
        }
        else {
            System.out.println("You have enough money for this weapon");
            return gold;
        }
    }

    @Override
    public String toString() {
        System.out.println(ShopWeapons);
        System.out.println(ShopArmors);
        return ",Yout gold gold=" + gold +"\n";//+
    }

    public LinkedList<Weapon> getShopWeapons() {
        return ShopWeapons;
    }

    public void setShopWeapons(LinkedList<Weapon> shopWeapons) {
        ShopWeapons = shopWeapons;
    }

    public LinkedList<Armor> getShopArmors() {
        return ShopArmors;
    }

    public void setShopArmors(LinkedList<Armor> shopArmors) {
        ShopArmors = shopArmors;
    }
}
