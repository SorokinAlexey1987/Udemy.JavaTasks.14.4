public class Worker {
    String name;
    String position;
    int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String Money(int i) {
        String result;
        int WorkerMoney = 0;
        for (int j = 1; j <= i; j++){
            WorkerMoney += salary;
        }
        result = "Сотрудник: " + name + "\r\nДолжность: " + position + "\r\nЗарплата за " + i + " месяцев: " + WorkerMoney;
        return result;
    }
}
