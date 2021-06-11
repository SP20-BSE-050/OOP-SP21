
package lab14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Runner_acc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account[] account = new Account[10];

        account[0] = new Account("0", 4500);
        account[1] = new Account("1", 5600);
        account[2] = new Account("2", 8800);
        account[3] = new Account("3", 5600);
        account[4] = new Account("4", 7500);
        account[5] = new Account("5", 6510);
        account[6] = new Account("6", 4850);
        account[7] = new Account("7", 4560);
        account[8] = new Account("8", 9500);
        account[9] = new Account("9", 6540);

        ArrayList<Account> Records = new ArrayList<>();

        Records.addAll(Arrays.asList(account));

        Account.writeFile(Records);
        
        System.out.println("ENTER your account Number: ");

        String accno= input.nextLine();

        boolean found=false;

        for(int i=0; i<account.length;i++){

            if(accno.equals(account[i].getAccNo())){

                found= true;

                System.out.println(i);

                System.out.println("Press 1 To Deposit: \nPress 2 to withdraw: \nPress 3 to Transfer: \nPress 4 for Balance Inquiry: ");

                int choice = input.nextInt();

                if(choice==1){

                    System.out.println("Enter Amount to Deposit: ");

                    int dep = input.nextInt();

                    account[i].deposit(dep);

                }

                if(choice==2){

                    System.out.println("Enter Amount to Withdraw: ");

                    int with = input.nextInt();

                    account[i].withdraw(with);

                }

                if(choice==3){

                    System.out.println("Enter Amount to Transfer: ");

                    int tran = input.nextInt();

                    System.out.println("Enter Account number of Receiver: ");

                    Scanner in = new Scanner(System.in);

                    String to=in.nextLine();

                    boolean f=false;

                    for (Account account1 : account) {

                        if (to.equals(account1.getAccNo())) {

                            f= true;

                            account[i].transfer(account1, tran);

                        }        

                    }

                    if(!f){

                         System.out.println("Account not Found");

                     }

                }

                    

                if(choice==4){

                    account[i].BalanceInquiry();

                }

            }

        }

        if (!found){

            System.out.println("Enter a valid Account Number!");

        }

        Account.writeFile(Records);

        Account.readFile(Records);


    }

}
