import java.util.*;

public class Encoding
{
   public static void recursive(int m, int n, String data, Set<String> result)
	{
		//if both m & n zeroe, return what we got
		if(m == 0 && n == 0)
		{
			result.add(data);
			return;
		}

		//n = 0, generate "."
		if(n == 0)
		{
			recursive(m - 1, n, data + ".", result);
			return;
		}
		//m = 0, generate "-"
		if(m == 0)
		{
			recursive(m, n - 1, data + "-", result);
			return;
		}
		//Both m & n (dot & dash)
		recursive(m - 1, n, data + ".", result);
		recursive(m, n - 1, data + "-", result);
	}
	public static Set<String> morseCodes(int m, int n)
	{
		Set<String> result = new TreeSet<>();
		recursive(m, n, "", result);
		return result;
	}
}