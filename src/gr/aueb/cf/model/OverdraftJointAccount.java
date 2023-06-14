package gr.aueb.cf.model;

import gr.aueb.cf.exceptions.NegativeAmountException;
import gr.aueb.cf.exceptions.SssNotValidException;

public class OverdraftJointAccount extends JointAccount{

    public OverdraftJointAccount() {}

    public OverdraftJointAccount(User holder, String iban, double balance, User secondHolder) {
        super(holder, iban, balance, secondHolder);
    }

    @Override
    public void withdraw(double amount, String ssn) throws SssNotValidException, NegativeAmountException {
        try {
            if (amount < 0) throw new NegativeAmountException(amount);
            if (!isSsnValid(ssn)) throw new SssNotValidException(ssn);

            setBalance(getBalance() - amount);
        } catch (SssNotValidException | NegativeAmountException e) {
            System.out.println("Error : withdrawal");
            throw e;
        }
    }
}
