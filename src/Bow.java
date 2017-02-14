import java.io.Serializable;

public class Bow extends AbstractBouquet implements Accessory, Serializable {

    public Bow() {
        description = "Bow";
    }

    @Override
    public int price() {
        return 10;
    }
    @Override
    public void display() {
        System.out.println(this);
    }
    public String toString() {
        return this.description;
    }
}

