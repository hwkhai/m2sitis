package fr.isped.m2sitis.projet;
import java.util.Date;

/**
 * 
 */

/**
 * @author Duc
 *
 */
public class tab_diagnostic {
	// Liste des variables dans la table :
		private int NumDiagnostic;
		private int NumHospitalisation;
		private String CodeCIM10;
		private short DGRang;
		private String DGType;
	
	//Getters and Setters	
		/**
		 * @return the numActe
		 */
		public int getNumDiagnostic() {
			return NumDiagnostic;
		}
		/**
		 * @param numActe the numActe to set
		 */
		public void setNumDiagnostic(int NumDiagnostic) {
			NumDiagnostic = NumDiagnostic;
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
		 * @return the codeCIM10
		 */
		public String getCodeCIM10() {
			return CodeCIM10;
		}
		/**
		 * @param codeCIM10 the codeCIM10 to set
		 */
		public void setCodeCIM10(String codeCIM10) {
			CodeCIM10 = codeCIM10;
		}
		/**
		 * @return the dGRang
		 */
		public short getDGRang() {
			return DGRang;
		}
		/**
		 * @param dGRang the dGRang to set
		 */
		public void setDGRang(short dGRang) {
			DGRang = dGRang;
		}
		/**
		 * @return the dGType
		 */
		public String getDGType() {
			return DGType;
		}
		/**
		 * @param dGType the dGType to set
		 */
		public void setDGType(String dGType) {
			DGType = dGType;
		}
		
}
