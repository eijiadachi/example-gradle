package br.imd.example.gradle;

public class Main
{
	public Main()
	{

	}

	public String greet()
	{
		return "Fala, galado!!";
	}

	public static void main(String args[])
	{
		Main m = new Main();
		System.out.println(m.greet());
	}
}