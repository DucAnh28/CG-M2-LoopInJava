public class PrimeNumberUnder100 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean checkPrime = true;
            if (i<2){
                checkPrime = false;
            }
            else if (i<4){
                checkPrime = true;
            }
            else {
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i%j==0){
                        checkPrime = false;
                    }
                }
            }
            if (checkPrime){
                System.out.println(i);
            }
        }
    }
}
