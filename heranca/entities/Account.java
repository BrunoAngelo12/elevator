public class Account {
    private Integer number;
    private String holder;
    protected Double balance; //protected para poder usar atributo em outra classe do mesmo pacote ou em subclasse
    
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw (Double amount){
        this.balance -= amount;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

}
