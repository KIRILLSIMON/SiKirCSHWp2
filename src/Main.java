public class Main {
    public static void main(String[] args) {
        System.out.println("Reshenie Simonova KO pzadacham na cycli po bankovskomu delu-sm.nizhe");
        System.out.println("Reshenie 1y zadachi po bankovskomu delu");
        int zVmInR = 29000;
        for (int timToMonTrans = 0; timToMonTrans <= 11; ) {
            timToMonTrans++;
            double totalSum = zVmInR * timToMonTrans;
            double cYProcentsPerM = totalSum / 100 * 12 + 14388.38;
            double total = totalSum + cYProcentsPerM;
            System.out.println("К кон. " + timToMonTrans + "-го м. общ.з-чка сёдня: " + totalSum + "руб.0к.");
            System.out.println("Сумма процентов причитающихся к уплате (с уч.е/м кап. составит " + cYProcentsPerM + "руб.0к.");
            System.out.println("Итого к возврату за истечением вклада определено: " + total + "руб.");
            System.out.println("*!NB!* Погрешность между предусм. заданием ответом и ИСТИННОЙ СУММОЙ Н/СД КАП.-14388р.38к");
            System.out.println("В условиях реал.проф.д-сти такой 'просчёт'-неминуемо обернётся УГОЛ.ОТВ.по ст.159 УК РФ!");
        }

        System.out.println("Reshenie zadachi 1y 1go zadaniya 2go cyclouroka");
        int sumInRub = 0;
        int countIM = 0;
        int itogBablo = 2459000;
        while (sumInRub <= itogBablo) {
            sumInRub += 15000;
            System.out.println("Для накопл. задан. сум.-уйдёт мес.-см.кр.внизу " + sumInRub + "руб в к.-н.м.:" + countIM++);
        }
        int procents = countIM / 12 * 21600;
        System.out.println("Дополнят сумму расчёта-итог. проценты в общ.сложности(в руб.) " + procents + " и 0-коп.");
        System.out.println("Общ. срок хр-я в-да с уч.% сокр-ся до суммы в-да:2175*10^3р.-т.е.-до 144м.-12лет(с окр.) ");

        System.out.println("Задача о выведении с помощью for и while 2х рядов чисел: верх.- от 0 до 10-f,от 10 до 0-w");
        int i = 1;
        while (i < 10) {
            i++;
            System.out.print(i + ",");
        }
        for (int j = 10; j >= 0; j--) {
            System.out.print(j + ", ");
        }
        System.out.println("Zadacha poslednyaia 1go zadaniya 2go cyclouroka");
        int dynamicaSredi1000ZaOM = 9;
        int vsegoNaseleniyaT = 12_000;
        int allDynamicaPY = vsegoNaseleniyaT * dynamicaSredi1000ZaOM * 12;

        for (int yearsTN = 0; yearsTN <= 10; yearsTN++) {
            int TotalDynamica = allDynamicaPY * yearsTN;
            System.out.println("В стране прирост насел-я за " + yearsTN + "год-составила в тыс.ч.: " + TotalDynamica / 1000);
        }
        System.out.println("Reshenie zadachi 1y 1go zadaniya 2go cyclouroka");
        int sumIR = 0;
        int counIM = 0;
        int itogBabl = 11_985_000;
        while (sumIR <= itogBabl) {
            sumIR += 15000;
            System.out.println("Для накопл. задан. сум.-уйдёт мес.-см.ср.внизу " + sumIR + "руб в к.-н.м.:" + counIM++);
        }
        int procent = counIM / 12 * 21600;
        System.out.println("Дополнят сумму расчёта-итог. проценты в общ.сложности(в руб.) " + procent + " и 0-коп.");
        System.out.println("Общ. ср. хр-я в-да с уч.% сокр. до сум. в-да:14256*10^2р.-т.е.-до 704м.-58лет7м.(с окр.) ");


        System.out.println("Reshenie zadachi 1y 1go zadaniya 2go cyclouroka-с помощью for");

        int zanachivayuVOM = 15000;
        int itogo = 0;
        for (int y = 0; itogo < 12_000_000; y++) {
            itogo = itogo + zanachivayuVOM;
            System.out.println("Сумма сбер-й составила" + itogo + "руб в к.-н.м.:" + y);
        }
        System.out.println("Reshenie zadachi 1y 1go zadaniya 2go cyclouroka");

        int zanachka = 15000;
        int total = 0;
        for (; total < 12_000_000; i++) {
            total = total + (total / 100) * 7;
            total = total + zanachka;
            if (i % 6 == 0) {
                System.out.println("Сумма сбер-й составила " + total + "руб в к.-н.м.:" + i);
            }

        }

        System.out.println("Reshenie zadachi 3y 1go zadaniya 2go cyclouroka");

        int nichka = 15000;
        int vsego = 0;
        int x = 1;
        for (; vsego < 9_000_000; x++) {
            vsego = vsego + (vsego / 100) * 7;
            vsego = vsego + nichka;
            if (x % 6 == 0) {
                System.out.println("Сумма сбер-й составила " + vsego + "руб в к.-н.м.:" + x);
            }

        }

        System.out.println("Zadacha pro pyatnychnyi otchet(Ex.about friday check out");

        int countFridays = 1;
        for (int FridayOfNov = -3; FridayOfNov <= 25; countFridays++) {
            FridayOfNov += 7;
            System.out.println("Если сёдня пятница " + FridayOfNov + " е-по счёту- " + countFridays + " пора 'клепать' отчёт");

        }
        System.out.println("Zadacha pro tab*2(to two)");
        int m1 = 2;
        for (int m2 = 0; m2 < 11; m2++) {
            System.out.println("2*m2= " + m1 * m2);
        }
        System.out.println("Smotri vishe r-e zadach 1y, 2y i 2y zadachi -3ego zadaniya po 2y chasti Uroka cycli");


        System.out.println("Спис. високосных годов от Симонова КО с 1896г. включительно по 2054 г. содержит:  см.ниже");
        for (int KY = 1817; KY <= 2017; ) {
            KY += 79;
            System.out.println(KY + " год-КОМЕТНЫЙ!");
        }
    }

}