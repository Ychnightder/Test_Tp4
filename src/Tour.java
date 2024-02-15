/**
 * Repr�sente une tour du probl�me des tours de Hano�.
 */
public class Tour {
	/** Nombre maximal de disques qu'une tour peut supporter. */
	private static final int MAX = 100;
	/** Disques support�s par la tour (chacun �tant d�sign� par son diam�tre). */
	private int[] disques;
	/** Nombre de disques support�s par la tour. */
	private int nb;

	
	/**
	 * Construit une tour vide de tout disque.
	 */
	public Tour() {
		nb = 0;
		disques = new int[MAX];
	}

	/**
	 * une tour plein .
	 */
	 public Tour( int N) {
		 disques = new int[N];
		 for (int i = 0; i < N ; ++i){
			 this.disques[i] =  i;
		 }
	 }



	/**
	 * Retourne le nombre de disques �tant sur la tour.
	 */
	public int nbDisques() {
		return nb;
	}

	/**
	 * Retourne une cha�ne indiquant le diam�tre des disques pr�sents sur la
	 * tour (de la base au sommet).
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < nb; ++i) {
			if (i != 0)
				sb.append(", ");
			sb.append(disques[i]);
		}
		return sb.toString() + "]";
	}
//	public void Dep(){
//		assert(this.disques.length != 0);
//
//	}
//	public void Inter(){
//		assert(this.disques.length == 0);
//
//	}
//	public void Arr(){
//		assert (this.disques.length == 0);
//
//	}

}
