import java.io.Serializable;

public class Tulip extends AbstractBouquet implements Flower, Serializable {
    public Tulip() {
        description = "Tulip";
    }

    @Override
    public int price() {
        return 30;
    }
    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return this.description;
    }
}
