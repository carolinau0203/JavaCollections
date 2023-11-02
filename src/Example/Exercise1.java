package Example;

import java.math.BigInteger;
import java.sql.SQLOutput;

public class Exercise1 {
    public static void main (String [] args) {
        String myname = "carolina";
        String myName = "CAROLINA";
        String myname1 = new String ("carolina");
        BigInteger big = new BigInteger("12365446");
        BigInteger big2 = new BigInteger("123456");

        if (myname.equalsIgnoreCase(myName))
        System.out.println ("This is correct");

        else {
            System.out.println ("Error");
        }
        System.out.println (myname.substring(4));
        System.out.println(myname1.equals(myname));
        System.out.println(myname1 == myname);
        System.out.println(big2.add(big));

        int mydata = 51;
        double fest = mydata;
        System.out.println(mydata);
        System.out.println(fest);

    }
}
