package lesson5;

/*. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.*/
public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    /*Конструктор класса должен заполнять эти поля при создании объекта.*/
    public Person(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /*Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/
    public void printInfo() {
        System.out.println(fio + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

    public int getAge() {
        return age;
    }
}
