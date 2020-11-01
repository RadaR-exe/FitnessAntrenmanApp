import java.util.ArrayList;
import java.util.Scanner;

public class Degiskenler {
	public static ArrayList<String> array=new ArrayList<>();
	public static int zaman=0;
	 public static Scanner scanner = new Scanner(System.in);
	 public static void ekleme(String egzersiz) {
		 System.out.println(" ");
		 Degiskenler.array.add(egzersiz);
		 System.out.println(egzersiz+" Listenize Eklendi ");
		 System.out.print(egzersiz+" Setler Toplami Kac Dakika Yapiyorsunuz : ");
		 
	 }
	 public static void egzersizMenu(ArrayList<String> a) {
			System.out.println("**************************");

		 for(int i =0;i<a.size();i++) {
			 System.out.println(a.get(i)+" : "+(i+1));
		 }
			System.out.println("**************************");

	 }
	

}
