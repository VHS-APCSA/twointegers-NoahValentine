public class TwoInteger 
{

	private int num1;
	private int num2;
	
	public TwoInteger()
	{
		num1 = 0;
		num2 = 0;
	}
	public TwoInteger( int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public void  setNum1(int num1)
	{
		this.num1 = num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String arithmetic()
	{
		return (num1 + "+" + num2 + "=" + (num1 + num2) + ", " +
				num1 + "-" + num2 + "=" + (num1 - num2) + ", " +
				num1 + "/" + num2 + "=" + (num1 / num2) + ", " +
				num1 + "*" + num2 + "=" + (num1 * num2) + ", " 
				);
	}
	public int larger()
	{
		if(num1 > num2)
		{
			return num1;
		}
		else 
		{
			return num2;
		}
	}
	public boolean isEven()
	{
		if(num1 + num2 % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean multiple()
	{
		if(num1 % num2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
