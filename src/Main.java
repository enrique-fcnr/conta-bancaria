import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Main{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account conta1;

        System.out.print("Enter account number: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit: (Y / N)");
        char response = sc.next().charAt(0);
        if(response == 'Y'){
            System.out.print("Insert the initial value: ");
            double initialDeposit = sc.nextDouble();
            conta1 = new Account(num, holder, initialDeposit);
        }
        else {
            conta1 = new Account(num, holder);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(conta1);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta1.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(conta1);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta1.withdraw(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.println(conta1);

        sc.close();
    }
        }