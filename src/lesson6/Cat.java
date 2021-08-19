package lesson6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    /*бег: кот 200 м., собака 500 м.;*/
    @Override
    public void run(int value) {
        if (value > 0 && value <= 200) {
            super.run(value);
        } else {
            System.out.println("Я - кот, не могу так много бежать");
        }
    }

    /*плавание: кот не умеет плавать, собака 10 м.*/
    @Override
    public void swim(int value) {
        System.out.println("Я - кот, не умею плавать");
    }
}
