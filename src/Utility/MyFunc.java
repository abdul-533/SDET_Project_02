package Utility;

public class MyFunc {

    public static void Bekle(int sn){
        // milli saniyye cinsinden beklediyi icin 1000 le carpilir
        // bekletme metoufu

        try {
            Thread.sleep(1000*sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

            // bunu try catch yapmamisin neden simdilik boyle kullan ilicak
        }


    }

}
