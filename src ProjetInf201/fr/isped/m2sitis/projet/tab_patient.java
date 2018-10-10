package fr.isped.m2sitis.projet;
import java.util.ArrayList;
import java.util.Date;


/**
 * 
 */

/**
 * @author Duc
 *
 */
public class tab_patient {
	// Liste des variables dans la table :
	private int NumPatient;
	private byte Sexe;
	private Date DateNaissance;
	private String Prenom;
	private String Nom;
	private ArrayList<tab_diagnostic> listeSymptomes = new ArrayList<>(); 
	// Liste dynamique, taille dépendant du nombre de symptome qu'a CHAQUE patient

	/**
	 * @return the numPatient
	 */
	public int getNumPatient() {
		return NumPatient;
	}
	/**
	 * @param numPatient the numPatient to set
	 */
	public void setNumPatient(int numPatient) {
		NumPatient = numPatient;
	}
	/**
	 * @return the sexe
	 */
	public byte isSexe() {
		return Sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(byte sexe) {
		Sexe = sexe;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return DateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return Prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}
	
}
