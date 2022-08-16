package lesson3;

/*
 * 1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2.Конструктор класса должен заполнять эти поля при создании объекта.
 * 3.Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4.Создать массив из 5 сотрудников.
 * 5.С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class MainApp {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Petr", "HR manager", "ivano@gmail.com", "9362856294", 60000, 39);
        empArray[1] = new Employee("Petrov Ivan", "Engineer", "petrov@gmail.com", "6238591437", 70000, 41);
        empArray[2] = new Employee("Zaharova Dariia", "Accounter", "zaharova@mail.com", "7458762839", 34000, 40);
        empArray[3] = new Employee("Dubskih Elena", "Secretary", "dubskih@mail.com", "1378859342", 30000, 26);
        empArray[4] = new Employee("Sokolov Nikita", "Manager", "sokolov@mail.com", "4592349114", 80000, 53);

        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}