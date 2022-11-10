package personnages.principaux;
import personnages.Humain;

public class Commerçants extends Humain {
    public Commerçants(String name, int money) {
        super(name, money, "thé");
    }

    public int beExtorted(){
        int n = getMoney();
        loseMoney(n);
        talk("Le monde est vraiment trop injuste !!!");
        return n;
    }

    public void recevoir(int moneyReçu){
        setMoney(getMoney()+moneyReçu);
    }

}