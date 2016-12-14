package lesson8.day1.lab2;

import java.util.Comparator;

public class Marketing {
    String employeeName;
    String productName;
    double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{");
        sb.append("EmployeeName:");
        sb.append(employeeName);
        sb.append("; ProductName:");
        sb.append(productName);
        sb.append("; SalesAmount:$");
        sb.append(String.format("%,.2f", salesAmount));
        sb.append("}");
        return sb.toString();
    }

    public static final Comparator<Marketing> BY_NAME_THEN_SALES = 
        new Comparator<Marketing>() {
            public int compare(Marketing m1, Marketing m2) {
              if (m1.employeeName.compareTo(m2.employeeName) == 0) {
                  if (m1.salesAmount == m2.salesAmount)
                      return 0;
                  else
                      return (m1.salesAmount > m2.salesAmount) ? 1 : -1;
            } else
                  return m1.employeeName.compareTo(m2.employeeName);
        }
    };
}
