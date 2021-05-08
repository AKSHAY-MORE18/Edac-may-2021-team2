public class Pattern1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}






public class Pattern2
{
	public static void main(String args[])
	{
	    int alpha=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+j) +" ");
				
			}
		System.out.println();
		}
	}
}







public class Pattern3
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
		System.out.println();
		}
	}
}








  
public class Pattern4
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
		System.out.println();
		}
	}
}






public class Pattern5
{
	public static void main(String args[])
	{
		int alpha=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char) (alpha + i) + " " );
			}
		System.out.println();
		}
	}
}




public class Pattern6
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
		System.out.println();
		}
	}
}







public class Pattern7
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++) 
            { 
             for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}








public class Pattern8
{
	public static void main(String[] args)
	{
		for (int i = 5; i >= 1; i--) 
            { 
             for (int j = 1; j<= i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <= 5; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}







public class Pattern9
{
	public static void main(String[] args)
	{
		int alpha=64;
		for (int i = 1; i <= 5; i++) 
            { 
             for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char)(alpha+k) + " ");
			}
			System.out.println();
		}
	}
}







public class Pattern10
{
	public static void main(String[] args)
	{
		char ch=65;
		for (int i = 5; i >= 1; i--) 
            { 
             for (int j = 1; j<= i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <= 5; k++)
			{
				System.out.print((char)(ch+k-1) + " ");
			}
			System.out.println();
		}
	}
}






public class Pattern11
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}








public class Pattern12
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++) 
            { 
             for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}





public class Pattern13
{
	public static void main(String[] args)
	{
		int alpha=64;
		for (int i = 1; i <= 5; i++) 
            { 
             for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char)(alpha+i) + " ");
			}
			System.out.println();
		}
	}
}






public class Pattern14
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}




public class Pattern15
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}		
			
}	






public class Pattern16
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}







public class Pattern17
{
	public static void main(String[] args)
	{
		int rows = 5;
		int temp = 1;
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
}





public class Pattern18
{
	public static void main(String[] args)
	{
		int alphabet = 65;
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}
	}
}


STAR PATTERN





public class Pattern1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			
			}
		System.out.println();
		}
	}
}
	
	
	
	
	public class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}




public class Pattern3
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			
			}
		System.out.println();
		}
	}
}





public class Pattern4
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}






public class Pattern5
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}








public class Pattern6
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}









public class Pattern7
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
			
			for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=3;l>=i;l--)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}








public class Pattern8
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			
			}
		System.out.println();
		}
			
			for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			
			}
		System.out.println();
		}
	}
}








public class Pattern9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}









public class PatternFlag
{
	public static void main(String[] args)
	{
		for( int k = 1 ; k <= 9 ; k++ )				//loop for * * ===
		{
            		if( k%2 == 0 )					//for even lines
            		{
                		for( int j = 1 ; j <= 5 ; j++ )		
                		{
                    			System.out.print(" *");			//print *
                		}
					System.out.print("  ");
                		for( int j = 1; j <= 34 ; j++ )
                		{
                    			System.out.print("=");			//print =
                		}
            		}
            		else						//for odd lines
            		{
                		for( int i = 1; i <= 6 ; i++ )
                		{
                    			System.out.print("* ");			//print *
				}	
                		for( int j = 1; j <= 34 ; j++ )
                		{
                    			System.out.print("=");			//print =
				}

            		}
            			System.out.println();

        	}

        		for(int i = 1 ; i <= 6 ; i++ )			//loop for ====
			{
            			for (int j = 1 ; j <= 46 ; j++ )
				{
                			System.out.print("=");			//print =
            			}
            				System.out.println();
        		}
    	}
}








