

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	//Product product=null;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("productId"));
		Product product = getProductDetails(productId);
		if (product != null) {
			// Retrieve product details from the database

			// Display product details to the user
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h2>Product Details</h2>");
			out.println("<p>ID: " + product.getPid() + "</p>");
			out.println("<p>Name: " + product.getPname() + "</p>");
			out.println("<p>Price: Rs." + product.getPcost() + "</p>");
			out.println("</body></html>");
		} else {
			// Handle invalid product ID
			response.getWriter().println("Product not found");
		}
	}

	private Product getProductDetails(int productId){
//		 String jdbcUrl = "jdbc:mysql://localhost:3306/db3";
//	        String username = "root";
//	        String password = "Dsql@0727*jha";
			//Class.forName(DbConstantPool.DRIVER_CLASS);
		

	        try {
	     
	        	Connection con=DbUtil.dbConn();
	        	if(con!=null) {
	        		System.out.println("Connection established....");
	        	}
	            String sql = "SELECT * FROM product WHERE pid=?";
	            PreparedStatement statement = con.prepareStatement(sql);
	            statement.setInt(1, productId);

	            ResultSet resultSet = statement.executeQuery();
	            if (resultSet.next()) {
	                // Create a Product object with retrieved details
	                return new Product(
	                        resultSet.getInt("pid"),
	                        resultSet.getString("pname"),
	                        resultSet.getInt("pcost")
	                );
	            }
	        }
	         catch (Exception e) {
            e.printStackTrace();
	        }

	        return null; // Return null if product not found
	    }

//	private boolean isValidProduct(int productId) {
//		// TODO Auto-generated method stub
//		return productId>0;
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
