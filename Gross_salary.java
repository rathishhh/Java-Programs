import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int salary = sc.nextInt();
                double gs;

                if (salary < 1500) {
                 
                    gs = salary + (salary * 0.10) + (salary * 0.90);
                } else {
           
                    gs = salary + 500 + (salary * 0.98);
                }
                

                System.out.printf("%.2f\n", gs);
            }
        }
        sc.close();
    }
}