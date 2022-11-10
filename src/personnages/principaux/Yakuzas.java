package personnages.principaux;

import personnages.Humain;

public class Yakuzas extends Humain {

    private String clan;
    private int reputation=0;
    public Yakuzas(String name, int money, String drink, String clan) {
        super(name, money, drink);
        this.clan=clan;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int extort(Commerçants commerçant){
        int n = commerçant.getMoney();
        setMoney(getMoney()+n);
        reputation+=1;
        talk("HAHA, je viens de voler " + n + " ryо̄s à " + commerçant.getName());
        commerçant.beExtorted();
        return n;
    }

    public void win(){
        reputation+=1;
        talk("HAAA, j'ai gagné !!!");
    }

    public void sayHello(){
        super.sayHello();
        talk("Je suis du clan " + clan);
    }

    public int lose(){
        int n= getMoney();
        setMoney(0);
        reputation-=1;
        talk("Haa...j'ai perdu le duel ainsi que mes " + n + " ryо̄s");
        return n;
    }


}