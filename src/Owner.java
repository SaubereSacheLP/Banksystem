/**
 * @author SaubereSache
 * @since 10.04.2017
 */
public class Owner {
    private String vorname, nachname;
    private int verknüpfung;

    public Owner(double startzustand, String vorname, String nachname, int verknüpfung){
        if(startzustand < 0){
            System.out.println("The Value " + startzustand + " is to small! Please choose something above 0");
            return;
        }
        this.vorname = vorname;
        this.nachname = nachname;
        this.verknüpfung = verknüpfung;
        main.bankkonto[verknüpfung] = new Bankkonto(startzustand);
    }
    public Bankkonto bankkonto(){
        return main.bankkonto[verknüpfung];
    }
    public Double getBalance(){
        return main.bankkonto[verknüpfung].getBalance();
    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
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
