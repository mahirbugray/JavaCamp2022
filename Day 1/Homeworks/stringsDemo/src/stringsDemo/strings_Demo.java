package stringsDemo;

public class strings_Demo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
//		System.out.println("----------------------------------");
//		System.out.println("Eleman sayısı : " + mesaj.length());// Kaç karakterden oluştuğunu söyler.
//		System.out.println("----------------------------------");
//		System.out.println("5.eleman : " + mesaj.charAt(4));// Belirtilen indexteki karakteri getirir.
//		System.out.println("----------------------------------");
//		System.out.println(mesaj.concat(" Yaşasın!"));// Mesajın sonuna belirtilen şeyi ekler.
//		System.out.println("----------------------------------");
//		System.out.println(mesaj.startsWith("B")); // Ne ile başlıyor.Case-sensitivity var.
//		System.out.println("----------------------------------");
//		System.out.println(mesaj.endsWith("L"));// Ne ile bitiyor.Case-sensitivity var.
//		System.out.println("----------------------------------");
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println("----------------------------------");
//		System.out.println(mesaj.indexOf('a'));// Seçilen karakter ya da metnin baştan kaçıncı indexte olduğunu söyler.
//		System.out.println(mesaj.lastIndexOf("av"));// Seçilen karakter ya da metnin sondan kaçıncı indexte olduğunu söyler.

		String yeniMesaj = mesaj.replace(' ', '-');// Karakterleri değiştirmek için kullanılır.Kalıcı değişiklik
													// uygulamaz yeni bir değişkene aktarmak gerekir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));// Bir metnin içinden parça alır.

		for (String kelime : mesaj.split(" ")) {// İçine girdiği değerden itibaren ayırmaya yarar.
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());// Küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase());// Büyük harfe çevirir.
		System.out.println(mesaj.trim());// Baştaki ve sondaki boşlukları atar.
	}

}
