/**
 * @author SaubereSache
 * @since 10.04.2017
 */
public class Bankkonto {
    private double balance = 0;

    public Bankkonto(double money){
        balance = (balance + money);
    }

    public double getBalance(){
        return balance;
    }

    public void setMoney(double newMoney){
        if(newMoney < 0){
            System.out.println("Your Value is to small, please choose something above 0");
            return;
        }
        this.balance = newMoney;
    }
    public void addMoney(double addMoney){
        Double moneyBefore = balance;
        if((moneyBefore + addMoney) < 0){
            System.out.println("Your value \"" + addMoney + "\" is to small! Please choose something above -" + moneyBefore);
            return;
        }
        this.balance = (addMoney + moneyBefore);
    }
}
