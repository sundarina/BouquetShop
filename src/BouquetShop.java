import java.io.*;
import java.util.ArrayList;

public class BouquetShop {
    public BouquetShop() {
    }

    public static void writeBoquete(Bouquet b, String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(b);
        os.flush();
        os.close();
    }

    public static Bouquet readObject(String path) throws IOException, ClassNotFoundException {
        Bouquet b = null;
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream is = new ObjectInputStream(fis);
        while (fis.available() > 0) {
            b = (Bouquet) is.readObject();
            System.out.println("Удалось");
        }
        is.close();
        return b;
    }


    public static void main(String[] args) {


        ArrayList<Flower> flowers = new ArrayList<>();
        ArrayList<Accessory> accessories = new ArrayList<>();

        Bouquet valentine = new Bouquet(flowers, accessories, "St Valentine Date`s Bouquet");
        for (int i = 0; i < 100; i++) {
            valentine.addFlower(new Rose());
        }
        valentine.addAccessory(new Tape());
        valentine.addAccessory(new Bow());
        valentine.addAccessory(new Pack());

        Bouquet simpleDay = new Bouquet(new ArrayList<Flower>(), new ArrayList<Accessory>(), "Bouquet for every day");
        for (int i = 0; i < 5; i++) {
            simpleDay.addFlower(new Chamomile());
        }

        for (int i = 0; i < 6; i++) {
            simpleDay.addFlower(new Tulip());
        }

        simpleDay.addAccessory(new Tape());




        try {
            writeBoquete(valentine, "res" + File.separator + "Valentine");
            writeBoquete(simpleDay, "res" + File.separator + "Simple");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(simpleDay.bouqueteTotalPrice());
        System.out.println(valentine.bouqueteTotalPrice());

//        try {
//            Bouquet b = readObject("res" + File.separator + "Valentine");
//            System.out.println((b.bouqueteTotalPrice()));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


    }
}
