import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String[] arr = new String[2];
        arr[0] = n;
        n = scan.nextLine();
        arr[1] = n;

        BigDecimal a = new BigDecimal(arr[0]);
        BigDecimal b = new BigDecimal(arr[1]);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));


        }


    }
