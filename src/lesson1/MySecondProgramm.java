package lesson1;

public class MySecondProgramm {

    public static void main(String[] args) {
        double roomWight = 4.5;
        double roomLength = 3;

        double tableWight = 1.5;
        double tableLength = 2;

        double ploshadRoom = roomWight * roomLength;
        double ploshadTable = tableWight * tableLength;

        int countTable = (int) (ploshadRoom / ploshadTable);
        System.out.println(countTable);


    }
}
