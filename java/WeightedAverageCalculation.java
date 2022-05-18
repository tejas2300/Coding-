// package com.jap.weightedaveragecalculator;

import java.util.Scanner;

public class WeightedAverageCalculation {

  // Function accepts academic scores as input parameters and outputs the overall
  // weighted average percentage of an individual.
  //Calculate the Overall Percentage
  public static void main(String[] args) {
    WeightedAverageCalculation weightedAverageCalculation = new WeightedAverageCalculation();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Item name");
    String productName = scanner.nextLine();
    System.out.println("Enter Selling Price");
    float wholeSalePrice = scanner.nextFloat();
    float retailPrice =  sellingPriceCalculation.revisedSellingPriceCalculator(productName , wholeSalePrice);
    System.out.println("Revised Selling Price for  " + productName + " is $" + retailPrice );
  }

  public float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore,
      int finalExamScore) {

      float overallPercentage = -1;
      
      return overallPercentage;
  }

}

int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }