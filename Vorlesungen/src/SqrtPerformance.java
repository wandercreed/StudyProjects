import java.util.Date;
public class SqrtPerformance {
    public static void main(String[] args) {
        
        int anzahl = 1_000_000;
        
        long start = new Date().getTime();
        
        double [] wurzeln = new double [anzahl];
        for (int i = 0; i < anzahl; i++) {
            wurzeln [i] = Math.sqrt(i + 1);
        }
        
        long end = new Date().getTime();
        System.out.println(end - start + " ms");
        
        
    }
}