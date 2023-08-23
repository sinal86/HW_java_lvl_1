package lesson5;

public class Employee {//вот 5е задание....я не знаю почему оно нормально не добавилось
    private final String surName;
    private final String name;
    private final String lastName;
    private final String post;
    private final int phoneNumber;
    private final String email;
    private final String salary;
    private final int age;

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPost() {
        return post;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String surName,
                    String name,
                    String lastName,
                    int age,
                    String post,
                    int phoneNumber,
                    String email,
                    String salary) {
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfoEmployee(Employee employee) {
        System.out.println(
                "Фамилия: " + employee.getSurName() + System.lineSeparator() +
                "Имя: " + employee.getName() + System.lineSeparator() +
                "Отчество: " + employee.getLastName() + System.lineSeparator() +
                "Возраст: " + employee.getAge() + System.lineSeparator() +
                "Должность: " + employee.getPost() + System.lineSeparator() +
                "Телефон: " + employee.getPhoneNumber() + System.lineSeparator() +
                "Эл.почта: " + employee.getEmail() + System.lineSeparator() +
                "Зарплата: " + employee.getSalary() + System.lineSeparator()
        );
    }
}
