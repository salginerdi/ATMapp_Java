import java.util.Scanner;

public class WorkSpace {

	public static void main(String[] args) {

		String islemSecenekleri = "Bakiye Görüntülemek 1 " + "Para Çekmek 2 " + "Farklı Bir Hesaba Para Yatırmak 3 "
				+ "Uygulamadan Çıkmak İçin Q ";

		double erdiBakiye = 1200;
		String erdiIBAN = "TR1254 000 002 976 654 4876 23 54";

		double kamilBakiye = 2450;
		String kamilIBAN = "TR2145 000 000 543 620 3294 29 35";

		String erdiKullanici = "erdi55";
		double erdiSifre = 456;

		String kamilKullanici = "kamil12";
		double kamilSifre = 123;

		Scanner scanner = new Scanner(System.in);
		System.out.println("ATM'ye Hoş geldiniz");
		System.out.println("Lütfen Kullanıcı Adınızı Giriniz: ");

		System.out.print("Kullanıcı Adı: ");
		String kullaniciAdi = scanner.nextLine();

		System.out.println("Şifrenizi Giriniz: ");
		String sifre = scanner.nextLine();

		if (kullaniciAdi.equals("kamil12") && sifre.equals("123")) {
			System.out.println("Kamil Arslan hesabına giriş yapıldı. ");
			System.out.println(islemSecenekleri);

			System.out.print("Lütfen bir seçim yapınız");
			String secim = scanner.nextLine();

			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz: " + kamilBakiye);
				break;
			case "2":
				System.out.println("Çekmek istediğiniz tutarı giriniz: ");
				int cekilecekTutar = scanner.nextInt();
				if (kamilBakiye >= cekilecekTutar) {
					kamilBakiye -= cekilecekTutar;
					System.out.println("Kalan Tutar: " + kamilBakiye);
				} else {
					System.out.println("Çekilecek tutar bakiyenizden fazla olamaz.");
				}
			case "3":
				System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
				int yatirilanTutar = scanner.nextInt();

				if (yatirilanTutar <= kamilBakiye) {

					System.out.print("IBAN Giriniz: ");
					scanner.nextLine();
					String yatirilacakIban = scanner.nextLine();

					if (yatirilacakIban.equals(erdiIBAN)) {

						System.out.println("Paranız Erdi Salgın adlı kişiye başarıyla gönderilmiştir!");
						kamilBakiye -= yatirilanTutar;
						erdiBakiye += yatirilanTutar;
						System.out.println("Kalan Bakiyeniz: " + kamilBakiye);
					} else {
						System.out.println("Geçersiz bir IBAN girdiniz!");
					}
				} else {
					System.out.println("Yatırdığınız tutar bakiyenizden fazla olamaz");
				}

				break;

			case "q":
				System.out.println("Çıkış işleminiz yapılmıştır. Tekrar Bekleriz.");
				break;

			default:
				System.out.println("Lütfen geçerli bir işlem numarası giriniz!");
				break;
			}

		} else if (kullaniciAdi.equals("erdi55") && sifre.equals("456")) {
			System.out.println("Erdi Salgın hesabına giriş yapıldı. ");
			System.out.println(islemSecenekleri);

			System.out.print("Lütfen bir seçim yapınız");
			String secim2 = scanner.nextLine();

			switch (secim2) {
			case "1":
				System.out.println("Bakiyeniz: " + erdiBakiye);
				break;
			case "2":
				System.out.println("Çekmek istediğiniz tutarı giriniz: ");
				int cekilecekTutar = scanner.nextInt();
				if (erdiBakiye >= cekilecekTutar) {
					erdiBakiye -= cekilecekTutar;
					System.out.println("Kalan Tutar: " + erdiBakiye);
				} else {
					System.out.println("Çekilecek tutar bakiyenizden fazla olamaz.");
				}
				break;
			case "3":
				System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
				int yatirilanTutar = scanner.nextInt();

				if (yatirilanTutar <= erdiBakiye) {

					System.out.print("IBAN Giriniz: ");
					scanner.nextLine();
					String yatirilacakIban = scanner.nextLine();

					if (yatirilacakIban.equals(kamilIBAN)) {

						System.out.println("Paranız Kamil Arslan adlı kişiye başarıyla gönderilmiştir!");
						erdiBakiye -= yatirilanTutar;
						kamilBakiye += yatirilanTutar;
						System.out.println("Kalan Bakiyeniz: " + erdiBakiye);
					} else {
						System.out.println("Geçersiz bir IBAN girdiniz!");
					}
				} else {
					System.out.println("Yatırdığınız tutar bakiyenizden fazla olamaz");
				}

				break;
			case "q":
				System.out.println("Çıkış işleminiz yapılmıştır. Tekrar Bekleriz.");
				break;

			default:
				System.out.println("Lütfen geçerli bir işlem numarası giriniz!");
				break;

			}
		} else {
			System.out.println("Lütfen geçerli bir kullanıcı adı ve şifresi giriniz!");
		}
	}
};
