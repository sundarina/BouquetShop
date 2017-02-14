import java.io.Serializable;

public class Rose extends AbstractBouquet implements Flower, Serializable{

    public Rose() {
        description = "Rose";
    }

    public int price() {
        return 50;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return this.description;
    }
}
