public class Main
{
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		System.out.println("using non-short circuit");
		System.out.println((a>b) & (a<c));
		System.out.println((b>a) | (b==a));
		
	}
}