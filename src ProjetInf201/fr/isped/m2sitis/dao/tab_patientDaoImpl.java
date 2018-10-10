package fr.isped.m2sitis.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class tab_patientDaoImpl implements tab_patientDao {
    /* Impl�mentation de la m�thode trouver() d�finie dans l'interface UtilisateurDao */
    @Override
    
    public fr.isped.m2sitis.projet.tab_patient trouver( int NumPatient ) throws DAOException {
        return null;
    }

    /* Impl�mentation de la m�thode creer() d�finie dans l'interface UtilisateurDao */
    @Override
    public void creer( fr.isped.m2sitis.projet.tab_patient patient ) throws IllegalArgumentException, DAOException {
    }
    private DAOFactory          daoFactory;

    tab_patientDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /*
    * Initialise la requ�te pr�par�e bas�e sur la connexion pass�e en argument,
    * avec la requ�te SQL et les objets donn�s.
    */
   public static java.sql.PreparedStatement initialisationRequetePreparee( Connection connexion, String sql, boolean returnGeneratedKeys, Object... objets ) throws SQLException {
       java.sql.PreparedStatement preparedStatement = connexion.prepareStatement( sql, returnGeneratedKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS );
       for ( int i = 0; i < objets.length; i++ ) {
           preparedStatement.setObject( i + 1, objets[i] );
       }
       return preparedStatement;
   }
   
}