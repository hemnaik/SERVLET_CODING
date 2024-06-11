
//cookie accessing//
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class servlet2 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
   {
        PrintWriter p=response.getWriter();

        Cookie c[]=request.getCookies();
        String name=c[0].getValue();
        String language=c[1].getValue();
        String department=c[2].getValue();

        p.println("<h1 style=color:magenta;>COOKIE ACCESSING</h1>");
        p.println("COOKIE="+c[0].getName()+"    VALUE="+name);
        p.println("COOKIE="+c[1].getName()+"    VALUE="+language);
        p.println("COOKIE="+c[2].getName()+"    VALUE="+department);
   }
}