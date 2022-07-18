package Currency_Converter.src;

import java.util.*;
import java.text.DecimalFormat;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) 
        {
            double rupee,USD,pound,code,euro,yen;
            DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);

            System.out.println("*** WelCome to Currency Converter Project by Ksoe***");
            System.out.println("Enter the currency code"); 
            System.out.println("1:Rupees");
            System.out.println("2:USD");
            System.out.println("3:Pound Sterling");
            System.out.println("4:Euro");
            System.out.println("5:Japanese Yen");

            code = sc.nextInt();

            if(code == 1)
            {
                System.out.print("Please Enter amount in Rupees:");
                rupee = sc.nextFloat();
                USD = rupee / 79.72;
                System.out.println("USD : "+f.format(USD));
                pound = rupee / 94.51;
                System.out.println("Pound : "+f.format(pound));
                euro = rupee / 80.36;
                System.out.println("Euro : "+f.format(euro));
                yen = rupee / 0.58;
                System.out.println("Japanese Yen : "+f.format(yen));
            }

            else if (code == 2)
            {
                System.out.print("Enter amount in USD:");
                USD = sc.nextFloat();
                rupee = USD / 0.013;
                System.out.println("Rupees : "+f.format(rupee));
                pound = USD / 1.19;
                System.out.println("Pound : "+f.format(pound));
                euro = USD / 1.01;
                System.out.println("Euro : "+f.format(euro));
                yen = USD / 0.0072;
                System.out.println("Japanese Yen : "+f.format(yen));
            }

            else if(code == 3)
            {
                System.out.print("Enter amount in Pound:");
                pound = sc.nextFloat();
                rupee = pound / 0.011;
                System.out.println("Rupees : "+f.format(rupee));
                USD = pound / 0.084;
                System.out.println("USD : "+f.format(USD));
                euro = pound / 0.085;
                System.out.println("Euro : "+f.format(euro));
                yen = pound / 0.0061;
                System.out.println("Japanese Yen : "+f.format(yen));
            }

            else if(code == 4)
            {
                System.out.print("Enter amount in Euro:");
                euro = sc.nextFloat();
                rupee = euro / 0.012;
                System.out.println("Rupees : "+f.format(rupee));
                USD = euro / 0.099;
                System.out.println("USD : "+f.format(USD));
                pound = euro / 1.18;
                System.out.println("Pound : "+f.format(pound));
                yen = euro / 0.0072;
                System.out.println("Japanese Yen : "+f.format(yen));
            }

            else if(code == 5)
            {
                System.out.print("Enter amount in Japanese Yen:");
                yen = sc.nextFloat();
                rupee = yen / 1.74;
                System.out.println("Rupees : "+f.format(rupee));
                USD = yen / 138.53;
                System.out.println("USD : "+f.format(USD));
                pound = yen / 164.23;
                System.out.println("Pound : "+f.format(pound));
                euro = yen / 139.69;
                System.out.println("Euro : "+f.format(euro));
            }

            else
                System.out.println("Invalid Code!");
    }
}
