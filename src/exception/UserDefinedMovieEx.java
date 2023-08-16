package exception;

public class UserDefinedMovieEx {
		static void validateAge(int age) {
		}
			void validateAge1(int age) {
				if(age>18) {
					System.out.println("Welcome to movie");
				}
				else {
					throw new ArithmeticException("Invalid Age for movie");
				}
			}
			public static void main(String[] args) {
				UserDefinedMovieEx u=new UserDefinedMovieEx ();
				u.validateAge(20);
		}

	
}





