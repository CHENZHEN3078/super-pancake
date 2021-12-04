package work;

public class OrangeCat extends Cat {
    boolean isfat;

    public OrangeCat(String name, int age, boolean isfat) {

        super(name, age, 200);
        this.isfat = isfat;

    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                "name=" + name +
                ", age=" + age +
                ", isfat=" + isfat +
                ", price=" + price +
                '}';
    }
}

