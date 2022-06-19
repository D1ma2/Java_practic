import java.util.Scanner;
import java.security.SecureRandom;

public class Assigment1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        try (Scanner scanner = new Scanner(System.in)) {
        int n = scanner.nextInt();
        int array[] = new int[n]; 
        int i;     
        System.out.println("Одномерный массив из случайных значений:"); 
        for (i = 0; i < array.length; i++) { 
            array[i] = secureRandom.nextInt(30) - 15; 
            System.out.print(array[i] + " "); 
        }

        int j = 0;
        for(i = 0;  i < array.length;  i++ )
        {
            if (array[i] != 0)
                array[j++] = array[i] * 4;
        }
        int [] newArray = new int[j];
        System.arraycopy( array, 0, newArray, 0, j );
      System.out.println("\nПеределаный массив: "); 
        for (i = 0; i < newArray.length; i++) { 
            System.out.print(newArray[i] + " "); 
        }
        }
    }
}
    
