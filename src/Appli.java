public class Appli {
	/**
	 * D�place le disque �tant au sommet d'une tour vers une autre.
	 * @param de La tour d'o� est retir� le disque �tant au sommet.
	 * @param vers La tour sur laquelle le disque est d�pos�.
	 */
	private static void bouger(Tour de, Tour vers) {
//				de.Dep();
//				vers.Inter();
		// deplacer tous les disques sauf le plus grand
		for (int i = de.nbDisques() - 1; i > 0; i--) {
			deplacer(de, i, vers, null);
			bouger(de, vers);
		}
//	  deplacer(de, de.nbDisques(), vers.Arr(),  null);

		for (int i = de.nbDisques() - 1; i > 0; i--) {
//			deplacer(vers, i, vers.Arr(), null);
			bouger(de, vers);
		}
	}

	/**
	 * D�place plusieurs disques �tant au sommet d'une tour vers une autre en
	 * employant une troisi�me tour interm�diaire.
	 * 
	 * @param de
	 *            La tour de d�part.
	 * @param nb
	 *            Le nombre de disques devant �tre d�plac�s de son sommet.
	 * @param vers
	 *            La tour destination.
	 * @param via
	 *            La tour servant d'interm�diaire dans les d�pacements.
	 * @return Le nombre de d�placements de disques effectu�s.
	 */

	private static int deplacer(Tour de, int nb, Tour vers, Tour via) {
		assert (de.nbDisques() >= nb);
		if (nb == 0)
			return 0;
		int nbdep1 = deplacer(de, nb - 1, via, vers);
		bouger(de, vers);
		int nbdep2 = deplacer(via, nb - 1, vers, de);
		return nbdep1 + 1 + nbdep2;
	}

	/** Programme illustrant le probl�me des tours de Hano�. */

	public static void main(String[] args) {

		final int TAILLE = 3, N = 20;
		Tour[] tours = new Tour[TAILLE];
		tours[0] = new Tour(N);
		for (int i = 1; i < TAILLE; i++){
			tours[i] = new Tour();
		}

		// A compl�ter
		// Initialiser le tableau de fa�on � ce que tours[0] contienne
		// tous les disques de taille N, N-1, ..., 1 et que les autres
		// soient vides de disque
		
		for (Tour t : tours) {
			System.out.println(t.toString());
		}
		int nbdep = deplacer(tours[0], N, tours[2], tours[1]);
		System.out.println("nombre de d�placements : " + nbdep);
		
		for (Tour t : tours)
			System.out.println(t.toString());
	}
}
