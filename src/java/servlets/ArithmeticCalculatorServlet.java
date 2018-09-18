package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author awarsyle
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n1 = request.getParameter("number");
        String n2 = request.getParameter("number2");
        request.setAttribute("numb", n1);
        request.setAttribute("numb1", n2);
        if (n1 == null || n1.equals("") && n2 == null || n2.equals(""))  
        {
            request.setAttribute("message", "----");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        int Newnumber =  Integer.parseInt(n1);
        int NewNumber2 =  Integer.parseInt(n2);
        int result = 0;
       switch(request.getParameter("OPS"))
       {
           case "+":
               result = Newnumber + NewNumber2;
               break;
               case "-":
               result = Newnumber - NewNumber2;
               break;
               case "*":
               result = Newnumber * NewNumber2;
               break;
               case "%":
               result = Newnumber - NewNumber2;
               break;
       }
        request.setAttribute("answer", result);
        request.setAttribute("numb2",n2);
getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
    }
}
