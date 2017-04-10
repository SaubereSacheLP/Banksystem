/**
 * @author SaubereSache
 * @since 10.04.2017
 */
public class Owner {
    private String vorname, nachname;
    private double money;
    public Owner(double startzustand, String vorname, String nachname){
        if(startzustand < 0){
            System.out.println("The Value " + startzustand + " is to small! Please choose something above 0");
            return;
        }
        money = startzustand;
        this.vorname = vorname;
        this.nachname = nachname;
    }
    public Double getMoney(){
        return money;
    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }
    public void setMoney(double newMoney){
        if(newMoney < 0){
            System.out.println("Your Value is to small, please choose something above 0");
            return;
        }
        this.money = newMoney;
    }
    public void addMoney(double addMoney){
        Double moneyBefore = money;
        if((moneyBefore + addMoney) < 0){
            System.out.println("Your value \"" + addMoney + "\" is to small! Please choose something above -" + moneyBefore);
            return;
        }
        this.money = (addMoney + moneyBefore);
    }
    public void setVorname(String newVorname){
        if(newVorname.isEmpty()){
            System.out.println("This value needs to be longer than 0");
        }
        this.vorname = newVorname;
    }
    public void setNachname(String newNachname){
        if(newNachname.length() <= 0){
            System.out.println("This value needs to be longer than 0");
        }
        this.nachname = newNachname;
    }
}
