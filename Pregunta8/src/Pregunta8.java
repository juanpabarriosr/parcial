public class Pregunta8 {
	
	public void FailFastSucio(int numero1, int numero2, int numero3)
	{
		if(numero1 > 0)
		{
			if(numero2 > 0) 
			{
				if(numero3 > 0)
				{
					System.out.println("Todos los n�meros ingresado son positivos");
				}
				else
				{
					System.out.println("N�mero negativo");
				}
			}
			
			
		}
	}	
		
	public void FailFastLimpio(int numero1, int numero2, int numero3)
	{
		if(numero1 < 0) System.out.println("N�mero negativo");
		if(numero2 < 0) System.out.println("N�mero negativo");
		if(numero3 < 0) System.out.println("N�mero negativo");
			
		System.out.println("Todos los n�meros ingresado son positivos");
	}
}
	
	
