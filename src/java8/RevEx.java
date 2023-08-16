package java8;
interface ReverseString{
	String rev(String s);
}
public class RevEx {

	public static void main(String[] args) {
		ReverseString rs=(String s)->
		{
		String revs ="";
		for (int j=s.length()-1;j>=0;j--) {

			char w=s.charAt(j);
		revs=revs+w;
		}
		
		return revs;
	};
	System.out.println("Reverse String :"+rs.rev("sneha"));

}
}
