public class Add_even_odd_prime
{
	public static void main(String[] args) {
		int x = 123456795;
		int add_odd = 0;
		int add_even = 0;
		int is_prime = 0;
		while(x>0){
            int digit = x % 10;
            x = x / 10;
		    if (digit % 2 == 0){
		        add_even += digit;
		    }
		    else{
		        add_odd += digit;
		    }
		    int count = 1;
		    for(int i=1; i<digit; i++){
		        if(digit%i==0){
		            count ++;
		        }
		    }
		    if (count==2){
		        is_prime += digit;
		    }
		}
			System.out.println("Addition of odd number");
			System.out.println(add_odd);
			System.out.println("Addition of even number");
			System.out.println(add_even);
			System.out.println("Addition of prime number");
			System.out.println(is_prime);
	}
}