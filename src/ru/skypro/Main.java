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

    }
}



