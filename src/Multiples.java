class Multiples {

    public static int CountMultiples(int i) {
        if (i % 3 == 0 || i % 5 == 0) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            count += CountMultiples(i);
        }
        System.out.println(count);
    }
}