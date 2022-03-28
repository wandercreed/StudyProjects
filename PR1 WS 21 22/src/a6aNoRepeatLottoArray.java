import java.lang.reflect.Array;
import java.util.Arrays;

public class a6aNoRepeatLottoArray {

	public static void main(String[] args) {
		
		int [] lottozahlen = new int [6];
		
		for (int i = 0; i < lottozahlen.length;i++) {
			
			boolean checkRecord = false;
			
			while (checkRecord != true) {                       // so weit Zahl ist nicht in lottozahlen[i] geschrieben wird while schleife laufen
				
				int randomizer = (int)((Math.random()*46)+1);				
				boolean checkRepeat = false;                    // wir setzet bei Default, dass Zahlen sind Unique und danach überprüfen
				
				for (int j = 0; j <= i;j++) {                   // Schleife läuft über lottozahlen.length(oder i) elemente und überprüft wenn randomizer Zahl schon dabei
					if (randomizer == lottozahlen[j]) {         // wenn randomizer zahl wurde in lottozahlen[j] getrofen, 
						                                        // wir setzen checkRepeat auf true und schleife widerholt sich ohne die Zahl einzuschreiben						     
						checkRepeat = true; 
					}
				}
				
				if(checkRepeat != true) {                       // keine Wiederholungen wurde getroffen,=> Zahl wird in lottozahlen[i] geschrieben
					lottozahlen[i] = randomizer;
					checkRecord = true;                         // while Schleife endet und wird das nächster Element überprüft
				}				
			}
						
		}
		
		System.out.println("Lottozahlen ohne Wiederholungen:  " + Arrays.toString(lottozahlen)); //Array als String ausgeben

	}

}
