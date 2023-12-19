package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.AdminDao;
import com.model.CompanyModel;
import com.model.ProductModel;
@WebServlet("/AdminController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
maxFileSize = 1024 * 1024 * 512, // 512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println("Cd is.. "+cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("login"))
		{
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			if(username.equals("rahul") && password.equals("rahul"))
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else
			{
				response.sendRedirect("admin/index.jsp");
			}
		}
		else if(action.equalsIgnoreCase("addcompany"))
		{
			CompanyModel cmodel=new CompanyModel();
			cmodel.setCompname(request.getParameter("compname"));
			cmodel.setCategory(request.getParameter("category"));
			cmodel.setLogoimage("null");
			int x=new AdminDao().addCompanyDetails(cmodel);
			if(x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else
			{
				response.sendRedirect("admin/addcompany.jsp");
			}
		}
		else if(action.equalsIgnoreCase("addproduct"))
		{
			ProductModel pmodel=new ProductModel();
			pmodel.setCompanyid(Integer.parseInt(request.getParameter("companyid")));
			pmodel.setPname(request.getParameter("pname"));
			pmodel.setSize(request.getParameter("size"));
			pmodel.setColor(request.getParameter("color"));
			pmodel.setPrice(request.getParameter("price"));
			
			
				String savePath = "C:\\Users\\DEV PATEL\\eclipse-workspace\\Project_Morning\\src\\main\\webapp\\productimage";
				
				File fileSaveDir=new File(savePath);
				if (!fileSaveDir.exists()) {
					fileSaveDir.mkdir();
					
				}
			
				Part file=request.getPart("image");
			 	String fileName=extractfilename(file);
			    file.write(savePath+File.separator+fileName);
			    String filePath=savePath+File.separator+fileName;
			    System.out.println("file path is.. "+filePath);
			    
			pmodel.setImage(fileName);
			    
			int x=new AdminDao().addProductDetails(pmodel);
			if(x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else
			{
				response.sendRedirect("admin/addproduct.jsp");
			}
					
		}
	}

}
