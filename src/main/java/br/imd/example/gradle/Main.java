package br.imd.example.gradle;

public class Main
{
	public static final String DEFAULT_GREETING = "Fala, galado!";

	public Main()
	{

	}

	public String greet()
	{
		return DEFAULT_GREETING;
	}

	public static void main(String args[])
	{
		Main m = new Main();
		System.out.println(m.greet());
	}
}