package com.web;

import com.bean.Picture;
import com.service.IPictureService;
import com.service.impl.PictureServiceImpl;
import com.utils.BeanUT;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/addP")
public class Add extends HttpServlet {
    private IPictureService service = new PictureServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String,String[]> map = req.getParameterMap();
        System.out.println(map);
        Picture picture = BeanUT.mapToBean(map,Picture.class);
        System.out.println(picture);
        int i =service.addP(picture);
        //转
        req.getRequestDispatcher("/show.jsp").forward(req,resp);
    }
}
