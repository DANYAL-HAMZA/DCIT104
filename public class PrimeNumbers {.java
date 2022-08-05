//This program prints out all prime nums between 1 and 1000, find their sum and average
//Danyal Hamza, 10944646
public class PrimeNumbers {

public Static void main(String[] args) {

        boolean isPrime = false;

        int n = 0;

int sum = 0;

        for(int a = 1, a < 1000; a++) {

        if((a % 2) != 0) {

            isPrime = true;

            if(isPrime);

            System.out.println(a);

            sum += a;

            n++;

 }
        }

        System.out.println("The sum of all the prime numbers is" + sum);

        float average = sum / n;
        
        System.out.println("The average of all the prime numbers is" + average);

    }

}