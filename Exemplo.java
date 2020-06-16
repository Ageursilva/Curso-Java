public class Exemplo {
	public static void main(String[] args) {
		int n, cont, fat;
		n = 5;
		cont = 2;
		fat = 1;
		while(cont <= n){
			fat = fat*cont;
			cont++;
		}
		System.out.print(fat);
	}
}
