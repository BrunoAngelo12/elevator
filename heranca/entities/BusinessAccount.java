public class BusinessAccount extends Account {
    
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount() {
        super(); //Usado para puxar o construtor da superclasse
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(Double amount){
        deposit(amount);
    }

    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);
        this.balance -= 2.0;
    }

}
