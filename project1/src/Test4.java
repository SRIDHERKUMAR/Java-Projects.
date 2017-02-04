
public class Test4 {
static int count = 0;
{
	count ++;
	
}
private Test4(double d,int i)
{
	System.out.println(count);
}
Test4()
{
	System.out.println(count);
}
Test4(int i)
{
	System.out.println(count);
}
Test4(double d)
{
	System.out.println(count);
	}
public static void main(String[] args)
{
	Test4 t1 = new Test4();
	Test4 t2 = new Test4(10);
	Test4 t3 = new Test4(10.544);
	Test4 t4 = new Test4(18.9,67);
	//System.out.println("the no of objects created " + count );
	
	}

}
