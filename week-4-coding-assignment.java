package week4;

import java.util.Arrays;

public class Application {
	
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself 
	  public static String addWords(String word, int numTimes) 
	  {
		  String returnWord = "";
		  for (int i=0; i < numTimes; i++)
		  {
			 returnWord += word;
		  }
		  return returnWord;
	  }
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	  public static String nameBuilder(String firstName, String lastName)
	  {
		  return (firstName + " " + lastName);
	  }
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100  
	  public static boolean greaterThan100 (int [] numbers)
	  {
		  int sum = 0;
		  for (int i = 0; i < numbers.length; i++)
		  {
			  sum += numbers[i];
		  }
		  if (sum > 100)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
//10. Write a method that takes an array of double and returns the average of all the elements  
	  public static double avgOfArray(double [] numbers)
	  {
		  double avg = 0;
		  double sum = 0;
		  for(int i =0; i < numbers.length; i++)
		  {
			  sum+= numbers[i];
		  }
		  avg = (sum/numbers.length);
		  return avg;
	  }
	  
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	  public static boolean compareArrays(double [] arr1, double[] arr2)
	  {
		  double avg1 = avgOfArray(arr1);
		  double avg2 = avgOfArray(arr2);
		  if (avg1 > avg2)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
	  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	  {
		  if (isHotOutside && moneyInPocket > 10.50)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
	  
//13. Create a method of your own that solves a problem
	  public static double takeHomePay(int hoursWorked, double hourlyWage, double taxRate, double savings, double insurance)
	  {
		  double grossPay = 0;
		  double takeHomePay = 0;
		  double netPay = 0;

		  
		  grossPay = (hoursWorked * hourlyWage);
		  netPay = grossPay - (grossPay * taxRate);
		  takeHomePay = netPay - (savings + insurance);
		  return takeHomePay;
	  }
	  


	public static void main(String[] args) {
		int[] ages = new int[]{ 3, 9, 23, 64, 2, 8, 28, 93 };
		
		//1a.Programmatically subtract the value of the first element in the array from the value in the last element of the array
		System.out.println("1a. " + (ages[ages.length-1]- ages[0]));
		//1b.Create a new array of integer called ages2 with 9 element
		int[] ages2 = new int[]{ 3, 9, 23, 64, 2, 8, 28, 93, 100, 111};
		System.out.println("1b. " + (ages2[ages2.length-1]- ages2[0]));
		//1c. Use a loop to iterate through the array and calculate the average age
		int sum = 0;
		for (int i=0; i < ages2.length; i++)
		{
			sum+=ages2[i];
		}
		double avg = (sum/ages2.length);
		System.out.println("1c. " + (avg));
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		//2a
		int nameSum = 0;
		String allNames = "";
		for (int i = 0; i < names.length; i++)
		{	
			nameSum+= (names[i].length());
			allNames += (names[i] + " ");
		}
		System.out.println("2a." + (nameSum/names.length));
		System.out.println("2b." + (allNames));
		
		//4
		System.out.println("3. array[array.length-1]");
		
		//4
		System.out.println("4. array[0]");
		//5 Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array
		
		int nameLengths[] = new int[6];
		for (int i =0; i < names.length; i++)
		{
			nameLengths[i] = names[i].length();
		}
		System.out.print("5. ");
		System.out.print(Arrays.toString(nameLengths));
		//6. 6. Write a loop to iterate over the nameLengths array and calculate the sum
		int nameLenghTotal = 0;
		for (int i=0; i < nameLengths.length; i++)
		{
			nameLenghTotal += nameLengths[i];
		}
		System.out.println("6. " + (nameLenghTotal));
		System.out.println("7. " + addWords("Hello", 3));
		System.out.println("8. " + nameBuilder("Lina", "Brown"));
		
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("9. " + greaterThan100(numbers));
		
		double[] numbers2 = {1.2, 5.5, 4.7, 7.8, 9.9, 11.5};
		System.out.println("10. " + avgOfArray(numbers2));
		
		double[] numbers3 = {1.3, 5.2, 6.7, 6.8, 6.9, 11.5};
		System.out.println("11. " + compareArrays(numbers2, numbers3));
		
		System.out.println("12. " + willBuyDrink(true, 12.75));
		
		System.out.println("13. " + takeHomePay(40, 25, 0.056, 100, 85));
	
	}