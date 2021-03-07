package Task_06;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(6,3,2021);

        System.out.println("Day is: " + d1.getDay());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println(d1.toString());
    }
}
