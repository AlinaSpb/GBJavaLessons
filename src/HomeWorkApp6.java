import lesson6.Animal;
import lesson6.Cat;
import lesson6.Dog;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Animal bobikDog = new Dog("Бобик");
        Animal murzik = new Cat("Мурзик");

        bobikDog.run(100);
        bobikDog.run(600);
        bobikDog.swim(10);
        bobikDog.swim(20);

        murzik.run(100);
        murzik.run(600);
        murzik.swim(10);
    }
}
