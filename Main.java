
public class Main {
	public static void main(String arguments[]) throws InterruptedException {
		Onkol onkol = new Onkol();
		Arkakol arkakol = new Arkakol();
		Gogus gogus = new Gogus();
		Bacak bacak = new Bacak();
		Omuz omuz = new Omuz();
		Sirt sirt = new Sirt();
		String egzersiz_bolgeleri = "Onkol egzersizleri : 1\n" + "Arkakol Egzersizleri : 2\n"
				+ "Bacak Egzersizleri : 3\n" + "Gogus Egzersizleri : 4\n" + "Sirt Egzersizleri : 5\n"
				+ "Omuz Egzersizleri : 6\n" + "Programi Sonlandir : 7\n";
		System.out.println("\tEgzersiz Hazirlama Programina Hosgeldiniz");

		while (true) {
			System.out.println("**************************");
			System.out.println(egzersiz_bolgeleri);
			System.out.println("**************************");
			System.out.print("Listenize Eklemek istediginiz Egzersiz Bolgesini Seciniz : ");
			String islem = Degiskenler.scanner.nextLine();
			if (islem.equals("7")) {
				break;

			} else if (islem.equals("1")) {
				onkol.onkolYazdir();
			} else if (islem.equals("2")) {
				arkakol.arkkolYazdir();

			} else if (islem.equals("3")) {
				bacak.bacakYazdir();
			} else if (islem.equals("4")) {
				gogus.gogusYazdir();
			} else if (islem.equals("5")) {
				sirt.sirtYazdir();
			} else if (islem.equals("6")) {
				omuz.omuzYazdir();
			}

			else {
				System.out.println("Lutfen Gecerli Islem Yapiniz");

			}
		}

		if (Degiskenler.array.size() > 0) {
			System.out.print("Egzersizler Arasi Kac Dakika Dinleniyorsunuz : ");
			int dinlenme = Degiskenler.scanner.nextInt();
			for (int i = 0; i < Degiskenler.array.size(); i++) {
				System.out.println("-------------------------------");
				System.out.println(Degiskenler.array.get(i));
				System.out.println("-------------------------------");
				Degiskenler.zaman += dinlenme;
			}
			System.out.println("Harcanacak Zaman : " + Degiskenler.zaman + " dk");
		} else {
			System.out.println("Egzersiz Bulunamadi");
		}

	}

}
