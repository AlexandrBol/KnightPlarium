package characterUtils;

import javax.swing.*;

public class AppText {
    public static void main(String[] args) {
        Knight knight = new Knight(10, 15, 2000);

        Inventory inventory = new Inventory(knight);
        Shop shop = new Shop(knight.getMoney());
        //System.out.println(knight.toString());
//        knight.addAttack(weapon);
//        knight.addDefence(armor);
   System.out.println("ПЕРСОНАЖ    " + knight.toString());

        Weapon weapon = new Weapon("Knife", 218, 100);
        Armor armor = new Armor("Shirt", 1473, 100);
        Weapon weapon1 = new Weapon("Knife1", 21, 150);
        Armor armor1 = new Armor("Shirt1", 173, 124);
        Weapon weapon2 = new Weapon("Knife2", 212, 80);
        Armor armor2 = new Armor("Shirt2", 3, 900);
        Weapon weapon3 = new Weapon("Knife3", 218, 700);
        Armor armor3 = new Armor("Shirt3", 143, 600);
        Weapon weapon4 = new Weapon("Knife4", 218, 43);
        Armor armor4 = new Armor("Shirt4", 173, 123);
        Weapon weapon5 = new Weapon("Knife5", 218, 456);
        Armor armor5 = new Armor("Shirt5", 143, 342);



        shop.AddWeaponToShop(weapon1);
        shop.AddWeaponToShop(weapon2);
        shop.AddWeaponToShop(weapon3);
        shop.AddWeaponToShop(weapon4);
        shop.AddWeaponToShop(weapon5);


        shop.AddArmorToShop(armor1);
        shop.AddArmorToShop(armor2);
        shop.AddArmorToShop(armor3);
        shop.AddArmorToShop(armor4);
        shop.AddArmorToShop(armor5);

//
//        for (int i = 0; i < shop.getShopArmors().size() ; i++) {
//
//            System.out.printf(shop.getShopArmors().get(i).toString());
//        //    btn = new JButton("btn"+ i);
//
//        }

        inventory.addWeapon(weapon1);
//        System.out.println("МАГАЗИН     " + shop.toString());
//
       System.out.println("ИНВЕНТАРЬ   " + inventory.toString());

        //inventory.addWeapon(weapon1);
        inventory.addWeapon(weapon1);

        System.out.println("ИНВЕНТАРЬ   " + inventory.toString());
//        //TODO спряттать это все ->
//        int moneyW = shop.sellWeapon(2);
//        if (moneyW != knight.getMoney()) {
//            knight.setMoney(moneyW);
//            System.out.println(knight.getMoney());
//        }
//        int moneyA = shop.sellArmor(2);
//        if (moneyA != knight.getMoney()) {
//            knight.setMoney(moneyA);
//            System.out.println(knight.getMoney());
//        }
//        //TODO до сюда
//

//        System.out.println("ИНВЕНТАРЬ   " + inventory.toString());
//        shop.sellArmor(2);
//        System.out.println("ИНВЕНТАРЬ   " + inventory.toString());
//        inventory.EquipWeapon(1);
//        inventory.EquipArmor(2);//inventory.EquipWeapon(1);
//        System.out.println("ИНВЕНТАРЬ   " + inventory.toString());
//        System.out.println(knight.toString());

    }
}
