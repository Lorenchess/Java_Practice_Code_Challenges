package Practice_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionDemo demo = new CollectionDemo();
        demo.show();
        List<Customer> customers = new ArrayList<>();
        Collections.addAll(customers, new Customer("Ramon", "1ramon@gmail.com"), new Customer("Alfredo", "2alfredo@yahoo.com"), new Customer("Bertha", "3bertha@gmail.com"));
        Collections.sort(customers);
        System.out.println(customers);//[Customer{name='Alfredo'}, Customer{name='Bertha'}, Customer{name='Ramon'}]
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers); //[Customer{name='Ramon'}, Customer{name='Alfredo'}, Customer{name='Bertha'}]
    }
}
