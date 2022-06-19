public class Rear_3 {
public static void main(String[] args) {
    try {
	       if (args.length == 2) { 
	       int i = Integer.parseInt(args[0]); 
	       int j = Integer.parseInt(args[1]); 
	       int result = i + j; 
	        
	         System.out.print(i + " + " + j + " = " + result);
	      } else {
      System.out.print("Неверное количество параметров!"); 
	      }
     } catch (NumberFormatException e) { 
    System.out.println(e.getMessage() + "!"); 
}
}
}