import characterUtils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.LinkedList;


//TODO  рефакторинг

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


    JFrame frame = new JFrame();


    Generator generator = new Generator();
    SetShop setShop = new SetShop();
    Knight knight = generator.getKnight();
    Inventory inventory = generator.getInventory();
    Shop shop = setShop.getShop();
    Container InventoryButtonLayout = InventoryPane;

    public void ShopPanel() {
        ShopPane.setLayout(new GridLayout(11, 2));
        Container ShopButtonLayout;
        ShopButtonLayout = ShopPane;

        LinkedList<Armor> shopArmors = shop.getShopArmors();
        LinkedList<Weapon> shopWeapons = shop.getShopWeapons();

        for (int i = 0; i < shopWeapons.size(); i++) {
            Button button = new Button();
            button.setLabel(shopWeapons.get(i).toString());
            ShopButtonLayout.add(button);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                int j = finalI;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (knight.getMoney() >= shopWeapons.get(j).getPrice()) {
                        knight.setMoney(knight.getMoney() - shopWeapons.get(j).getPrice());
                        inventory.addWeapon(shopWeapons.get(j));
                        InventoryPane.removeAll();
                        InventoryPanel();
                        InventoryPane.revalidate();
                        InventoryPane.repaint();
                    } else {
                        Label enoughMoney = new Label();
                        enoughMoney.setText("You have not enough money");
                        ShopButtonLayout.add(enoughMoney);
                        ShopPane.revalidate();
                        ShopPane.repaint();
                    }
                    KnightPanel();
                }
            });
        }

        for (int i = 0; i < shopArmors.size(); i++) {
            Button button = new Button();
            button.setLabel(shopArmors.get(i).toString());
            ShopButtonLayout.add(button);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                int j = finalI;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (knight.getMoney() >= shopArmors.get(j).getPrice()) {
                        knight.setMoney(knight.getMoney() - shopArmors.get(j).getPrice());
                        inventory.addArmor(shopArmors.get(j));
                        InventoryPane.removeAll();
                        InventoryPanel();
                        InventoryPane.revalidate();
                        InventoryPane.repaint();
                    } else {
                        Label enoughMoney = new Label();
                        enoughMoney.setText("You have not enough money");
                        ShopButtonLayout.add(enoughMoney);
                        ShopPane.revalidate();
                        ShopPane.repaint();
                    }
                    KnightPanel();
                }
            });
        }
    }


    public void InventoryPanel() {
        InventoryPane.setLayout(new GridLayout(10, 2));
        LinkedList<Weapon> wI = inventory.getInvWeapons();
        LinkedList<Armor> aI = inventory.getInvArmors();

        for (int i = 0; i < wI.size(); i++) {
            Button button = new Button();
            button.setLabel(wI.get(i).toString());
            InventoryButtonLayout.add(button);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                int j = finalI;

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("You clicked button " + e.getSource().toString());
                    inventory.EquipWeapon(j);
                    KnightPanel();
                }
            });
        }

        for (int i = 0; i < aI.size(); i++) {
            Button button = new Button();
            button.setLabel(aI.get(i).toString());
            InventoryButtonLayout.add(button);
            int finalI = i;
            button.addActionListener(new ActionListener() {
                int j = finalI;

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("You clicked button " + e.getSource().toString());
                    inventory.EquipArmor(j);
                    KnightPanel();
                }
            });
        }
    }

    public void KnightPanel() {
        AttakLabel.setText("Attack = " + knight.getAttack());
        DefenceLabel.setText("Defence = " + knight.getDefense());
        MoneyLabel.setText("Money = " + knight.getMoney());
        if (knight.getEquipedArmor() != null) {
            EquipedArmorLabel.setText("Equiped Armor = " +
                    "\n" + knight.getEquipedArmor().toString());
        } else {
            EquipedArmorLabel.setText("No Equiped Armor");
        }
        if (knight.getEquipedWeapon() != null) {
            EquipedWeapomLabel.setText("Equiped Weapom =\n"
                    + knight.getEquipedWeapon().toString());
        } else {
            EquipedWeapomLabel.setText("No Equiped Weapon");
        }
    }


    public App() {
        generator.Generate();
        setShop.Generate();
        ShopPanel();
        InventoryPanel();
        KnightPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });


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
