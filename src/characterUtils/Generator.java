package characterUtils;

public class Generator {
    Knight knight = new Knight(10, 15, 2000);
    Inventory inventory = new Inventory(knight);


    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    Weapon weapon1 = new Weapon("Knife1", 21, 150);
    Weapon weapon2 = new Weapon("Knife2", 212, 80);
    Weapon weapon3 = new Weapon("Knife3", 218, 2700);
    Weapon weapon4 = new Weapon("Knife4", 218, 43);
    Weapon weapon5 = new Weapon("Knife5", 218, 456);
    Armor armor1 = new Armor("Shirt1", 173, 124);
    Armor armor2 = new Armor("Shirt2", 3, 2900);
    Armor armor3 = new Armor("Shirt3", 143, 600);
    Armor armor4 = new Armor("Shirt4", 173, 123);
    Armor armor5 = new Armor("Shirt5", 143, 342);


    public void Generate() {

        inventory.addArmor(armor2);
        inventory.addWeapon(weapon2);
        inventory.addArmor(armor3);
        inventory.addWeapon(weapon3);
        inventory.addArmor(armor4);
        inventory.addWeapon(weapon4);

//        knight.addAttack(weapon1);
//        knight.addDefence(armor1);
    }

}
