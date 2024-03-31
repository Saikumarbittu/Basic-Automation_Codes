package com.Javacode;

public class Sumof2Arrays {

	public static void SumofArrays() {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array1 = { 6, 7, 8, 9, 10 };
		int sum = 0, sum1 = 0, sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			sum1 = sum1 + array1[i];
			sum2 = sum + sum1;
		}
		System.out.println(sum2);
	}
	public static void sumofintegers() {
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumofArrays();
       sumofintegers();
	}
}