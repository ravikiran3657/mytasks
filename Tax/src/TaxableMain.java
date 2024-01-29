public class TaxableMain {
    public static void main(String[] args) {
         Employee emp=new Employee(10,"Abror",10000);
         emp.calTax();

         Product product=new Product(1001,1000.50,4);
         product.calTax();
    }
}
