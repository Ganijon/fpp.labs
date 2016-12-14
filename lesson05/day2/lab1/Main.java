package lesson5.day2.lab1;

public class Main {
    
    public static void main(String[] args) {
        
        Payable[] payables = new Payable[6];

        payables[0] = new BasePlusCommissionEmployee("Bob", "Beige", "BB-12345", 8000.00, 2.0, 65000.00);
        payables[1] = new CommissionEmployee("Alice", "Gray", "AA-12345", 10000.00, 4.0);
        payables[2] = new HourlyEmployee("Catherine", "White", "CC-12345", 14.00, 5.0);
        payables[3] = new SalariedEmployee("David", "Black", "DD-12345", 1500.00);
        payables[4] = new SalariedEmployee("Erica", "Green", "EE-12345", 1300.00);
        payables[5] = new Invoice("I-012345", "Payment due", 1, 100.00); 
        
        for(Payable payable: payables) {
            System.out.print(payable);
            System.out.println("  Payment Amount:$" + payable.getPaymentAmount());
        }
    }
}
