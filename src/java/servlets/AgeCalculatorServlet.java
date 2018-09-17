//package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author awarsyle
 */
public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String number = request.getParameter("number");
        request.setAttribute("numb", "number");
        if (number == null || number.equals(""))  
        {
            request.setAttribute("message", "Please enter a valid age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator").forward(request, response);
            return;
        }
        
         int Nage =  Integer.parseInt(number);
         Nage++;
         request.setAttribute("done", "This is your new age" + Nage);
getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
    }
}
