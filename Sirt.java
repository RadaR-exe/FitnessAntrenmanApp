import java.util.ArrayList;

public class Sirt {
	private String cable_pulldown = "Seated Cable Lat Pulldown";
	private String reverse_pulldown = "Reverse Grip Pulldown";
	private String cable_row = "Seated Cable Row";
	private String hyperextension = "Hyperextension";
	public String getCable_pulldown() {
		return cable_pulldown;
	}
	public void setCable_pulldown(String cable_pulldown) {
		this.cable_pulldown = cable_pulldown;
	}
	public String getReverse_pulldown() {
		return reverse_pulldown;
	}
	public void setReverse_pulldown(String reverse_pulldown) {
		this.reverse_pulldown = reverse_pulldown;
	}
	public String getCable_row() {
		return cable_row;
	}
	public void setCable_row(String cable_row) {
		this.cable_row = cable_row;
	}
	public String getHyperextension() {
		return hyperextension;
	}
	public void setHyperextension(String hyperextension) {
		this.hyperextension = hyperextension;
	}
	public void sirtYazdir() throws InterruptedException {
		ArrayList<String> a= new ArrayList<>();
		String cikis="Onkol Egzersizlerini Sonlandir";
		a.add(getCable_pulldown());
		a.add(getCable_row());
		a.add(getHyperextension());
		a.add(getReverse_pulldown());
		
		while (true) {
			a.add(cikis);
			System.out.print("Listenize Eklemek Istediginiz ( Sirt ) Egzersizini Ekleyin : ");
			String islem1=Degiskenler.scanner.nextLine();
			if(islem1.equals("5")) {
				System.out.println("Onkol Egzersizlerinden Cikiliyor...");
				Thread.sleep(2000);
				return;
			}
			else if(islem1.equals("1")) {
				Degiskenler.ekleme(getCable_pulldown());
				int pulldown_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=pulldown_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("2")) {
				Degiskenler.ekleme(getCable_row());
				int row_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=row_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("3")) {
				Degiskenler.ekleme(getHyperextension());
				int hype_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=hype_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("4")) {
				Degiskenler.ekleme(getReverse_pulldown());
				int reverse_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=reverse_sure;
				Degiskenler.scanner.nextLine();
			}else {
				System.out.println("Lutfen Gecerli Tuslama Yapiniz");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
