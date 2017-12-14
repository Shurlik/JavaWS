package com.gmail.alverill;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/count")
public class AnketaServlet extends javax.servlet.http.HttpServlet {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int total = 0;

    private List<People> plist = new ArrayList<People>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String answer = request.getParameter("labeled");
        String showlist = request.getParameter("showlist");



        if (answer != null && Integer.parseInt(answer) == 1) {
            a += 1;
            total += 1;
        }
        if (answer != null && Integer.parseInt(answer) == 2) {
            b += 1;
            total += 1;
        }
        if (answer != null && Integer.parseInt(answer) == 3) {
            c += 1;
            total += 1;
        }
        if (answer != null && Integer.parseInt(answer) == 4) {
            d += 1;
            total += 1;
        }

        if (name != null && age != null && answer != null) {
            People p = new People(name, Integer.parseInt(age), Integer.parseInt(answer));
            plist.add(p);
            response.getWriter().println("<!DOCTYPE HTML>");
            response.getWriter().println("<html><body><p><h3> Answer #1: " + Integer.toString(a) + "</h3></p><p><h3> Answer #2: " + Integer.toString(b) + "</h3></p><p><h3> Answer #3: " + Integer.toString(c) + "</h3></p><p><h3> Answer #4: " + Integer.toString(d) + "</h3></p><p><h2>Total: " + Integer.toString(total) + "</h2></p><br><br><br>Click this link to <a href=\"/index.jsp\">return</a></body></html>");

        } else {
            if (showlist != null && showlist.equals("1") && plist.size() > 0) {
                String s = "";
                for (People pp : plist) {
                    s = s + "<p>Name: " + pp.getName() + ". Age: " + Integer.toString(pp.getAge()) + " Answer: " + Integer.toString(pp.getAnswer()) + ".</p>";
                }
                response.getWriter().println("<!DOCTYPE HTML>");
                response.getWriter().println("<html><body>");
                response.getWriter().println("<p><h2>List of users: </h2>" + s + ".");
                response.getWriter().println("<br><br><br>Click this link to <a href=\"/index.jsp\">return</a>");
                response.getWriter().println("</html></body>");
            } else {
                response.getWriter().println("<!DOCTYPE HTML>");
                response.getWriter().println("<html><body><p><h3> Answer #1: " + Integer.toString(a) + "</h3></p><p><h3> Answer #2: " + Integer.toString(b) + "</h3></p><p><h3> Answer #3: " + Integer.toString(c) + "</h3></p><p><h3> Answer #4: " + Integer.toString(d) + "</h3></p><p><h2>Total: " + Integer.toString(total) + "</h2></p><br><br><br>Click this link to <a href=\"/index.jsp\">return</a></body></html>");

            }


        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);

    }
}
