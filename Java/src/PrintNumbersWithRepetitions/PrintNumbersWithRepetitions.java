package PrintNumbersWithRepetitions;
public class PrintNumbersWithRepetitions {
    public static void main(String[] args) 
    {
        int[] numbers = {12, 3, 13, 2, 14, 5, 16, 2};             
          for (int i = 0; i < numbers.length; i+=2) 
          {        	  
            int number = numbers[i];
            int repetitions = numbers[i + 1];
            for (int j = 0; j < repetitions; j++) 
            {
                System.out.print(number);
            }
        }
    }
}



 
