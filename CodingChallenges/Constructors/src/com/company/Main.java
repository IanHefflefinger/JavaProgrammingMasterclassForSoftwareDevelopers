package com.company;

public class Main {

    public static void main(String[] args) {
//        // create new object and set variables
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber(123456789);
//        bankAccount.setBalance(1234.00);
//        bankAccount.setCustomerName("Captain Crunch");
//        bankAccount.setEmail("thecap@supercereal.com");
//        bankAccount.setPhoneNumber("8018675309");
//
//        // retrieve variables to ensure object was created successfully
//        System.out.println("object = " + bankAccount);
//        System.out.println("account number = " + bankAccount.getAccountNumber());
//        System.out.println("balance = " + bankAccount.getBalance());
//        System.out.println("customer name = " + bankAccount.getCustomerName());
//        System.out.println("email = " + bankAccount.getEmail());
//        System.out.println("phone number = " + bankAccount.getPhoneNumber());
//
//        // test deposit and withdrawal
//        bankAccount.depositFunds(567);
//        bankAccount.withdrawFunds(765);
//        // insufficient funds
//        bankAccount.withdrawFunds(100999);

        // test VipCustomer
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1);
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());
        System.out.println();

        VipCustomer customer2 = new VipCustomer("Jim Bob", 9);
        System.out.println(customer2);
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());
        System.out.println();

        VipCustomer customer3 = new VipCustomer("Jane McNothing", 400, "jane@whatever.com");
        System.out.println(customer3);
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());
    }
}
