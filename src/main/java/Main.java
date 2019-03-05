class Main {

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.calculateDifference(100));

    }

    int calculateDifference(int ammountOfNumbers) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= ammountOfNumbers; i++) {
            sum1 = sum1 + (int)Math.pow(i,2);
            sum2 = sum2 + i;
        }
        sum2 = (int)Math.pow(sum2, 2);

        return sum2 - sum1;

    }

}