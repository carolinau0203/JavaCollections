package Example;

public class For {
        public static void main(String... args) {
         int [] var = {1,2,3,4,5,6,7,8,9};
         int sum = 0;

         for (int i =0; i < var.length; i++) {
             for (int j = 0; j <var.length; j++)
             if (i==j);
             sum += var[i];
         System.out.println ("The sum is: " + sum);
         }
         }
        }

