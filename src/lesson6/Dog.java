package lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    /*бег: кот 200 м., собака 500 м.;*/
    @Override
    public void run(int value) {
        if (value > 0 && value <= 500) {
            super.run(value);
        }else{
            System.out.println("Я - собака, не могу так много бежать");
        }
    }

    /*плавание: кот не умеет плавать, собака 10 м.*/
    @Override
    public void swim(int value) {
        if (value > 0 && value <= 10) {
            super.swim(value);
        }else{
            System.out.println("Я - собака, не могу так много плыть");
        }
    }
}
