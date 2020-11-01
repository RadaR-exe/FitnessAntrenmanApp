import java.util.ArrayList;

public class Omuz {
	private String overhead_press = "Overhead Machine Press";
	private String front_raise = "Dumbell Front Raise";
	private String lateral_raise = "Dumbell Side Lateral Raise";
	private String uprigt_row = "Dumbell Upright Row";

	public String getOverhead_press() {
		return overhead_press;
	}

	public void setOverhead_press(String overhead_press) {
		this.overhead_press = overhead_press;
	}

	public String getFront_raise() {
		return front_raise;
	}

	public void setFront_raise(String front_raise) {
		this.front_raise = front_raise;
	}

	public String getLateral_raise() {
		return lateral_raise;
	}

	public void setLateral_raise(String lateral_raise) {
		this.lateral_raise = lateral_raise;
	}

	public String getUprigt_row() {
		return uprigt_row;
	}

	public void setUprigt_row(String uprigt_row) {
		this.uprigt_row = uprigt_row;
	}

	public void omuzYazdir() throws InterruptedException {
		ArrayList<String> a = new ArrayList<>();
		String cikis = "Onkol Egzersizlerini Sonlandir";
		a.add(getFront_raise());
		a.add(getLateral_raise());
		a.add(getOverhead_press());
		a.add(getUprigt_row());
		
		while (true) {
			a.add(cikis);
			System.out.print("Listenize Eklemek Istediginiz ( Omuz ) Egzersizini Ekleyin : ");
			String islem1 = Degiskenler.scanner.nextLine();
			if (islem1.equals("5")) {
				System.out.println("Onkol Egzersizlerinden Cikiliyor...");
				Thread.sleep(2000);
				return;
			}

			else if (islem1.equals("1")) {
				
				Degiskenler.ekleme(getFront_raise());
				int front_sure = Degiskenler.scanner.nextInt();
				Degiskenler.zaman += front_sure;
				Degiskenler.scanner.nextLine();

			} else if (islem1.equals("2")) {
				
				Degiskenler.ekleme(getLateral_raise());
				int get_sure = Degiskenler.scanner.nextInt();
				Degiskenler.zaman += get_sure;
				Degiskenler.scanner.nextLine();
			} else if (islem1.equals("3")) {
				
				Degiskenler.ekleme(getOverhead_press());
				int overhead_sure = Degiskenler.scanner.nextInt();
				Degiskenler.zaman += overhead_sure;
				Degiskenler.scanner.nextLine();
			} else if (islem1.equals("4")) {
				
				Degiskenler.ekleme(getUprigt_row());
				int upright_sure = Degiskenler.scanner.nextInt();
				Degiskenler.zaman += upright_sure;
				Degiskenler.scanner.nextLine();
			} else {
				System.out.println("Lutfen Gecerli Tuslama yapiniz");

			}

		}
	}

}
