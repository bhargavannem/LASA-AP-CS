public class pushups {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1; i <= 40; i++) {
            if (counter == 1) {
                System.out.println("On day " + i + " do " + counter + " pushup every day for " + counter + " day.");
                counter++;
            } else if (i % 2 == 0) {
                System.out.println("On day " + i + " do " + counter + " pushups every day for " + counter + " days.");
                counter++;
                i += counter;
            }

        }
    }
}