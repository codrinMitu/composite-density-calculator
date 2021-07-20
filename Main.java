package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        ArrayList<Double> dens = new ArrayList<>();
        ArrayList<Double> percentage = new ArrayList<>();




        int count = 0;
        System.out.println("Enter the number of materials");
        double materials = read.nextDouble();







        while(count != materials){
               System.out.println("Enter the next percentage: ");
 double percentage2 = read.nextDouble();

 System.out.println("Enter the density of the of the next material: ");
 double dens2 = read.nextDouble();

 dens.add(dens2);
 percentage.add(percentage2);
 ++count; }



      int count2 = 0;
        double sumCalc = 0;
        int c = 0;
        int d = 0;

        while (count2 != materials) {

          sumCalc = sumCalc + ( percentage.get(c) / dens.get(d) );
          ++count2;
          ++c;
          ++d; }

        double finalNr = (1 / sumCalc) * 100;



        System.out.println(finalNr);

    } //main
}//Main
