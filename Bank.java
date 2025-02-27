public class Bank {
    static int accNo = 100;
    int acc;

    Bank(){
        acc = accNo++;
    }
    void AccNo(){
        System.out.println("Accno" + acc);
    }
}
class Bank_Acc{
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.AccNo();
        b2. AccNo();

    }
}
