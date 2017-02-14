import java.io.Serializable;

public class Pack extends AbstractBouquet implements Accessory, Serializable  {

    public Pack() {
        description = "Pack";
    }

    @Override
    public int price() {
        return 15;
    }
    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return this.description;
    }

}
