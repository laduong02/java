// Main.java
public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng TaxManager để quản lý danh sách các Taxpayer
        TaxManager taxManager = new TaxManager();

        // Thêm các đối tượng Taxpayer vào danh sách
        taxManager.addTaxpayer(new Company());
        taxManager.addTaxpayer(new FreeLand());
        taxManager.addTaxpayer(new Employee());

        // Lấy tổng số tiền thuế từ các Taxpayer và in ra màn hình
        double totalTax = taxManager.getTax();
        System.out.println("Total tax collected: " + totalTax);
    }
}
