import java.util.ArrayList;
import java.util.Scanner;

public class Onkol {
	private String dumbell = "Dumbell Curl";
	private String hammer = "Hammer Curl";
	private String standing = "Standing Biceps Curl";
	private String concentration = "Dumbell Concentration Curl";
	
	
	
	public String getDumbell() {
		return dumbell;
	}
	public void setDumbell(String dumbell) {
		this.dumbell = dumbell;
	}
	public String getHammer() {
		return hammer;
	}
	public void setHammer(String hammer) {
		this.hammer = hammer;
	}
	public String getStanding() {
		return standing;
	}
	public void setStanding(String standing) {
		this.standing = standing;
	}
	public String getConcentration() {
		return concentration;
	}
	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}
	
	public void onkolYazdir() throws InterruptedException {
		ArrayList<String> array= new ArrayList<String>();
		String cikis="Onkol Egzersizlerini Sonlandir";
		
		array.add(getConcentration());
		array.add(getDumbell());
		array.add(getStanding());
		array.add(getHammer());
		array.add(cikis);
		
		while (true) {
			Degiskenler.egzersizMenu(array);
			System.out.print("Listenize Eklemek Istediginiz ( Onkol ) Egzersizini Ekleyin : ");
			String islem1=Degiskenler.scanner.nextLine();
			if(islem1.equals("5")) {
				System.out.println("Onkol Egzersizlerinden Cikiliyor...");
				Thread.sleep(2000);
				return;
			}
			else if(islem1.equals("1")) {
				Degiskenler.ekleme(getConcentration());
				int con_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=con_sure;
				Degiskenler.scanner.nextLine();
				
			}
			else if(islem1.equals("2")) {
				Degiskenler.ekleme(getDumbell());
				int dumbell_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=dumbell_sure;
				Degiskenler.scanner.nextLine();
			}
			
			else if(islem1.equals("3")) {
				Degiskenler.ekleme(getStanding());
				int standing_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=standing_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("4")) {
				Degiskenler.ekleme(getHammer());
				int hammer_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=hammer_sure;
				Degiskenler.scanner.nextLine();
			}else {
				System.out.println("Lutfen Gecerli Tuslama yapiniz");
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
