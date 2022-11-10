package histoires;

import personnages.Humain;
import personnages.principaux.Commerçants;
import personnages.principaux.Ronins;
import personnages.principaux.Yakuzas;

public class MonHistoire {
    public static void main(String[] args) {

        Humain Humain = new Humain("Prof", 10, "Porto");
            Humain.sayHello();
            Humain.drink();
        Commerçants commercant = new Commerçants("Commerçant", 35);
            commercant.sayHello();
        Yakuzas yakuza = new Yakuzas("Yaku␣le␣noir", 42,
                "biere", "WarSong");
            yakuza.sayHello();
            yakuza.extort(commercant);
        Ronins ronin = new Ronins("Roro", 61, "sake");
            ronin.giveMoney(commercant, 10);
            ronin.duel(yakuza);
            ronin.sayHello();

    }
}