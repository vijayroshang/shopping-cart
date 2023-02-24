package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import dto.Product;

@WebServlet("/addproduct")
public class AddProduct extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     Product product=new Product();
     product.setName(req.getParameter("name"));
     product.setPrice(Double.parseDouble(req.getParameter("price")));
     product.setCategory(req.getParameter("category"));
     
     ProductDao dao=new ProductDao();
     dao.addproduct(product);
     
     resp.getWriter().print("<h1>Producted Added Successfully</h1>");
     req.getRequestDispatcher("admin.html").include(req, resp);
    }
}
