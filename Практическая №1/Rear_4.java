public class Rear_4 {
    static String login = "Polyakov_Dima";
    static String password = "41528";
	
   public static void main(String[] args) {
   try {
   if ( (args[0].equals(login)) & (args[1].equals(password)) ) {
    System.out.print("Вас узнали. Добро пожаловать"); 
	  } else {
    System.out.print("Логин и пароль не распознаны. Доступ запрещен"); 
     }
         } catch (ArrayIndexOutOfBoundsException e) { 
    System.out.print("Логин и пароль не распознаны. Доступ запрещен " + e.getMessage() ); 
  }
 }
}