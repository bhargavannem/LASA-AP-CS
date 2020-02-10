public class skip {
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            int c = 1;
            for (int j = 0; j < 10; j++) {
                int tot = (i * j) + c;
                System.out.print(tot + " ");
                c++;
            }
            System.out.println();
        }
    }
}