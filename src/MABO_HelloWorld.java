
public class MABO_HelloWorld {


	/**
	 * This is Manuel's project
	 */

	public static void main(String[] args) {
		System.out.println("Hola Mundo: Método para calcular exponentes");
		int b =2;
		int ex = 25;
		System.out.println(b+"^"+ex+" = " + expo(b, ex));
	}


	public static int expo(int base , int exponente){
		int ans = 1;

		while (exponente>0) {
			ans = ans * base;
			exponente--;
		}
		return ans;
	}



}
