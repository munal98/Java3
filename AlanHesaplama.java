import java.util.Scanner;

public class AlanHesaplama {

	public static void main(String[] args) {
     Scanner sc =new Scanner (System.in); //kullanıcıdan veri almak için scanner objesi yaratıldı.
     System.out.println("Sayı giriniz:");
     int uzunKenar = sc.nextInt(); 
     // sc objesini kullnarak kullanıcının int bir değer yazdığını varsayarak yazılan sayıyı oku.
     //uzunKenar'ın içerisine yaz.
     System.out.println("Sayı giriniz:");
     int kısaKenar=sc.nextInt();
     
     int alan =uzunKenar*kısaKenar;
     System.out.println("Alan: " + alan);
     System.out.println("Çevre: " + 2 * (uzunKenar + kısaKenar));
     
	}

}
