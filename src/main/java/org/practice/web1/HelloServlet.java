package org.practice.web1;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello_servlet")
public class HelloServlet extends HttpServlet {

    private String message;
    private int count;

    public void init() {//init는 시작과함께 호출 init와 destory는 딱 한번 호출됨
        message = "Hello World!";
        count = 0;
        System.out.println("HelloServlet init.....");
    }

    //doGet은 스레드마다 호출됨
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ++count;

        String str = count % 2 == 0 ? "짝수" : "홀수" ;

        response.setContentType("text/html;charset=UTF-8");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + count + "</h1>");
        out.println("<h1>" + str + "</h1>");
        out.println("</body></html>");

        out.close();
    }

    public void destroy() {
    }
}