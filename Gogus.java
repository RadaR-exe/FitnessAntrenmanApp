import java.util.ArrayList;

public class Gogus {
	private String bench_press = "Barbell Bench Press";
	private String chest_press = "Machine Chest Press";
	private String fly = "Machine Fly";
	private String Vbench = "Barbell Incline Bench Press";
	private String dumbell_fly = "Dumbell Fly";
	private String sinav = "Þýnav";
	private String crossover = "Cable Crossover";
	private String pullover = "Dumbell Pullover";

	public String getBench_press() {
		return bench_press;
	}

	public void setBench_press(String bench_press) {
		this.bench_press = bench_press;
	}

	public String getChest_press() {
		return chest_press;
	}

	public void setChest_press(String chest_press) {
		this.chest_press = chest_press;
	}

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}

	public String getVbench() {
		return Vbench;
	}

	public void setVbench(String vbench) {
		Vbench = vbench;
	}

	public String getDumbell_fly() {
		return dumbell_fly;
	}

	public void setDumbell_fly(String dumbell_fly) {
		this.dumbell_fly = dumbell_fly;
	}

	public String getSinav() {
		return sinav;
	}

	public void setSinav(String sinav) {
		this.sinav = sinav;
	}

	public String getCrossover() {
		return crossover;
	}

	public void setCrossover(String crossover) {
		this.crossover = crossover;
	}

	public String getPullover() {
		return pullover;
	}

	public void setPullover(String pullover) {
		this.pullover = pullover;
	}

	public void gogusYazdir() throws InterruptedException {
		ArrayList<String> a = new ArrayList<>();
		String cikis = "Gogus Egzersizlerini Sonlandir";
		a.add(getBench_press());
		a.add(getChest_press());
		a.add(getCrossover());
		a.add(getDumbell_fly());
		a.add(getFly());
		a.add(getPullover());
		a.add(getSinav());
		a.add(getVbench());
		a.add(cikis);

		
		while (true) {
			Degiskenler.egzersizMenu(a);
			System.out.print("Listenize Eklemek Istediginiz ( Gogus ) Egzersizini Ekleyin : ");
			String islem1=Degiskenler.scanner.nextLine();
			if(islem1.equals("9")) {
				System.out.println("Gogus Egzersizlerinden Cikiliyor..."); 
				Thread.sleep(2000);
				return;
				
			}
			else if(islem1.equals("1")) {
				Degiskenler.ekleme(getBench_press());
				int bench_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=bench_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("2")) {
				Degiskenler.ekleme(getChest_press());
				int chest_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=chest_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("3")) {
				Degiskenler.ekleme(getCrossover());
				int cross_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=cross_sure;
				Degiskenler.scanner.nextLine();
			}
			else if (islem1.equals("4")) {
				Degiskenler.ekleme(getDumbell_fly());
				int dumbell_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=dumbell_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("5")) {
				Degiskenler.ekleme(getFly());
				int fly_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=fly_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("6")) {
				Degiskenler.ekleme(getPullover());
				int pull_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=pull_sure;
				Degiskenler.scanner.nextLine();
			}
			else if (islem1.equals("7")) {
				Degiskenler.ekleme(getSinav());
				int sinav_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=sinav_sure;
				Degiskenler.scanner.nextLine();
			}
			else if(islem1.equals("8")) {
				Degiskenler.ekleme(getVbench());
				int vbench_sure=Degiskenler.scanner.nextInt();
				Degiskenler.zaman+=vbench_sure;
				Degiskenler.scanner.nextLine();
			}else {
				System.out.println("Lutfen Gecerli Tuslama Yapiniz");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
