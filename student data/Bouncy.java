public class Bouncy {
    public static void main(String[] args) {
        int num = 100;
        double temp = 0.0;
        double num_of_bouncy = 0;
        while(temp != 0.990000){
            boolean up = isNotBouncyUp(num);
            boolean down = isNotBouncyDown(num);
            boolean equal = isEqual(num);
            boolean left = !(up || down) && !equal;
            boolean res = left;
            if(res){
                num_of_bouncy++;
            }
            num++;
             temp = num_of_bouncy/num;
             double r =  (temp * 100);
             int x = (int)(r);
        }
        // Print the least number for which the proportion of bouncy numbers is exactly
        // 99%.
        System.out.println("Least number of times for which the proportion of bouncy numbers is exactly 99%: " + num + " times");
    }


    public static boolean isNotBouncyUp(int i) {
        String str = "" + i;
        String temp[] = str.split("");
        boolean res = true;
        int prev = 0;
        int t = 0;
        for(String s: temp){
            t = Integer.parseInt(s);
            if(prev >t){
                res = false;
            }
            prev = t;
        }
        return res;
    }
    public static boolean isNotBouncyDown(int i){
        String str = "" + i;
        String temp[] = str.split("");
        boolean res = true;
        int prev = 10;
        int t = 0;
        for(String s: temp){
            t = Integer.parseInt(s);
            if(prev < t){
                res = false;
            }
            prev = t;
        }
        return res;
    }

    public static boolean isEqual(int i){
        String str = "" + i;
        String temp[] = str.split("");
        Boolean b = true;
        int orig = Integer.parseInt(temp[0]);
        int curr = 0;
        for(String s: temp){
            curr = Integer.parseInt(s);
            if(curr != orig){
                b = false;
            }
        }
        return b;
    }
}