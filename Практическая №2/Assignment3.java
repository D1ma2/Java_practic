import java.security.SecureRandom; 
public class Assignment3 {
	public static void main(String[] args) {
		SecureRandom secureRandom = new SecureRandom(); 
		
		int n = 5; 
		int array[][] = new int[n][n]; 
		
		System.out.println("Двумерный массив:"); 
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array.length; j++) { 
				array[i][j] = secureRandom.nextInt(30) - 15; 
				System.out.print(array[i][j] + "\t"); 
			}
			System.out.println(); 
		}
		
		
		maxArrayItem(n, array);
	}
	
	private static void maxArrayItem(Integer numberRows, int[][] array) {
		int count = 0;
		int j = 0, i, maxArrayItem = 1; 
		int vector[] = new int[numberRows]; 
		
		while (j < numberRows) { 
            for (i = 0; i < array[j].length; i++) {
                if (array[i][j] < 0) { 
                	count ++;
                    maxArrayItem = maxArrayItem * array[i][j];                   
                }
            }
            if (count != 0) {
            	vector[j] = maxArrayItem; 
            	maxArrayItem = 1; 
            	j++;
            	count = 0;
            }  else { 
            	vector[j] = 0;          
            j++;
        }
		}
		
		printArray(vector);
	}
	
	private static void printArray(int[] vector) {
		System.out.println("Вектор B:"); 
		for (int j = 0; j < vector.length; j++) { 
			System.out.print(vector[j] + "\t"); 
		}
	}
}