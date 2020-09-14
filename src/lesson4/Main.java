package lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 366; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int minute = 0; minute < 60; minute++) {
                    for (int second = 0; second < 60; second++) {
                        System.out.printf("От старта прошло: %d дня, %d часа, %d минут, %d секунды \n", day,hour,minute,second);
                        Thread.sleep(1000) ;

                    }

                }

            }
        }

    }
}
