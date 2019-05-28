package Lab8;

import java.util.ArrayList;

public class ClientTest {
    public static void main(String[] args) {
        ArrayList<Food>Foods=new ArrayList<>();
        Foods.add(new Food());
        Foods.get(0).setName("pizza");
        Foods.get(0).setType("SeaFood");
        Foods.get(0).setSize(11);
        Foods.get(0).setPrice(120);
        Foods.add(new Food());
        Foods.get(1).setName("pizza");
        Foods.get(1).setType("Beef");
        Foods.get(1).setSize(9);
        Foods.get(1).setPrice(100);
        Foods.add(new Food());
        Foods.get(2).setName("fired Rice");
        Foods.get(2).setType("SeaFood");
        Foods.get(2).setSize(5);
        Foods.get(2).setPrice(40);
        Foods.add(new Food());
        Foods.get(3).setName("Noodles");
        Foods.get(3).setType("Beef");
        Foods.get(3).setSize(6);
        Foods.get(3).setPrice(35);
        for (int i = 0; i < Foods.size(); i++) {
            Foods.get(i).showInformation();
        }
    }
}
