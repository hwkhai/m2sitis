package fr.isped.m2sitis.projet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DBAccess {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        /**
         * 3306 is the default port for MySQL in XAMPP. Note both the 
         * MySQL server and Apache must be running. 
         */
        String url = "jdbc:mysql://localhost/projetInf201";

        /**
         * The MySQL user.
         */
        String user = "root";

        /**
         * Password for the above MySQL user. If no password has been 
         * set (as is the default for the root user in XAMPP's MySQL),
         * an empty string can be used.
         */
        String password = "";
    	int Count = 0;
while (true){
        try
        {
        	while (true){
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(url, user, password);
            java.sql.Statement stt = con.createStatement();

            
            // PREMIERE REQUETE : Infos patient selon ID
            int i = -1;
            	// SCANNER
                  System.out.println("_______________________________________________________________ \nVeuillez saisir le numéro d'identifiant d'un patient existant: \nOu saisir un numéro alternatif afin de créer un nouveau patient: \n(Pour quitter, saisissez '0')");
                		Scanner sc = new Scanner(System.in);
                		//On récupère le NumPatient dans une variable int i
                	    i = sc.nextInt();
                	    //Requête SQL
            			ResultSet pat = stt.executeQuery("SELECT * FROM tab_patient WHERE NumPatient = '"+i+"'");
            		
            			if (i == 0) {
                    		System.out.println("\nMerci d'avoir utilisé le logiciel.\nA bientôt");
                    		return;
            			}

            			if (pat.next()){
                    		System.out.println("Sexe: " + pat.getString(2)+ " (1 = Masculin, 2 = Féminin)" + "\nDate de naissance: " + pat.getString(3)+ "\nNom: " + pat.getString(4)+ "\nPrenom: " + pat.getString(5));
                    		
            			}
            			
            			
            //PREMIERE REQUETE BIS: Créer un patient en rentrant chaque attribut séparemment
                        else {
                        	System.out.println("Ce patient n'existe pas dans la base de données, pour le créer avec l'identifiant '"+i+"', veuillez confirmer l'ID patient: ");
                    		Scanner sc2 = new Scanner(System.in);
                    		int id;
                    		id = sc2.nextInt();
                    		
                        	System.out.println("Veuillez saisir le sexe du patient: (1 = Homme, 2 = Femme)");
                    		Scanner sc3 = new Scanner(System.in);
                    		int sex = 1;
                    		sex = sc3.nextInt();
           		
                        	System.out.println("Veuillez saisir la date de naissance du patient (format AAAA-MM-JJ):");
                    		Scanner sc4 = new Scanner(System.in);
                    		String dat;
                    		dat = sc4.nextLine();
                    		
                        	System.out.println("Veuillez saisir le prénom du patient :");
                    		Scanner sc5 = new Scanner(System.in);
                    		String pr;
                    		pr = sc5.nextLine();
                    		
                        	System.out.println("Veuillez saisir le nom du patient: ");
                    		Scanner sc6 = new Scanner(System.in);
                    		String nom;
                    		nom = sc6.nextLine();
                    		
                        	String sqlInsert = "INSERT INTO tab_patient " 
                              + "VALUES ("+id+", "+sex+", '"+dat+"', '"+pr+"', '"+nom+"')";
                        	
                        	// Répète les caractéristiques du patient créé
                    		System.out.println("Le patient que vous avez créé est: " + "(ID: "+id+", Sexe: "+sex+", Date de naissance: "+dat+", Prénom: "+pr+", Nom: "+nom+")");  
                    		stt.executeUpdate(sqlInsert);
                    		
                        }
            			
            			
             // QUESTION A CHOIX MULTIPLES
                        while(true) {System.out.println("___________________________________________\nQue voulez vous savoir? (Saisir un chiffre) \n1- Hospitalisation \n2- Actes médicaux  \n3- Maladies \n4- Choisir un nouveau patient \n0- Quitter");
                		Scanner sc1 = new Scanner(System.in);
                        String tmp = sc1.nextLine();         
                        
                        
             //DEUXIEME REQUETE : Informations d'hospitalisation
                        
                        		if (tmp.equals("1")) {
                                    ResultSet hosp = stt.executeQuery("SELECT * FROM tab_hospitalisation WHERE NumPatient = '"+i+"'");
                                    while (hosp.next()){
                                		System.out.println("Numéro d'hospitalisation: " + hosp.getString(1)+ "\nDate d'entrée: " + hosp.getString(3)+ "\nDate de sortie: " + hosp.getString(4));

                                         Count++;
                                 
                                    }
                                    	System.out.println("Nombre d'hospitalisation(s): "+ Count);
                                		System.out.println("\nFin des informations");
                                    
                        		}
                                    
                                    
             //TROISIEME REQUETE : Codes CCAM + Libellé
                            	if (tmp.equals("2")) {
                                    ResultSet acte = stt.executeQuery("SELECT tab_acte.CodeCCAM, ths_ccam.LibelleCCAM "
                                        		+ "FROM ths_ccam, tab_hospitalisation, tab_acte "
                                        		+ "WHERE NumPatient = '"+i+"' "
                                        				+ "AND tab_hospitalisation.NumHospitalisation = tab_acte.NumHopitalisation "
                                        				+ "AND tab_acte.CodeCCAM = ths_ccam.CodeCCAM");
                            		while (acte.next()){
                                    		System.out.println("Code CCAM: " + acte.getString(1)+ "\nActes médicaux: " + acte.getString(2));
                                        }
                                    
                                		System.out.println("\nFin des informations");
                                    
                        		}
           	
                            	
             //QUATRIEME REQUETE : Codes CIM10 + Libelle
                            	if (tmp.equals("3")) {
                                    ResultSet cim = stt.executeQuery("SELECT DISTINCT tab_diagnostic.CodeCIM10, ths_cim10.LibelleCIM10, DGRang "
                                        		+ "FROM ths_cim10, tab_diagnostic, tab_hospitalisation "
                                        		+ "WHERE NumPatient = '"+i+"' "
                                        			+ "AND tab_hospitalisation.NumHospitalisation = tab_diagnostic.NumHospitalisation "
                                        			+ "AND tab_diagnostic.CodeCIM10 = ths_cim10.CodeCIM10 "
                                        			+ "ORDER BY DGRang");
                            		while (cim.next()){
                                    		System.out.println("Code CIM10: " + cim.getString(1)+ "\nRang" + cim.getString(3) + " : " + cim.getString(2));
                                        }
                                    
                                		System.out.println("\nFin des informations");
                                    
      
                        		}
                            	
                    			//Pour quitter une boucle, il faudra écrire 'new' dans le terminal grâce à BREAK, ou CONTINUE pour aller à l'itération prochaine
                    			
                    			if(tmp.equals("4")) break;
                    			if(tmp.equals("0")) {
                            		System.out.println("\nMerci d'avoir utilisé le logiciel.\nA bientôt");
                            		return;
                    			}
                    			

                              }

                        
        	}
        	
                            	
        }
        catch (InputMismatchException | SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        	System.out.println("Une erreur s'est produite, le programme va redémarrer..."); 
        	continue;
        }
    	finally {}
      		}
    
    }

}
