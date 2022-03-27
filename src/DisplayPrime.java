import java.util.ArrayList;
import java.util.Collections;

//Q3. Given an integer, display only the prime digit from that integer
public class DisplayPrime {
    static boolean isPrime(int n){
        boolean result = true;
        if (n == 1 || n == 0)
            result = false;
        else if(n>1){
            for(int i=2; i*i<=n; ++i){
                if(n%i == 0)
                    result = false;
            }
        } else {
            result = true;
        }
        return result;
    }
    static ArrayList<Integer> onlyPrime(int num) {
        ArrayList<Integer> primes = new ArrayList<>();
        while(num > 0){
            int lastDigit = num % 10;
            if(isPrime(lastDigit)){
                primes.add(lastDigit);
            }
            num = num/10;
        }
        Collections.reverse(primes);
        return primes;
    }
    static void test(){
        int [] tests = {1112, 12389, 45613, 987, 1777, 144};
        ArrayList<Integer> ans;
        for(int test=0; test<tests.length; test++){
            System.out.println("Testing ... Test" +test);
            ans = onlyPrime(tests[test]);
           // ans.forEach(a -> System.out.println(a));
            // method reference
            ans.forEach(System.out::println);
            System.out.println("------------------");
        }
    }
    public static void main(String[] args) {
        test();
    }
}
