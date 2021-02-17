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
 * Servlet implementation class getFarenheit
 */
@WebServlet("/getFarenheitServlet")
public class getFarenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFarenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cToF = request.getParameter("cToF");
		
		ConvertTemperatures cConvert = new ConvertTemperatures(Double.parseDouble(cToF));
		
		request.setAttribute("userTempConvertToF", cConvert);
		
		getServletContext().getRequestDispatcher("/resultF.jsp").forward(request, response);
		
	}

}
