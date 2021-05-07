import java.util.Scanner;

	public  class file13
	{
		public static void main(String[] args)
		{
			int p,a,perimeter,area;
		    Scanner s= new Scanner (System.in);
		    System.out.print("Enter lenghth of rectangle:   ");
		    p = s.nextInt();
		    System.out.print("Enter widdth of rectangle:   ");
		    a = s.nextInt();
		    perimeter = 2 *( p + a );
		    System.out.println("perimeter of the rectangle is :   "+perimeter);	
		    area = p * a;
		    System.out.println("area  of the rectangle is :   "+area);	
	}
}