/**
 * @author SaubereSache
 * @since 10.04.2017
 */
public class main {
    public static Bankkonto[] bankkonto;
    public static void main(String[] args){
        Owner[] owners = new Owner[4];
        owners[0] = new Owner(12, "Constantin", "Schreiber", 1);
        owners[1] = new Owner(1200, "Walter", "Schreiber", 1);

        owners[0].bankkonto().getBalance();
    }

}
