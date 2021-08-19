import lesson5.Person;

public class HomeWorkApp5 {
    /*
Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
*/
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "892312313", 30001, 20);
        persArray[2] = new Person("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "892312314", 30002, 40);
        persArray[3] = new Person("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "892312315", 30003, 50);
        persArray[4] = new Person("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "892312316", 30004, 60);

        /*С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/
        for(int i = 0; i < persArray.length; i++){
            Person p = persArray[i];
            if(p.getAge() > 40){
                p.printInfo();
            }
        }
    }
}
