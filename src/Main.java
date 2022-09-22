public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 1;
        byte b = 27;
        short c = 987;
        long l = 98L;
        float f = 2;
        double d = 12.36;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        float F = 27.2f;
        long L = 987678965549L;
        byte bb = 2;
        short sh = 786;
        boolean B = 10 < 5;
        short hs = 569;
        short mhs = - 159;
        short g = 27897;
        byte k = 67;
        System.out.println(F);
        System.out.println(L);
        System.out.println(bb);
        System.out.println(sh);
        System.out.println(B);
        System.out.println(hs);
        System.out.println(mhs);
        System.out.println(g);
        System.out.println(k);

        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int papier = 480;
        int papierPerSt = papier / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + papierPerSt + "  листов бумаги");

        int power1min = 16 / 2;
        int power20min = power1min * 20;
        int power1Day = power1min * 60 * 24;
        int power3Day = power1Day * 3;
        int power1Month = power3Day * 10;
        System.out.println("За 20 минут машина произвела бутылок " + power20min + " штук");
        System.out.println("За 1 сутки машина произвела бутылок " + power1Day + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + power3Day + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + power1Month + " штук");

        int totalB = 120;
        int countW1class = 2;
        int countB1class = 4;
        int countTotal1class = countW1class + countB1class;
        int countOfclass = totalB / countTotal1class;
        System.out.println("В школе, где  " + countOfclass + " классов нужно " + countOfclass * countW1class + " банок белой краски и " + countOfclass * countB1class + " банок коричневой краски.");

        int bananWeight = 80;
        int milkWeight = 105;
        int iceWeight = 100;
        int eggWeight = 70;
        float grWeight = bananWeight * 5 + milkWeight  * 2 + iceWeight * 2 + eggWeight * 4;
        double kgWeight = grWeight / 1000;
        System.out.println("Вес завтрака  " + grWeight + " грамм или  " + kgWeight  + " кг.");

        int totalWeight = 7000;
        int dayWeight1 = 250;
        int dayWeight2 = 500;
        int time1 = totalWeight / dayWeight1;
        int time2 = totalWeight / dayWeight2;
        int midle = (time1 + time2) / 2;
        System.out.println(time1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и " + time2 + " дней, если каждый день будет худеть на 500 грамм. " + midle   + " дней потребуется в среднем, чтобы добиться результата.");


    }
}