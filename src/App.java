import characterUtils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.LinkedList;

public class App {

    private JPanel ShopPane;
    private JPanel InventoryPane;

    private JButton button1;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel KnightPane;

    Knight knight = new Knight(10, 15, 2000);
    Inventory inventory = new Inventory(knight);
    Shop shop = new Shop(knight.getMoney());

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

        inventory.addArmor(armor1);
        inventory.addWeapon(weapon1);
        knight.addAttack(weapon1);
        knight.addDefence(armor1);
    }

    public App(){
        Generate();
        tabbedPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });

        ShopPane.setLayout(new GridLayout(10, 2));
        Container ShopButtonLayout;
        ShopButtonLayout = ShopPane;
        LinkedList<Armor> a = shop.getShopArmors();
        LinkedList<Weapon> w = shop.getShopWeapons();

        for (int i = 0; i < w.size(); i++) {
            Button button = new Button();
            button.setLabel(w.get(i).toString());
            ShopButtonLayout.add(button);
        }

        for (int i = 0; i < a.size(); i++) {
            Button button = new Button();
            button.setLabel(a.get(i).toString());
            ShopButtonLayout.add(button);
        }
        InventoryPane.setLayout(new GridLayout(10, 2));
        Container InventoryButtonLayout = InventoryPane;
        LinkedList<Weapon> wI = inventory.getInvWeapons();
        LinkedList<Armor> aI = inventory.getInvArmors();

        for (int i = 0; i < wI.size(); i++) {
            Button button = new Button();
            button.setLabel(wI.get(i).toString());
            InventoryButtonLayout.add(button);
        }

        for (int i = 0; i < aI.size(); i++) {
            Button button = new Button();
            button.setLabel(aI.get(i).toString());
            InventoryButtonLayout.add(button);
        }
        


    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println();
        JFrame jFrame = new JFrame("App");
        jFrame.setContentPane(new App().panel1);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
