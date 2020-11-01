import java.util.ArrayList;

public class Arkakol {
	private String tricep_pushdown = "Tricep Pushdown";
	private String rope_pushdown = "Rope Pushdown";
	private String dip = "Bench Dip";
	private String close_grip_bench = "Close Grip Bench Press";
	
	
	public String getTricep_pushdown() {
		return tricep_pushdown;
	}
	public void setTricep_pushdown(String tricep_pushdown) {
		this.tricep_pushdown = tricep_pushdown;
	}
	public String getRope_pushdown() {
		return rope_pushdown;
	}
	public void setRope_pushdown(String rope_pushdown) {
		this.rope_pushdown = rope_pushdown;
	}
	public String getDip() {
		return dip;
	}
	public void setDip(String dip) {
		this.dip = dip;
	}
	public String getClose_grip_bench() {
		return close_grip_bench;
	}
	public void setClose_grip_bench(String close_grip_bench) {
		this.close_grip_bench = close_grip_bench;
	}

	public void arkkolYazdir() throws InterruptedException {
		ArrayList<String> array= new ArrayList<>();
		String cikis="Arkol Egzersizlerini Sonlandir";
		array.add(getClose_grip_bench());
		array.add(getDip());
		array.add(getRope_pushdown());
		array.add(getTricep_pushdown());
		array.add(cikis);
		
		while (true) {
			Degiskenler.egzersizMenu(array);
			System.out.print("Listenize Eklemek Istediginiz ( Arkakol ) Egzersizini Ekleyin : ");
			String islem1=Degiskenler.scanner.nextLine();
			if(islem1.equals("5")) {
				System.out.println("Arkakol Egzersizlerinden Cikiliyor...");
				Thread.sleep(2000);
				return;
			}
			else if(islem1.equals("1")) {
				Degiskenler.ekleme(getClose_grip_bench());
				int grip_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=grip_sure;
				Degiskenler.scanner.nextLine();
				
			}
			else if(islem1.equals("2")) {
				Degiskenler.ekleme(getDip());
				int dip_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=dip_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("3")) {
				Degiskenler.ekleme(getRope_pushdown());
				int rope_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=rope_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("4")) {
				Degiskenler.ekleme(getTricep_pushdown());
				int tricep_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=tricep_sure;
				Degiskenler.scanner.nextLine();
			}else {
				System.out.println("Lutfen Gecerli Tuslama Yapiniz");
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
