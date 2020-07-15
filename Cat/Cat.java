public class Cat implements Cloneable
{
    public static final int NUMBER_OF_EYES = 2;
    public static final int MAX_WEIGHT = 9000;
    public static final int MIN_WEIGHT = 1000;
    public static byte count;
    private double originWeight;
    private double weight;
    private boolean isAlive;
    private double food;
    private Color colorCat;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        isAlive = true;
        count++;
    }

    public Cat(double weight){
        this();
        this.weight = weight;
    }

    public Cat(Color type){
        this();
        this.colorCat = type;
    }

    public Cat(Color type, double weight){
        this();
        this.colorCat = type;
        this.weight = weight;
    }

    public Color getColorCat()
    {
        return colorCat;
    }

    public void setColorCat(Color type)
    {
        colorCat = type;
    }

    public void meow()
    {
        if (isAlive()) {
            weight = weight - 1000;
            System.out.println("Meow");
        } else {
            System.out.println("Кошка мертва");
        }
    }

    public void feed(double amount)
    {
        if (isAlive()) {
            weight += amount;
            food += amount;
            System.out.println("im feed");
        } else {
            System.out.println("Кошка мертва");
        }
    }

    public double getFeed()
    {
        return food;
    }

    public void drink(Double amount)
    {
        if (isAlive()) {
            weight = weight + amount;
            System.out.println("im drink");
        } else {
            System.out.println("Кошка мертва");
        }
    }

    public void pee(Double amount)
    {
        if (isAlive()) {
            weight = weight - amount;
            System.out.println("im pee");
        } else {
            System.out.println("Кошка мертва");
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public boolean isAlive()
    {
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT){
            return isAlive;
        } else {
            if(isAlive) {
                isAlive = false;
                count--;
            }
            return false;
        }
    }

    public String getStatus()
    {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}