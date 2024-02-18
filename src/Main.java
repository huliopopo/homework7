public class Main {
    public static void main(String[] args) {
        //task1
        int nubmerOfMonth = 0;
        double percent = 1.2;
        int deposit = 15000;
        double sum = 0;
        while (sum < 2_459_000) {
            sum *= percent;
            sum += deposit;
            System.out.println("Месяц " + nubmerOfMonth +
                    ", сумма наколплений равна " + sum + " рублей.");
            nubmerOfMonth++;
        }
        //task2
        int i = 1;
        while (i < 11) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        //task3
        System.out.println();
        int year = 2000;
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int totalRate = birthRate - deathRate;
        /*
        for (; numberOfYears > 0; numberOfYears--) {
            population = population + population / 1000 * totalRate;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        */
        while (year < 2010) {
            population = population + population / 1000 * totalRate;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //task4
        int numberOfMonth = 0;
        int goal = 12_000_000;
        percent = 1.07;
        while (deposit <= goal) {
            deposit = (int) (deposit * percent);
            numberOfMonth++;
            System.out.println("Месяц " + numberOfMonth + ", сумма накоплений " + deposit);
        }
        //task5
        numberOfMonth = 0;
        deposit = 15000;
        while (deposit < goal) {
            if (numberOfMonth % 6 == 0) {
                System.out.println("Месяц " + numberOfMonth + ", сумма накоплений " + deposit);
            }
            deposit = (int) (deposit * percent);
            numberOfMonth++;
        }
        //task6
        numberOfMonth = 0;
        deposit = 15000;
        int numbersOfYears = 9;
        int monthsInYears = 12 * numbersOfYears;
        while (numberOfMonth <= monthsInYears) {
            if (numberOfMonth % 6 == 0) {
                System.out.println("Месяц " + numberOfMonth + ", сумма накоплений " + deposit);
            }
            deposit = (int) (deposit * percent);
            numberOfMonth++;
        }
        //task7
        int firstFriday = 1;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;
        }
        //task8
        year = 2024;
        int periodOfTheComet = 79;
        int yearOfTheComet = 0;
        int yearStart = year - 200;
        int yearStop = year + 100;
        while (yearOfTheComet <= yearStop) {
            yearOfTheComet += periodOfTheComet;
            if (yearOfTheComet >= yearStart && yearOfTheComet <= yearStop && yearOfTheComet % periodOfTheComet == 0) {
                System.out.println(yearOfTheComet);
            }
        }


    }
}




