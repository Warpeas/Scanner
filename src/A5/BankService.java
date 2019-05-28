package A5;

import java.util.ArrayList;

public class BankService {
    private double availableCash;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    
    public BankAccount getAccount(Customer customer) {
        int c = -1;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getOwner().equals(customer))
                c = i;
        }
        if (c != -1)
            return accounts.get(c);
        else
            return null;
    }
    
    public BankAccount getAccount(String ssn) {
        int c = -1;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getOwner().getSocialSecurityNumber().equals(ssn))
                c = i;
        }
        if (c != -1)
            return accounts.get(c);
        else
            return null;
    }
    
    public void checkAccountBalance(String ssn) {
        if (getAccount(ssn) == null)
            System.out.println("No account find");
        else {
            switch (getAccount(ssn).getOwner().getGender()) {
                case FEMALE:
                    System.out.printf("Ms. %s, your account balance: %,.2f \u00A5\n", getAccount(ssn).getOwner().getLastName(), getAccount(ssn).getBalance());
					break;
                case MALE:
                    System.out.printf("Mr. %s, your account balance: %,.2f \u00A5\n", getAccount(ssn).getOwner().getLastName(), getAccount(ssn).getBalance());
					break;
            }
        }
    }
    
    public void createAccount(String firstName, String lastName, char gender, String ssn) {
        if (getAccount(ssn) == null && Customer.checkSSN(ssn) && Customer.checkName(firstName) && Customer.checkName(lastName) && (gender == 'm' || gender == 'f')) {
            accounts.add(new BankAccount(new Customer(firstName, lastName, gender, ssn), 0));
            switch (getAccount(ssn).getOwner().getGender()) {
                case MALE:
                    System.out.printf("Congrats, Mr. %s! Your account is created successfully.\n", Customer.formatName(lastName));
                    break;
                case FEMALE:
                    System.out.printf("Congrats, Ms. %s! Your account is created successfully.\n", Customer.formatName(lastName));
                    break;
            }
        } else if (getAccount(ssn) != null)
            switch (Customer.formatGender(gender)) {
                case MALE:
                    System.out.printf("Mr. %s, you already have an account with a balance %,.2f \u00A5.\n", Customer.formatName(lastName), getAccount(ssn).getBalance());
					break;
                case FEMALE:
                    System.out.printf("Ms. %s, you already have an account with a balance %,.2f \u00A5.\n", Customer.formatName(lastName), getAccount(ssn).getBalance());
					break;
            
            }
//            System.out.printf("Mr. %s, you already have an account with a balance %.2f \u00A5.\n", Customer.formatName(lastName), getAccount(ssn).getBalance());
        else {
            if (!Customer.checkSSN(ssn))
                System.out.println("Invalid social security number");
            if (!Customer.checkName(lastName) || !Customer.checkName(firstName))
                System.out.println("Invalid name");
            if (gender != 'm' && gender != 'f')
                System.out.println("Invalid input for gender");
        }
    }
    
    public void makeDeposit(String ssn, double amount) {
        if (!Customer.checkSSN(ssn))
            System.out.println("Invalid social security number");
        else if (getAccount(ssn) != null && amount > 0) {
            System.out.printf("Original balance: %.2f \u00A5\n", getAccount(ssn).getBalance());
            getAccount(ssn).setBalance(getAccount(ssn).getBalance() + amount);
            System.out.printf("Balance after deposit: %.2f \u00A5\n", getAccount(ssn).getBalance());
        } else if (getAccount(ssn) == null)
            System.out.println("No account found");
        else
            System.out.println("Invalid amount");
    }
    
    public void withdraw(String ssn, double amount) {
        if (getAccount(ssn) == null)
            System.out.println("No account found");
        else if (amount > 0 && amount <= getAccount(ssn).getBalance() && amount <= availableCash) {
            System.out.printf("Original balance: %.2f \u00A5\n", getAccount(ssn).getBalance());
            getAccount(ssn).setBalance(getAccount(ssn).getBalance() - amount);
            availableCash -= amount;
            System.out.printf("Balance after withdrawal: %.2f \u00A5\n", getAccount(ssn).getBalance());
        } else if (amount > getAccount(ssn).getBalance() || amount > availableCash)
            System.out.println("No enough balance or cash");
        else
            System.out.println("Invalid amount");
    }
    
    public static void calculateMonthlyPayment(double loanAmount, int years) {
        double rate;
        
        if (years > 0 && loanAmount > 0) {
            if (years <= 2)
                rate = 0.0435;
            else if (years <= 5)
                rate = 0.0475;
            else
                rate = 0.0490;
            System.out.println();
            System.out.printf("Loan amount: %,.2f \u00A5\nYearly interest rate: %.2f%%\nNumber of installments (months): %d\nMonthly payment: %,.2f \u00A5\nTotal interest: %,.2f \u00A5\n", loanAmount, rate * 100, years * 12, loanAmount * (rate / 12 * Math.pow(1 + rate / 12, years * 12)) / (Math.pow(1 + rate / 12, years * 12) - 1), years * 12 * loanAmount * (rate / 12 * Math.pow(1 + rate / 12, years * 12)) / (Math.pow(1 + rate / 12, years * 12) - 1) - loanAmount);
        } else
            System.out.println("Invalid loan");
    }
    
    BankService() {
        availableCash = 100000;
        accounts.clear();
		System.out.printf("Initializing bank service: no accounts yet, %.2f \u00A5 cash available\n",availableCash);
    }
}
