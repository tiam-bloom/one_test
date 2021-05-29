package com.web;

import com.bean.Picture;
import com.service.IPictureService;
import com.service.impl.PictureServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showP")
public class Show extends HttpServlet {
    private IPictureService service = new PictureServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Picture> pictures = service.findAll();
        req.getSession().setAttribute("pictures",pictures);
        req.getRequestDispatcher("/show.jsp").forward(req,resp);
    }
}
