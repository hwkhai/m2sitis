package fr.isped.m2sitis.projet;
import java.util.Date;

/**
 * 
 */

/**
 * @author Duc
 *
 */
public class tab_acte {
	// Liste des variables dans la table :
		private int NumActe;
		private String CodeCCAM;
		private Date DateActe;
		private int NumHospitalisation;
		private byte Anesthesie;
		public tab_acte(int i, String string, java.sql.Date date, int j, int k) {
			// TODO Auto-generated constructor stub
		}
		/**
		 * @return the numActe
		 */
		public int getNumActe() {
			return NumActe;
		}
		/**
		 * @param numActe the numActe to set
		 */
		public void setNumActe(int numActe) {
			NumActe = numActe;
		}
		/**
		 * @return the codeCCAM
		 */
		public String getCodeCCAM() {
			return CodeCCAM;
		}
		/**
		 * @param codeCCAM the codeCCAM to set
		 */
		public void setCodeCCAM(String codeCCAM) {
			CodeCCAM = codeCCAM;
		}
		/**
		 * @return the dateActe
		 */
		public Date getDateActe() {
			return DateActe;
		}
		/**
		 * @param dateActe the dateActe to set
		 */
		public void setDateActe(Date dateActe) {
			DateActe = dateActe;
		}
		/**
		 * @return the numHospitalisation
		 */
		public int getNumHospitalisation() {
			return NumHospitalisation;
		}
		/**
		 * @param numHospitalisation the numHospitalisation to set
		 */
		public void setNumHospitalisation(int numHospitalisation) {
			NumHospitalisation = numHospitalisation;
		}
		/**
		 * @return the anesthesie
		 */
		public byte getAnesthesie() {
			return Anesthesie;
		}
		/**
		 * @param anesthesie the anesthesie to set
		 */
		public void setAnesthesie(byte anesthesie) {
			Anesthesie = anesthesie;
		}
	
	//Getters and Setters	
		
}
