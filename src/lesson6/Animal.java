package lesson6;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
  2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
  3. У каждого животного есть ограничения на действия
     (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).*/
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int value) {
        System.out.println(getName() + " пробежал " + value + " м.");
    }

    public void swim(int value) {
        System.out.println(getName() + " проплыл " + value + " м.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
