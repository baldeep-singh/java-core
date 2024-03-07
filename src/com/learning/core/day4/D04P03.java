package com.learning.core.day4;
class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

class Validator {
    public void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidAppName(applicant.applicantName))
            throw new CatheyBankException("Invalid Applicant name");
        if (!isValidPost(applicant.postApplied))
            throw new CatheyBankException("Invalid Post");
        if (!isValidAge(applicant.applicantAge))
            throw new CatheyBankException("Invalid Age");
        System.out.println("All details are valid");
    }

    private boolean isValidAppName(String name) {
        return name != null && !name.isEmpty();
    }

    private boolean isValidPost(String post) {
        return post.equals("probationary officer") ||
               post.equals("assistant") ||
               post.equals("special cadre officer");
    }

    private boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

class Applicant {
    String applicantName;
    String postApplied;
    int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }
}

public class D04P03{
    public static void main(String[] args) {
        Validator validator = new Validator();

        try {
            validator.validate(new Applicant("mary", "assistant", 34));
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.validate(new Applicant("mary", "clerk", 27));
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.validate(new Applicant("probationary officer", "", 30));
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }

        try {
            validator.validate(new Applicant("joseph", "probationary officer", 30));
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }
    }
}
