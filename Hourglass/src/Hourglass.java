
public class Hourglass {
	public static void main(String[]args) {
		System.out.print("|");
		for(int quote = 1; quote<=10; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
		for(int line = 1; line<=4; line++) {
			for(int space = 0; space<line; space++) {
				System.out.print(" ");
			}
				System.out.print("\\");
			for(int colon = 1; colon<= -2*line+10; colon++) {
				System.out.print(":");
			}
			System.out.println("/");	
		}
		System.out.println("     ||");
		for(int line = 1; line<=4; line++) {
			for(int space = 1; space<6-line; space++) {
				System.out.print(" ");
			}
				System.out.print("/");
			for(int colon = 1; colon<= 2*line; colon++) {
				System.out.print(":");
			}
			System.out.println("\\");
		}
	}
}
