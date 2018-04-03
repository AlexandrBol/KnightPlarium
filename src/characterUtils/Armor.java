package characterUtils;

public class Armor {
    String ArmorName;
    int ArmorDefence;
    int Price;

    public Armor(String armorName, int armorDefence, int price) {
        ArmorName = armorName;
        ArmorDefence = armorDefence;
        Price = price;
    }

    public String getArmorName() {
        return ArmorName;
    }

    public void setArmorName(String armorName) {
        ArmorName = armorName;
    }

    public int getArmorDefence() {
        return ArmorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        ArmorDefence = armorDefence;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return  ArmorName+
                "   | ArmorDefence = " + ArmorDefence +
                "   | Price = " + Price;
    }
}
