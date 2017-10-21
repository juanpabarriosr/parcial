public class ReturnEarly {

	public static ReturnEarlySucio(int numero1, int numero2, int numero3)
	{
		if(numero1 > 0)
		{
			if(numero2 > 0) 
			{
				if(numero3 > 0)
				{
					return 0;
				}
				else
				{
					return 1;
				}
			}			
		}
	}
	
	public static ReturnEarlyLimpio(int numero1, int numero2, int numero3)
	{
		if(numero1 < 0) return 1;
		if(numero2 < 0) return 1;
		if(numero3 < 0) return 1;
		return 1;			
	}
}
