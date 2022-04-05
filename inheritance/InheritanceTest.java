package inheritance;

public class InheritanceTest {


    public static void main(String[] args) {
        Dog pet1 = new Dog();
        pet1.setName("Biscuit");
        pet1.displayName();
        pet1.eat();
        pet1.setNoOfHearts(1);
        pet1.displayNoOfHearts();
        System.out.println("_________________________________________________");
        Cat pet2 = new Cat();
        pet2.setName("Millie");
        pet2.displayName();
        pet2.eat();
        pet2.setNoOfHearts(1);
        pet2.displayNoOfHearts();
        System.out.println("_________________________________________________");
        Octopus pet3 = new Octopus();
        pet3.setName("Cally");
        pet3.displayName();
        pet3.eat();
        pet3.setNoOfHearts(4);
        pet3.displayNoOfHearts();
        System.out.println("_________________________________________________");
    }

}
