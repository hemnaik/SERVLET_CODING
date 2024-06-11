//cookie creation//
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class servlet1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
   {
        PrintWriter p=response.getWriter();

        Cookie c1=new Cookie("name","HEM");
        Cookie c2=new Cookie("language","PHP");
        Cookie c3=new Cookie("department","IT");
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        
        p.println("<h1 style=color:magenta;>THE COOKIE SERVLET</h1>");
        p.println("<a href='servlet2'>CLICK HERE</a>");
  }
}