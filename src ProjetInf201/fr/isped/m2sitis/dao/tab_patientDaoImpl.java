package fr.isped.m2sitis.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class tab_patientDaoImpl implements tab_patientDao {
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    @Override
    
    public fr.isped.m2sitis.projet.tab_patient trouver( int NumPatient ) throws DAOException {
        return null;
    }

    /* Implémentation de la méthode creer() définie dans l'interface UtilisateurDao */
    @Override
    public void creer( fr.isped.m2sitis.projet.tab_patient patient ) throws IllegalArgumentException, DAOException {
    }
    private DAOFactory          daoFactory;

    tab_patientDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /*
    * Initialise la requête préparée basée sur la connexion passée en argument,
    * avec la requête SQL et les objets donnés.
    */
   public static java.sql.PreparedStatement initialisationRequetePreparee( Connection connexion, String sql, boolean returnGeneratedKeys, Object... objets ) throws SQLException {
       java.sql.PreparedStatement preparedStatement = connexion.prepareStatement( sql, returnGeneratedKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS );
       for ( int i = 0; i < objets.length; i++ ) {
           preparedStatement.setObject( i + 1, objets[i] );
       }
       return preparedStatement;
   }
   
}