package com.bdqn.servlet;

import com.bdqn.entity.MembersInfo;
import com.bdqn.service.MembersInfoService;
import com.bdqn.service.impl.MembersInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MembersInfoServlet extends HttpServlet {
    MembersInfoService membersInfoService = new MembersInfoServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("aasdfasdfasdfsdf");
        List<MembersInfo> list = membersInfoService.getMembersInfoList();
        System.out.println("aaaaa");
        System.out.println(list.size());
        req.setAttribute("list",list);
        req.getRequestDispatcher("view.jsp").forward(req,resp);
    }

}
