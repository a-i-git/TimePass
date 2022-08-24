import java.lang.Math;
import java.util.Scanner;


class sine {
    public int facto(int a) {
        if (a == 0) {
            return 1;
        }
        else {
            return a * facto(a - 1);
        }
    }
    void Eval(double n, double num) {
        double func = 0;
        for (int i=0; i<num; i++) {
            func = func + (Math.pow(-1,i) * Math.pow(n,2*i +1))/facto(2*i+1);
            //System.out.println("The value of the series at "+ i +" is " + func);
        }
        System.out.println("The value of the Sine series is " +func);
    }
}

class cosine{
    public int facto(int a) {
        if (a == 0) {
            return 1;
        }
        else {
            return a * facto(a - 1);
        }
    }
    void Eval(double n, double num) {
        double func = 0;
        for (int i=0; i<num; i++) {
            func = func + (Math.pow(-1,i) * Math.pow(n,2*i))/facto(2*i);
            //System.out.println("The value of the series at "+ i +" is " + func);
        }
        System.out.println("The value of the Cosine series is " +func);
    }
}


public class rerfcd {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number ");
        double s = a.nextDouble();
        System.out.print("Enter the no. of terms ");
        double k = a.nextInt();
        sine sn = new sine();
        cosine csn=new cosine();
        sn.Eval(s,k);
        csn.Eval(s,k);
    }
}


