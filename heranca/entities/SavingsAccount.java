public class SavingsAccount extends Account {
    private Double interestRet;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRet) {
        super(number, holder, balance);
        this.interestRet = interestRet;
    }

    public Double getInterestRet() {
        return interestRet;
    }

    public void setInterestRet(Double interestRet) {
        this.interestRet = interestRet;
    }

    public void updateBalance(){
        this.balance += this.balance * this.interestRet;
    }

    @Override
    public void withdraw(Double amount){
        this.balance -= amount;
    }
}
