public class Loader {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cat cat1 = new Cat(Color.SOLID_BLACK);
        Cat cat2 = new Cat(cat1.getColorCat(), cat1.getWeight());
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = getKitten();
        Cat cat7 = getKitten();
        Cat cat8 = copyCat(cat1);
        Cat cat9 = (Cat) cat1.clone();

        System.out.println("Живых кошек: " + Cat.count);

        System.out.println("\nОкрас Cat1: " + cat1.getColorCat());
        System.out.println("Окрас Cat9: " + cat9.getColorCat());
        System.out.println("Cat1 весит: " + cat1.getWeight());
        System.out.println("Cat9 весит: " + cat9.getWeight());
        cat1.feed(150.);
        cat1.feed(15000.);
        cat1.feed(150.);
        System.out.println("im feed: " + cat1.getFeed() + "g");
        System.out.println("Cat1 весит: " + cat1.getWeight());
        System.out.println(cat1.getStatus());
        cat1.feed(150.);

        System.out.println("\nCat2 весит: " + cat2.getWeight());
        System.out.println("Окрас Cat2: " + cat2.getColorCat());
        cat2.setColorCat(Color.MACKEREL_TABBY);
        System.out.println("Окрас Cat1: " + cat1.getColorCat());
        System.out.println("Окрас Cat2: " + cat2.getColorCat());
        cat2.pee(0.1 * cat2.getWeight());
        cat2.pee(10 * cat2.getWeight());
        cat2.pee(0.1 * cat2.getWeight());
        System.out.println("Cat2 весит: " + cat2.getWeight());
        System.out.println(cat2.getStatus());

        System.out.println("\nCat3 весит: " + cat3.getWeight());
        do {
            cat3.meow();
            if (!cat3.isAlive()) {
                System.out.println("замяукалась до смерти");
            }
        } while (cat3.isAlive());
        System.out.println("Cat3 весит:" + cat3.getWeight());
        System.out.println(cat3.getStatus());
        cat3.meow();

        System.out.println("\nCat4 весит: " + cat4.getWeight());
        do {
            cat4.feed(1050.);
            if (!cat4.isAlive()) {
                System.out.println("умерла, объелась");
            }
        } while (cat4.isAlive());
        System.out.println("Cat4 весит:" + cat4.getWeight());
        cat4.feed(155.);
        System.out.println(cat4.getStatus());

        System.out.println("\nCat5 весит: " + cat5.getWeight());
        cat5.drink(1 * cat5.getWeight());
        cat5.drink(1 * cat5.getWeight());
        cat5.drink(1 * cat5.getWeight());
        System.out.println(cat5.getStatus());

        System.out.println("\nCat6 весит: " + cat6.getWeight());
        System.out.println("\nCat7 весит: " + cat7.getWeight());
        System.out.println("\nCat8 весит: " + cat8.getWeight());
        System.out.println("Окрас Cat8: " + cat8.getColorCat());
        cat8.setColorCat(Color.CLASSIC_TABBY);
        System.out.println("Окрас Cat1: " + cat1.getColorCat());
        System.out.println("Окрас Cat8: " + cat8.getColorCat());

        System.out.println("\nЖивых кошек: " + Cat.count);
    }

    private static Cat getKitten()
    {
        return new Cat(1100.);
    }
    private static Cat copyCat(Cat cat)
    {
        return new Cat(cat.getColorCat(), cat.getWeight());
    }
}