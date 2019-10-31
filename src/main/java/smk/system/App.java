package smk.system;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
    	ProductDAO dao = new ProductDAO("root","12345");
    	Product product = new Product("1", "Coração Masculino", "Brinquedo", "Ninguém dá valor", "0");
    	try {
			dao.openConnection();
			dao.create(product);
			dao.read(product);
			dao.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
