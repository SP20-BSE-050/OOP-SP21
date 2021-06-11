
package lab14;

import java.io.*;

import java.util.ArrayList;


public class Account implements Serializable {

    private String acc_No;

    private int balance;


    public Account(String acc_No, int balance){

        this.acc_No=acc_No;

        this.balance=balance;

    }


    public void setAccNo(String acc_No) {

        acc_No = acc_No;

    }


    public void setBalance(int balance) {

        this.balance = balance;

    }

    public int getBalance() {

        return balance;

    }

    public String getAccNo() {

        return acc_No;

    }

    public void withdraw(int cash){

        balance -= cash;

        System.out.println("Money Withdrawn: "+cash+"\nCurrent Balance: "+balance+"\n\t\t<--------->");

    }

    public void deposit(int cash){

        balance +=cash;

        System.out.println("Money Deposited: "+cash+"\nCurrent Balance:" +balance+"\n\t\t<--------->");

    }

    public void transfer(Account to, int cash){

        to.setBalance(balance+cash);

        this.setBalance(balance-cash);

        System.out.println(cash+" transferred successfully.\n Current Balance is:"+balance+"\n\t\t<--------->");
    }

    public void BalanceInquiry(){

        System.out.println("Current Balance: "+getBalance()+"\n\t\t<--------->");

    }

    @Override

    public String toString() {

        return "Account Number: "+acc_No+"\nBalance: "+balance;
    }

    public static void writeFile(ArrayList<Account> record) {

        FileOutputStream bookStream;

        try {

            bookStream = new FileOutputStream("Account.txt");

            try (ObjectOutputStream objectStream = new ObjectOutputStream(bookStream)) {

                objectStream.writeObject(record.toString());

            }
        } catch (IOException e) {

        }

    }

    public static void readFile(ArrayList<Account> record) {

        try {

            FileInputStream inputStream = new FileInputStream("Account.txt");

            try (ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

                System.out.println(objectInputStream.readObject());

            }

        } catch (IOException | ClassNotFoundException e) {

        }

    }
}

   