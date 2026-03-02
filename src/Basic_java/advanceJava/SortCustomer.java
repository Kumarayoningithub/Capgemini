//package advanceJava;
//
//import java.util.*;
//
//public class SortCustomer {
//
//    public static void main(String[] args) {
//
//        List<Customer> customers = new ArrayList<>();
//
//        customers.add(new Customer(5000, "Ayan"));
//        customers.add(new Customer(7000, "Rohit"));
//        customers.add(new Customer(5000, "Sneha"));
//        customers.add(new Customer(7000, "Ankit"));
//        customers.add(new Customer(5000, "Bimal"));
//
//        Collections.sort(customers, new Comparator<Customer>() {
//
//           
//            public int compare(Customer c1, Customer c2) {
//
//                
//                if (c1.networth > c2.networth) {
//                    return 1;
//                } else if (c1.networth < c2.networth) {
//                    return -1;
//                }
//
//               
//                if (c1.name.compareTo(c2.name) > 0) {
//                    return 1;
//                } else if (c1.name.compareTo(c2.name) < 0) {
//                    return -1;
//                }
//
//              
//                return 0;
//            }
//        });
//
//       
//        for (Customer c : customers) {
//            System.out.println(c.name + " -> " + c.networth);
//        }
//    }
//}

package advanceJava;

import java.util.ArrayList;

public class SortCustomer {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(5000, "Ayan"));
        customers.add(new Customer(7000, "Rohit"));
        customers.add(new Customer(5000, "Sneha"));
        customers.add(new Customer(7000, "Ankit"));
        customers.add(new Customer(5000, "Bimal"));

        int n = customers.size();

        // Manual sorting using nested loops
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                Customer c1 = customers.get(i);
                Customer c2 = customers.get(j);

                if (shouldSwap(c1, c2)) {
                    // swap
                    customers.set(i, c2);
                    customers.set(j, c1);
                }
            }
        }

        // Print sorted customers
        for (Customer c : customers) {
            System.out.println(c.name + " -> " + c.networth);
        }
    }

    // Manual comparison logic
    static boolean shouldSwap(Customer c1, Customer c2) {

        // 1️⃣ Compare networth
        if (c1.networth > c2.networth) {
            return true;
        } else if (c1.networth < c2.networth) {
            return false;
        }

        // 2️⃣ Networth same → compare name
        if (c1.name.compareTo(c2.name) > 0) {
            return true;
        }

        return false;
    }
}

