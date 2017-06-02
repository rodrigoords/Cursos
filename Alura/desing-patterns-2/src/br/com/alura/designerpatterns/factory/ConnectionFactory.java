package br.com.alura.designerpatterns.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Factorys tem como função criar objetos assim como os builders, porém sua caracteristica é 
 * criar objetos que não se modificam frequentemente, diferente dos builders que criam objetos
 * complexos e que se diferenciam de uma criação para outra.
 * @author Rodrigo Sene
 *
 */

public class ConnectionFactory {
	
	public Connection getConnection(){
		
		try {
			return DriverManager.getConnection("jdbc:oracle://localhost/banco","root","123");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
