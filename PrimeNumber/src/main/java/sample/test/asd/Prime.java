package sample.test.asd;

public class Prime {

	public boolean isPrime(int number) {
		boolean result = true;
		for (int i = 2; i < number; i++) {
			if(number % i == 0){
				result = false;
				break;
			}
		}
		return result;
	}
}
