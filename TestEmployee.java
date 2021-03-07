package Task_06;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nguyen", "Nam", 52000);
        System.out.println(e1.toString());

        e1.setSalary(1000);
        System.out.println(e1.getSalary());

        e1.raiseSalary(20);
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());
    }
}
