package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.CompanyModel;
import com.model.CustomerModel;
import com.model.ProductModel;
import com.util.DBUtil;

public class AdminDao 
{
Connection cn=null;
	
	int x=0;
	public int addCompanyDetails(CompanyModel cmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into company(compname,category,image) values(?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, cmodel.getCompname());
			st.setString(2, cmodel.getCategory());
			st.setString(3, cmodel.getLogoimage());
			x=st.executeUpdate();
			cn.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	public int addProductDetails(ProductModel pmodel)
	{
		x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into product(companyid,pname,size,color,price,image) values(?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, pmodel.getCompanyid());
			st.setString(2, pmodel.getPname());
			st.setString(3, pmodel.getSize());
			st.setString(4, pmodel.getColor());
			st.setString(5, pmodel.getPrice());
			st.setString(6, pmodel.getImage());
			
			x=st.executeUpdate();
			cn.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}
