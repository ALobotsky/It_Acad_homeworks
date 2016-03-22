package homework6;

import java.util.Arrays;

public class Homework6 {

	public static void main(String[] args) {
		
		
		
		int ar1[] = new int[5];
		int ar2[] = new int[3];
		int[] ar4 ={0,1,2};
		int ar3[] = new int[ar1.length+ar2.length+ar4.length]; // Размерность конечного массива определяем заранее
		
		for (int i=0;i<ar1.length;i++){
			ar1[i]= (int)(Math.random()*10 + 1);
			System.out.print(ar1[i]+" ");//1ый массив через Math.random
		}
		System.out.println();
		
		for (int j=0;j<ar2.length;j++){
			ar2[j]= (int)(Math.random()*10 + 1);
			System.out.print(ar2[j]+" ");// 2ой массив через Math.random
		}
		System.out.println();
	
		System.out.println("Итого");

		System.arraycopy(ar1, 0, ar3, 0,ar1.length);
		System.arraycopy(ar2, 0, ar3, ar1.length,ar2.length);
		System.arraycopy(ar4, 0, ar3, (ar1.length+ar2.length),ar4.length);//3хкратное использование System.arraycopy
		
		for (int g=0; g<(ar3.length);g++){
			System.out.print(ar3[g]+"["+g+"]"+" ");
		}
		
		System.out.println("- Ряд распечатан");
		
	}

}
