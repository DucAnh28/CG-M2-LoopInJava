public class primeNumber {
    public static void main(String[] args) {
        int Number = 2;
        int count = 0;
        while (count<20){
            if (Number==2){
                System.out.println(Number);
                Number++;
            }
            boolean checkPrime = true;
            for (int i = 2; i < Number; i++) {
                if (Number%i==0){
                    checkPrime = false;
                    Number++;
                }
            }
            if (checkPrime){
                System.out.println(Number);
                Number++;
                count++;
            }
        }
    }
}
