package org.gevorgyanrk.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Products")
public class FirstHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random r = new Random();
        Product[] products = new Product[10];
        products[0] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"boll");
        products[1] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"Pen");
        products[2] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"Table");
        products[3] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"Chair");
        products[4] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"Mac");
        products[5] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"NeMac");
        products[6] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"Komp");
        products[7] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"NeKomp");
        products[8] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"Car");
        products[9] = Product.createProduct(r.nextInt(100),r.nextInt(10000),"Cow");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("<h1>Products</h1>");
        resp.getWriter().println("<ol>");
        for (Product product : products) {
            resp.getWriter().println(product);
        }
        resp.getWriter().println("</ol>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
