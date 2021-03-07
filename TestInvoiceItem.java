package Task_06;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("CC1", "Information", 10, 12.00);

        System.out.println(i1.toString());

        i1.setUnitPrice(20.00);

        System.out.println(i1.getUnitPrice());
        System.out.println(i1.getTotal());
    }
}
