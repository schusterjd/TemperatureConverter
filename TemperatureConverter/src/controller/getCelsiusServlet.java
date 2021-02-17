/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Feb 15, 2021
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConvertTemperatures;

/**
 * Servlet implementation class getCelsius
 */
@WebServlet("/getCelsiusServlet")
public class getCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fToC = request.getParameter("fToC");
		
		ConvertTemperatures fConvert = new ConvertTemperatures(Double.parseDouble(fToC));
		
		request.setAttribute("userTempConvertToC", fConvert);
		
		getServletContext().getRequestDispatcher("/resultC.jsp").forward(request, response);
		
	}

}
