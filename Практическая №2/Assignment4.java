

import java.util.Scanner; 
import java.security.SecureRandom; 

public class Assignment4 {
	public static void main(String[] args) {
		SecureRandom secureRandom = new SecureRandom(); 
		try (Scanner scanner = new Scanner(System.in)) { 
			System.out.print("Размер двумерного массива А или квадратной матрицы: "); 
				int n = scanner.nextInt(); 
				int Summ = 0;
				int array[][] = new int[n][n]; 
				int count = 0; 
				
				System.out.println("\nДвумерный массив или квадратная матрица:"); 
				for (int i = 0; i < array.length; i++) { 
					for (int j = 0; j < array.length; j++) { 
						array[i][j] = secureRandom.nextInt(30) - 15; 
						System.out.print(array[i][j] + "\t"); 
					}
					System.out.println(); 
				}
				
				System.out.println("\nЧисла верхней треугольной матрицы, выше главной диагонали :"); 
                for (int i = 0; i < array.length; i++) { 
                    for (int j = 0; j < array.length; j++) { 
                         if (i < j){
                            System.out.print(array[i][j] + "\t");
                        if (array[i][j] > 0) { 
                        	count++;
                        	Summ = Summ + array[i][j];
                             
                        }
                    }
                    }
                    System.out.println();
                }
                System.out.print("\nКоличество положительных элементов: " + count);
                System.out.print("\nСреднее арифмитическое: " + Summ / count );
				 
		} catch (Exception e) { 
		    System.out.println(e.getMessage() + "!"); 
		}
	}
}
