import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println(generateRandomCode(6)); // có thể chỉnh số =>3 
	}
		public static char[] generateRandomCode(int lenght) {
			String UpperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
			String lowerLetter = "abcdefghijklmnopqrstuvwxyz"; 
			String number = "0123456789";
			String CombineCode = lowerLetter + UpperLetter + number; 
			Random random = new Random();
			
			char[] RandomCode = new char[lenght];
			RandomCode [0] = UpperLetter.charAt(random.nextInt(UpperLetter.length()));
			RandomCode [1] = lowerLetter.charAt(random.nextInt(lowerLetter.length()));
			RandomCode [2] = number.charAt(random.nextInt(number.length()));
			
			for(int i = 3; i<lenght;i++) {
				RandomCode[i] = CombineCode.charAt(random.nextInt(CombineCode.length()));
			}
			
			return RandomCode;
			
		}
	}


