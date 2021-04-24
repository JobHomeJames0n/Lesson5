package geekbrains_lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Вячеслав Кобрин", "Генеральный директор",
                        "vk@primer,ru", "+79996665544", 250000, 55),
                new Employee("Иван Зайцев", "Директор по развитию",
                        "vz@primer,ru", "+79998884455", 127000, 42),
                new Employee("Дмитрий Медведев", "Охранник",
                        "dm@primer,ru", "+79997771234", 19000, 21),
                new Employee("Олеся Лисина", "Ведущий разработчик",
                        "ol@primer,ru", "+79995554789", 120000, 28),
                new Employee("Кристина Волкова", "Директор по работе с клиентами",
                        "kv@primer,ru", "+79994445896", 138000, 48),
        };

        // если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}
