import java.io.Serializable;

public class Tape extends AbstractBouquet implements Accessory, Serializable {

    public Tape() {
        description = "Tape";
    }

    @Override
    public int price() {
        return 2;
    }
    @Override
    public void display() {
        System.out.println(this);
    }
    public String toString() {
        return this.description;
    }
}
