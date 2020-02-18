import java.util.Scanner;
class SimpleCompoundInterest
{
    Simple()
    {
        Scanner sc = new Scanner(System.in);

        float p=sc.nextInt();
        float t=sc.nextInt();
        float r=sc.nextInt();

        float simpleinterest=(p*t*r)/100; // Calculating Simple interest
        float compoundinterest=p*Math.pow(1+(r/100),100*t))-p; // Calculating compound interest

    }
}
