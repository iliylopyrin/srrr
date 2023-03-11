public class Main {

    public static void main(String[] args) {

        float coat = 70;
        double coatDiscount = 0.45;

        float hat = 25;
        double hatDiscount = 0.37;

        float businessSuit = 53;
        double businessSuitDiscount = 0.44;

        float sorochka = 19;
        double sorochkaDiscount = 0;

        float shoes = 41;
        double shoesDiscount = 0.32;


        double newCoat = (coat - (coat * coatDiscount));
        double newHat = (hat - (hat * hatDiscount));
        double newBusinessSuit = (businessSuit - (businessSuit * businessSuitDiscount));
        double newSorochka = (sorochka - (sorochka * sorochkaDiscount));
        double newShoes = (shoes - (shoes * shoesDiscount));


        float account = 312;

        double sumAll = newCoat + newHat + newBusinessSuit + newSorochka + newShoes;

        double ostatok = ( account - sumAll);
        System.out.println("останется" + ostatok);

        if (account >= sumAll) System.out.println("можно взять");
        else System.out.println("Дорого");

    }
}