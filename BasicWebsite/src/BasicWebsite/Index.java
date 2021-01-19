package BasicWebsite;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import linkedinlearning.cucumbercourse.BillCalculationHelper;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Index() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
	        //read the initial bill amount as float
			double BillAmount = Double.parseDouble(request.getParameter("billamount"));
			
			//read the tax rate
			Double TaxRate = Double.parseDouble(request.getParameter("taxrate"));
	
			//get the final bill amount
			double FinalBillAmount = BillCalculationHelper.CalculateBillForCustomer(BillAmount, TaxRate);
			
			
			response.getWriter().write("<html><body><h1>"
					+ "Initial Bill is: $" + BillAmount + "</br>"
					+ "Tax Rate is: " + TaxRate + "%" + "</br>"
					+ "Final Bill Amount is: $" + FinalBillAmount + "</br>"
					+ "</h1></body></html>");
			
	
		}
	
		catch (Exception ex) {
			response.getWriter().write("Unknown Error: " + ex.getMessage());
		}
	}
}
