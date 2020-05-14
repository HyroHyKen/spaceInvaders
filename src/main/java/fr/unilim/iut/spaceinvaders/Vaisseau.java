package fr.unilim.iut.spaceinvaders;

public class Vaisseau {
	private Position origine;
	private Dimension dimension;
	private int vitesse;
	
	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}
	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.dimension = new Dimension(longueur, hauteur);
		this.origine = new Position (x,y);
		this.vitesse = 1;
	}
	
	public Vaisseau(Dimension dimension, Position positionOrigine) {
		this(dimension, positionOrigine, 1);
	}
	
	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		this.dimension = dimension;
		this.origine = positionOrigine;
		this.vitesse = vitesse;
	}

	public Dimension getDimension() {
		return dimension;
	}
	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneCouverte(y));
	}
	
	private boolean estOrdonneCouverte(int y) {
		return (ordonneLaPlusBasse() <=y) && (y<=ordonneLaPlusHaute());
	}
	
	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}
	
	private int ordonneLaPlusBasse() {
		return ordonneLaPlusHaute()-this.dimension.hauteur()+1;
	}
	
	public int ordonneLaPlusHaute() {
		return this.origine.ordonnee();
	}
	
	public int abscisseLaPlusADroite() {
		return (this.origine.abscisse() + this.dimension.longueur()-1);
	}
	
	public int abscisseLaPlusAGauche() {
		return origine.abscisse();
	}

	public void seDeplacerVersLaDroite() {
		this.origine.changerAbscisse(this.origine.abscisse()+ vitesse);
	}

	public void seDeplacerVersLaGauche() {
		this.origine.changerAbscisse(this.origine.abscisse()- vitesse);
	}

	public void positionner(int x, int y) {
		this.origine.changerAbscisse(x);
		this.origine.changerOrdonnee(y);
	}
}
