import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws IOException,ServletException
    {
        res.setContentType("html/text");
        PrintWriter out=res.getWriter();

        String name=req.getParameter("name");
        String pass=req.getParameter("Pass");

        out.println("Login Successfully:"+name);
    }
}
