public class programm {
    
    public static void main(String[] args) {
        Account acount1 = new Account(01,"Bruno", 0.0);
        SavingsAccount savingAcount1 = new SavingsAccount(02, "BACorp", 1000.00, 5.0);
        BusinessAccount businessAccount1 = new BusinessAccount(03, "SACorp", 5000.00, 1000.0);

        //UPCASTING = Transformar objeto de subclasse em objeto de superclasse
        Account acount2 = businessAccount1;
        
        //DOWNCASTING
        //BusinessAccount businessAccount2 = (BusinessAccount)acount1;//esse da erro pq a instancia nao é compativel
        BusinessAccount businessAccount2 = (BusinessAccount)acount2;
        System.out.println(businessAccount2);

        //Subclasse para Subclasse
        SavingsAccount savingsAccount2 = new SavingsAccount(04, "Brn", 5000.00, 11.0);
        //BusinessAccount businessAccount3 = savingsAccount2; -> Isso não é possivel pois são de instancias/classes diferentes
        if (savingsAccount2 instanceof SavingsAccount){
            SavingsAccount savingsAccount3 = savingsAccount2;
            System.out.println("Nice!");
        }
    }
}
