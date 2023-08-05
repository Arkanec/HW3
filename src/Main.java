public class Main {
    public static void main(String[] args) {
        int a = 40000;
    System.out.println("Значение переменной a с типом int равно "+ a +"");
    byte x = 7;
    System.out.println("Значение переменной x с типом byte равно "+ x +"");
    short c = 30500;
    System.out.println("Значение переменной c с типом short равно "+ c +"");
    long d = 127000000L;
    System.out.println("Значение переменной d с типом long равно "+ d +"");
    float w = 6.987f;
    System.out.println("Значение переменной w с типом float равно "+ w +"");
    double p = 1.45678;
    System.out.println("Значение переменной p с типом double равно "+ p +"");

    System.out.println("Задача 2");
    byte q = 67;
    System.out.println(q);
    float e = 27.12F;
    System.out.println(e);
    long r = 987678965549L;
    System.out.println(r);
    double t = 2.786;
    System.out.println(t);
    short u = 569;
    System.out.println(u);
    short i = -159;
    System.out.println(i);
    int o = 27897;
    System.out.println(o);

    System.out.println("Задача 3");
    byte LudaStudent = 23;
    byte AnnaStudent = 27;
    byte EkaterinaStudent = 30;
    int TotalStudent = LudaStudent + AnnaStudent + EkaterinaStudent;
    short TotalPuper = 480;
    int Puper = TotalPuper / TotalStudent;
    System.out.println("На каждого ученика рассчитано " + Puper + " листов бумаги");

    System.out.println("Задача 4");
    byte bottle = 16;
    byte time = 2;
    int Time20Minuts = bottle / time * 20;
    System.out.println("За 20 минут машина произвела " + Time20Minuts + " штук бутылок");
    int day = bottle / time * 60 * 24;
    System.out.println("За сутки машина произвела " + day + " штук бутылок");
    int Time3Days = bottle / time * 60 * 72;
    System.out.println("За 3 дня машина произвела " + Time3Days + " штук бутылок");
    int month = bottle / time * 60 * 24 * 30;
    System.out.println("За месяц машина произвела " + month + " штук бутылок");

    System.out.println("Задача 5");
    int TotalPaint = 120;
    byte WhitePaint = 2;
    byte BrownPaint = 4;
    int Class = TotalPaint / (WhitePaint + BrownPaint);
    int TotalWhite = Class * WhitePaint;
    int TotalBrown = Class * BrownPaint;
    System.out.println("В школе, где " + Class + " нужно " + TotalWhite + " банок белой краски и " + TotalBrown + " банок " +
            "коричневой краски");

    System.out.println("Задача 6");
    byte BananWeight = 80;
    byte MilkWeight = 105;
    byte PlombirWeight = 100;
    byte EggsWeight = 70;
    byte Banan = 5;
    byte Milk = 2;
    byte Plombir = 2;
    byte Eggs = 4;
    int BananTotalWeight = BananWeight * Banan;
    int MilkTotalWeight = MilkWeight * Milk;
    int PlombirTotalWeight = PlombirWeight * Plombir;
    int EggsTotalWeight = EggsWeight * Eggs;
    int Gr = BananTotalWeight + MilkTotalWeight + PlombirTotalWeight + EggsTotalWeight;
    int GrPerKg = 1000;
    float Kg = Gr/(float)GrPerKg;
    System.out.println("Завтрак весит " + Gr + " грамм или " + Kg + " кг");

    System.out.println("Задача 7");
    byte WeightSportsmen = 7;
    int KgPerGr = 1000;
    int WeightSportsmenGr = WeightSportsmen * KgPerGr;
    int PurposeDay1 = 250;
    int PurposeDay2 = 500;
    int Days1 = WeightSportsmenGr / PurposeDay1;
    int Days2 = WeightSportsmenGr / PurposeDay2;
    System.out.println("Теряя в день 250 грамм спортмену надо " + Days1 + " дней, а теряя по 500 надо " + Days2 + "");

    System.out.println("Задача 8");
    int Masha = 67760;
    int Denis = 83690;
    int Kristina = 76230;
    double height = 0.1;
    double MashaHeight = Masha * height + Masha;
    double DenisHeight = Denis * height + Denis;
    double KristinaHeight = Kristina * height + Kristina;
    double MashaDifference = (MashaHeight - Masha) * 12;
    System.out.println("Маша теперь получает " + MashaHeight + " рублей. Ее годовой доход вырос на " + MashaDifference + " рублей");
    double DenisDifferebce = (DenisHeight - Denis) * 12;
    System.out.println("Денис теперь получает " + DenisHeight + " рублей. Его годовой доход вырос на " + DenisDifferebce + " рублей");
    double KristinaDifference = (KristinaHeight - Kristina) * 12;
    System.out.println("Кристина теперь получает " + KristinaHeight + " рублей. Ее годовой доход вырос на " + KristinaDifference + " рублей");


    }
}