package com.lab1;
import java.util.Scanner;

public class Fibonacci {
	
	private static int n; // номер числа Фібоначчі
	private int fib; // значення числа Фібоначчі

	// Конструктор з параметром n
	public Fibonacci(int n) {
		Fibonacci.n = n;
	}

	// геттер-метод поля n
	public static int getN() {
		return n;
	}
	
	// геттер-метод поля fib
	public int getFib() 
	{
		return fib;
	}

	// Пошук значення числа Фібоначчі за його номером
	public int fibonacciN(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		else {
			this.fib = fibonacciN(n - 1) + fibonacciN(n - 2);
		}
		
		return fib;
	}
	
	// Кількість додавань
	public int countOfAdditions(int n) {

		if(n == 0 || n == 1) {
			return n;
		}
		
		else {
			this.fib = fibonacciN(n - 1) + fibonacciN(n - 2);
		}
		
		return n - 2;
	}

	public static void main(String[] args) {
		
		try (// Ввід з клавіатури
		Scanner in = new Scanner(System.in)) {
			System.out.print("\nEnter the sequence number of the Fibonacci: ");
			int n = in.nextInt();
			
			// Створення об'єкту
			Fibonacci f = new Fibonacci(n);
			
			System.out.println("The sequence number of the Fibonacci: " + getN());
			
			System.out.print("The value of Fibonacci number: " + f.fibonacciN(n));
			
			System.out.println();
			System.out.println("The quantity of additions: " + f.countOfAdditions(n) + "\n");
		}
	}
}
