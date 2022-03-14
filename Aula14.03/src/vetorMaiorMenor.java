import java.util.Random;

public class vetorMaiorMenor {

	public static void main(String[] args) {
	int[] x = new int[10];
	int maior = x[0];
	int menor = x[0];
	gerar(x);



System.out.println("Maior número: " + Maior(x, maior));
System.out.println("Menor número: " + Menor(x,menor));
}
	
public static int Maior(int[] x, int maior) {
	int cont = 0;
	while (cont < x.length) {
	if (x[cont]>maior)
	maior = x[cont];	
	cont++;	
	}
	return maior;
}
public static int Menor(int[] x, int menor) {
	int cont = 0;
	while (cont < x.length) {
	if (x[cont] < menor)
	menor = x[cont];	
	cont++;
	}
	return menor;
}
public static void gerar(int[] x) {
Random random = new Random();
int cont = 0;
while (cont < x.length ){
	x[cont] = random.nextInt(100);
	cont = cont + 1;
}
for (int i : x) {
	System.out.println(i);
	
}

}}

