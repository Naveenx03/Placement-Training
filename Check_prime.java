public class Check_prime
{
	public static void main(String[] args) {
		int x = 7;
        int count = 2;
        for (int i=2; i<=x/2; i++){
            if (x%i==0){
                count++;
            }
        }
        if (count > 2){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("It is a prime number");
        }
	}
}
