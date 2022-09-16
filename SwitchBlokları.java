
public class SwitchBlokları {

	public static void main(String[] args) {
         
		
		char grade='A';
		
		switch (grade) {
		case 'A':
			System.out.println("Mukemmel Gectiniz!!");
			break;
		case'B':
			System.out.println("Cok Guzel Gectiniz");
			break;
		case 'C':
			System.out.println("iyi Gectiniz!!");
			break;
		case 'D':
			System.out.println("Dusuk Not Aldiniz");
			break;
		case'F':
			System.out.println("Malesef Kaldiniz!!");
			break;
			default:
				System.out.println("Geçersiz Not Girdiniz!!");
		}

	}

}
