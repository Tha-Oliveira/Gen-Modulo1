package JavaArray;

public class ArrayVetor1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A= {1,0,5,-2,-5,7};
		int soma=0;
		
		soma=(A[0]+A[1]+A[5]);
		
		System.out.printf("A soma das posições A0, A1 e A5 foi de: %d",soma);
		
		A[4]+=105;
		
		System.out.printf("\nOs valores do vetor A são: \n%d",A[0]);
		System.out.printf("\n%d",A[1]);
		System.out.printf("\n%d",A[2]);
		System.out.printf("\n%d",A[3]);
		System.out.printf("\n%d",A[4]);
		System.out.printf("\n%d",A[5]);

}
}
