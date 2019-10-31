package smk.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductDAO {
	private Connection conn;
	private String url;
	
	public ProductDAO(String username, String password) {
		url = "jdbc:mysql://localhost:3306/products?user=" + username + "&password=" + password + "&useTimezone=true&serverTimezone=UTC";
	}
	
	public void create(Product product) throws SQLException {
		String sql = "insert into product (id, product_name, category, price, amount) values (?, ?, ?, ?, ?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, product.getId());
		stmt.setString(2, product.getName());
		stmt.setString(3, product.getCategory());
		stmt.setString(4, product.getPrice());
		stmt.setString(5, product.getAmount());
		stmt.execute();
		stmt.close();
	}
	
	public List<Product> read () {
		return null;
	}
	
	public void openConnection () throws SQLException {
		conn = DriverManager.getConnection(url);
	}
	public void closeConnection () throws SQLException {
		conn.close();
	}
}
