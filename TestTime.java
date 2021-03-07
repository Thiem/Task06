package Task_06;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(16,03,19);
        System.out.println(t1.toString());

        Time t2 = t1.nextSecond();
        System.out.println(t2.toString());

        Time t3 = t1.nextSecond();
        System.out.println(t3.toString());
    }
}
