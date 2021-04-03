package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;  //to round-off decimal.

public class CodeChefLongAprilBOLT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); //to round-off to two decimal.
        int trackLength = 100;
        double record  = 9.58;  //Usain Bolt's record for 100m race.
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases>0){
            String[] factors = scanner.nextLine().split(" ");
            double k1 = Double.parseDouble(factors[0]);
            double k2 = Double.parseDouble(factors[1]);
            double k3 = Double.parseDouble(factors[2]);
            double v = Double.parseDouble(factors[3]);
            double compSpeed = k1*k2*k3*v;
            double timeToCompleteRace = Double.parseDouble(df.format(trackLength/compSpeed)); //using df we round off to 2 decimal places.
            //System.out.println(timeToCompleteRace);
            if(timeToCompleteRace < record){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            testCases--;
        }

    }
}
