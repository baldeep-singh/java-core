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
        if (accType.equalsIgnoreCase("savings") && initialBalance < 1000) {
            throw new LowBalanceException("LowBalance");
        } else if (accType.equalsIgnoreCase("current") && initialBalance < 5000) {
            throw new LowBalanceException("LowBalance");
        }
        if (initialBalance < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }
        this.balance = initialBalance;
    }

    public void deposit(float amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }
        balance += amount;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equalsIgnoreCase("savings")) {
            throw new LowBalanceException("LowBalance");
        } else if (balance < 5000 && accType.equalsIgnoreCase("current")) {
            throw new LowBalanceException("LowBalance");
        }
        return balance;
    }
}

public class D04P01 {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount(123, "John", "savings", 900);
            System.out.println("Balance after creating account1: " + account1.getBalance());
            account1.deposit(200);
            System.out.println("Balance after depositing 200: " + account1.getBalance());
            BankAccount account2 = new BankAccount(123, "John", "savings", -900); // Should throw NegativeAmountException
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
