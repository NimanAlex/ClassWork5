//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Students student = new Students("S123", "John", "Doe", 20);
        System.out.println("Student Information:");
        student.getInfo();

        // Создаем экземпляр класса Employee и вызываем getInfo
        Employee employee = new Employee("Jane", "Smith", 45);
        System.out.println("\nEmployee Information:");
        employee.getInfo();
        }
    }