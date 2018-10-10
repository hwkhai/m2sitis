package fr.isped.m2sitis.projet;
import java.util.Date;

public class tab_hospitalisation {
	// Liste des variables dans la table :
		private int NumHospitalisation;
		private int NumPatient;
		private Date DateEntree;
		private Date DateSortie;
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
		 * @return the dateEntree
		 */
		public Date getDateEntree() {
			return DateEntree;
		}
		/**
		 * @param dateEntree the dateEntree to set
		 */
		public void setDateEntree(Date dateEntree) {
			DateEntree = dateEntree;
		}
		/**
		 * @return the dateSortie
		 */
		public Date getDateSortie() {
			return DateSortie;
		}
		/**
		 * @param dateSortie the dateSortie to set
		 */
		public void setDateSortie(Date dateSortie) {
			DateSortie = dateSortie;
		}

}
