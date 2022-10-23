package sesliHarfler;

public class sesli_Harf {

	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Kalın Sesli harf");
			break;
		default:
			System.out.println("İnce Sesli harf");
		}
	}

}
