import java.util.ArrayList;

public class Bacak {
	private String leg_press="Leg Press";
	private String leg_ex="Leg Extention";
	private String standing_raises="Standing Calf Raises";
	
	
	public String getLeg_press() {
		return leg_press;
	}
	public void setLeg_press(String leg_press) {
		this.leg_press = leg_press;
	}
	public String getLeg_ex() {
		return leg_ex;
	}
	public void setLeg_ex(String leg_ex) {
		this.leg_ex = leg_ex;
	}
	public String getStanding_raises() {
		return standing_raises;
	}
	public void setStanding_raises(String standing_raises) {
		this.standing_raises = standing_raises;
		
	}
	
	public void bacakYazdir() throws InterruptedException {
		ArrayList<String> a= new ArrayList<>();
		String cikis="Bacak Egzersizlerini Sonlandir";
		a.add(getLeg_ex());
		a.add(getLeg_press());
		a.add(getStanding_raises());
		a.add(cikis);
		
		while(true) {
			Degiskenler.egzersizMenu(a);
			System.out.print("Listenize Eklemek Istediginiz ( Bacak ) Egzersizini Ekleyin : ");
			String islem1=Degiskenler.scanner.nextLine();
			if(islem1.equals("4")) {
				System.out.println("Bacak Egzersizlerinden Cikiliyor...");
				Thread.sleep(2000);
				return;
			}
			else if(islem1.equals("1")) {
				Degiskenler.ekleme(getLeg_ex());
				int ex_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=ex_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("2")) {
				Degiskenler.ekleme(getLeg_press());
				int press_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=press_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("3")) {
				Degiskenler.ekleme(getStanding_raises());
				int standing_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=standing_sure;
				Degiskenler.scanner.nextLine();
			}else {
				System.out.println("Lutfen Gecerli Tuslama yapiniz");
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
