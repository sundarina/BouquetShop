import java.io.Serializable;
import java.util.ArrayList;


public class Bouquet implements Serializable{
    ArrayList<Flower> flowers;
    ArrayList<Accessory> accessories;
    private int totalPrice = 0;



    private String name;

    public Bouquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories, String name) {
        this.flowers = flowers;
        this.accessories = accessories;
        this.name = name;
    }

    public void addFlower(Flower f) {
        flowers.add(f);
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void addAccessory(Accessory a) {
        accessories.add(a);
    }

    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }


    public int bouqueteTotalPrice() {
        for (Flower f : flowers) {
            if (f instanceof Rose) {
                totalPrice += ((Rose) f).price();
            }
            if (f instanceof Chamomile) {
                totalPrice += ((Chamomile) f).price();
            }
            if (f instanceof Tulip) {
                totalPrice += ((Tulip) f).price();
            }
        }

        for (Accessory a : accessories) {
            if (a instanceof Pack) {
                totalPrice += ((Pack) a).price();
            }
            if (a instanceof Tape) {
                totalPrice += ((Tape) a).price();
            }
            if (a instanceof Bow) {
                totalPrice += ((Bow) a).price();
            }
        }

        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
