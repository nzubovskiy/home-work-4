package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // ������� �1
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ������� �2
        for (int dayNumber = 5; dayNumber <= 31; dayNumber = dayNumber + 7) {
            System.out.println("������� �������, " + dayNumber + "-� �����. ���������� ����������� �����");
        }

        // ������� �3
        int cometPassageYear = 0;
        int currentYear = 2022;
        int cometPassagePeriod = 79;
        int beginningObservation = currentYear - 200;
        int endObservation = currentYear + 100;
        while (cometPassageYear < endObservation) {
            cometPassageYear = cometPassageYear + cometPassagePeriod;
            if (cometPassageYear >= beginningObservation && cometPassageYear <= endObservation) {
                System.out.println(cometPassageYear);
            }
        }

        // ������� �4
        for (int number = 1; number <= 30 ; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + ": ping pong");
                continue;
            } else if (number % 3 == 0) {
                System.out.println(number + ": ping");
                continue;
            } else if (number % 5 == 0) {
                System.out.println(number + ": pong");
                continue;
            } else {
                System.out.println(number + ": ");
            }
        }

        // ������� �5
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int j = 0; j < 8; j++) {
            int fibo = a + b;
            a = b;
            b = fibo;
            System.out.print(fibo + " ");
        }




    }
}



