package fr.isped.m2sitis.dao;

import fr.isped.m2sitis.projet.tab_patient;

public interface tab_patientDao {
	//la création d'un utilisateur, lors de son inscription
    void creer( tab_patient patient ) throws DAOException;
    //la recherche d'un utilisateur, lors de la connexion.
    tab_patient trouver( int NumPatient ) throws DAOException;

}
