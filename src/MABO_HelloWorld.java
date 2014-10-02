
public class MABO_HelloWorld {
	
	
	/**
	 * This is Manuel's project
	 */

	public static void main(String[] args) {
		System.out.println("Hola Mundo: Método para calcular exponentes");
		System.out.println("2^4 = " + exp(2, 4));
	}
	
	
	public static int exp(int base , int exponente){
		int ans = 1;
		
		while (exponente>0) {
			ans = ans * base;
			exponente--;
		}
		return ans;
	}
	
}
