import characterUtils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.LinkedList;

public class App {

    private JPanel ShopPane;
    private JPanel InventoryPane;

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel KnightPane;
    private JLabel AttakLabel;
    private JLabel DefenceLabel;
    private JLabel MoneyLabel;
    private JLabel EquipedArmorLabel;
    private JLabel EquipedWeapomLabel;
    Generator generator = new Generator();


    Knight knight = generator.getKnight();
    Inventory inventory = generator.getInventory();
    Shop shop = generator.getShop();


    public App(){
        generator.Generate();
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

        AttakLabel.setText("Attack = " + knight.getAttack());
        DefenceLabel.setText("Defence = " + knight.getDefense());
        MoneyLabel.setText("Money = " + knight.getMoney());

        EquipedArmorLabel.setText("Equiped Armor = " +
                "\n" + knight.getEquipedArmor().toString());
        EquipedWeapomLabel.setText("Equiped Weapom =\n"
                + knight.getEquipedWeapon().toString());



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
