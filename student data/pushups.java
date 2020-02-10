public class pushups {
    public static void main(String[] args) {
        int num_of_pushups = 1;
        int days = 1;
        int num_of_days = 1;
        System.out.println("On day " + days + " do " + num_of_pushups + " pushup every day for " + num_of_days + " day");
        while(num_of_pushups < 40){
           days += num_of_days;
           if(days%2 == 0){
               num_of_pushups++;
               num_of_days++;
               System.out.println(
                       "On day " + days + " do " + num_of_pushups + " pushups every day for " + num_of_days + " days");

           }
        }
    }
}