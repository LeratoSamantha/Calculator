package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class QuizResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <h1>Subtraction Quiz</h1>\n");
      out.write("    \n");
      out.write("    <form action=\"QuizResults.jsp\" method=\"post\">\n");
      out.write("        ");

            int numQuestions = 5; // Number of questions in the quiz

            // Initialize variables to keep track of questions and score
            int score = 0;
            
            for (int i = 1; i <= numQuestions; i++) {
                // Generate two random numbers for subtraction
                int num1 = (int) (Math.random() * 100); // You can adjust the range as needed
                int num2 = (int) (Math.random() * num1); // Ensure the second number is less than the first
                
                // Calculate the correct answer
                int correctAnswer = num1 - num2;
                
                // Display the question
                
      out.write("\n");
      out.write("                <p>Question ");
      out.print( i );
      out.write(": What is ");
      out.print( num1 );
      out.write(" - ");
      out.print( num2 );
      out.write(" ?</p>\n");
      out.write("                <input type=\"hidden\" name=\"correctAnswer");
      out.print( i );
      out.write("\" value=\"");
      out.print( correctAnswer );
      out.write("\">\n");
      out.write("                <input type=\"number\" name=\"userAnswer");
      out.print( i );
      out.write("\">\n");
      out.write("                <br>\n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Submit Answers\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
