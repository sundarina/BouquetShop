import java.io.Serializable;

/**
 * Created by sun on 14.02.17.
 */
public class Chamomile extends AbstractBouquet implements Flower, Serializable {
    public Chamomile() {
        description = "Chamomile";
    }

    @Override
    public int price() {
        return 20;
    }
    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return this.description;
    }
}
