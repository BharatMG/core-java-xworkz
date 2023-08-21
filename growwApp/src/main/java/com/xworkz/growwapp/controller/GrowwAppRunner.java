package com.xworkz.growwapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.growwapp.dto.GrowwAppDTO;
import com.xworkz.growwapp.service.GrowwAppService;
import com.xworkz.growwapp.service.GrowwAppServiceImpl;

@WebServlet(urlPatterns = "/click")
public class GrowwAppRunner extends HttpServlet {

	GrowwAppDTO dto = new GrowwAppDTO();
	GrowwAppService service = new GrowwAppServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost method");

		int id = Integer.parseInt(req.getParameter("id"));
		String userName = req.getParameter("userName");
		String email = req.getParameter("emailId");
		long phoneNumber = Long.parseLong(req.getParameter("phoneNumber"));
		String address = req.getParameter("address");
		String panNumber = req.getParameter("panNumber");
		long uniqueClientCode = Long.parseLong(req.getParameter("uniqueClientCode"));
		long dematAccountNumber = Long.parseLong(req.getParameter("dematAccountNumber"));

		dto.setId(id);
		dto.setUserName(userName);
		dto.setEmailId(email);
		dto.setPhoneNumber(phoneNumber);
		dto.setAddress(address);
		dto.setPanNumber(panNumber);
		dto.setUniqueClientCode(uniqueClientCode);
		dto.setDematAccountNumber(dematAccountNumber);

		System.out.println(dto);
		
		req.setAttribute("n", dto);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
		dispatcher.forward(req, resp);
		
		boolean save = service.checkAndSave(dto);
		if (save) {
			System.out.println("data is saved in database");				
		}else {
			System.out.println("not data addedd");
		}
	}
}
