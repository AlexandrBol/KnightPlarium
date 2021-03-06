package characterUtils;

public class SetShop {

    Shop shop = new Shop();
    Weapon weapon1 = new Weapon("Knife1", 21, 150);
    Weapon weapon2 = new Weapon("Knife2", 212, 80);
    Weapon weapon3 = new Weapon("Knife3", 218, 700);
    Weapon weapon4 = new Weapon("Knife4", 218, 43);
    Weapon weapon5 = new Weapon("Knife5", 218, 456);
    Armor armor1 = new Armor("Shirt1", 173, 124);
    Armor armor2 = new Armor("Shirt2", 3, 900);
    Armor armor3 = new Armor("Shirt3", 143, 600);
    Armor armor4 = new Armor("Shirt4", 173, 123);
    Armor armor5 = new Armor("Shirt5", 143, 342);

    public void Generate() {
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
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

}
