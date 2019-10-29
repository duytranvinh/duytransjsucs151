import java.awt.Rectangle;

public class DumpArray
{
	public static void dumpArray(Object[] objects)
	{
		for(int i = 0; i < objects.length; i++)
		{
			System.out.println(objects[i].toString());
		}
	}

	public static void main(String[] args)
	{
		Object[] objects = {"text", 8, new Rectangle(50, 80)};
		dumpArray(objects);
	}

}