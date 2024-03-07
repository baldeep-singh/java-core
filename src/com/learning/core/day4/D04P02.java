package com.learning.core.day4;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        
        if (initialBalance < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        
        if (accType.equalsIgnoreCase("saving") && initialBalance < 1000) {
            throw new LowBalanceException("lowBalance");
        } else if (accType.equalsIgnoreCase("current") && initialBalance < 5000) {
            throw new LowBalanceException("lowBalance");
        }
        
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (accType.equalsIgnoreCase("saving") && balance < 1000) {
            throw new LowBalanceException("lowBalance");
        } else if (accType.equalsIgnoreCase("current") && balance < 5000) {
            throw new LowBalanceException("lowBalance");
        }
        return balance;
    }
}

public class D04P02{
    public static void main(String[] args) {
        try {
            BankAccount acc1 = new BankAccount(123, "john", "saving", 900);
            acc1.deposit(-900); // Throws NegativeAmountException
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            BankAccount acc2 = new BankAccount(123, "john", "saving", -900); // Throws NegativeAmountException
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
