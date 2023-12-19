<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.HBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Pluto - Responsive Bootstrap Admin Panel Templates</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- site icon -->
      <link rel="icon" href="images/fevicon.png" type="image/png" />
      <!-- bootstrap css -->
      <link rel="stylesheet" href="css/bootstrap.min.css" />
      <!-- site css -->
      <link rel="stylesheet" href="style.css" />
      <!-- responsive css -->
      <link rel="stylesheet" href="css/responsive.css" />
      <!-- color css -->
      <link rel="stylesheet" href="css/colors.css" />
      <!-- select bootstrap -->
      <link rel="stylesheet" href="css/bootstrap-select.css" />
      <!-- scrollbar css -->
      <link rel="stylesheet" href="css/perfect-scrollbar.css" />
      <!-- custom css -->
      <link rel="stylesheet" href="css/custom.css" />
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->
</head>
<body>
 <div class="full_container">
         <div class="inner_container">
            <!-- Sidebar  -->
            <%@ include file="sidebar.jsp" %>
            
            <div id="content">
            	<%@ include file="header.jsp" %>
            	
            		<div class="midde_cont">
            			 <div class="login_form">
                     <form method="post" action="../AdminController" enctype="multipart/form-data"> 
                        <table style="align-content: center;">
                        <tr>
                        	<td><label >Company Name with Category </label></td>
                              <td>
                              		<select name="companyid">
                              			<option value="0">--Select Company with category--</option>
                              			<%
                              			Connection cn=new HBUtil().getConnectionData();
                              			                              				String qry="select * from company";
                              			                              				PreparedStatement st=cn.prepareStatement(qry);
                              			                              				ResultSet rs=st.executeQuery();
                              			                              				while(rs.next())
                              			                              				{
                              			%>
                              				<option value="<%= rs.getInt(1)%>"><%= rs.getString(2) %> - <%= rs.getString(3) %></option>
                              				<%
                              				}
                              				cn.close();
                              				%>
                              		</select>
                              	
                              </td>
                           </tr>
                        	<tr>
                        	<td><label >Company Name</label></td>
                              <td><input type="text" name="pname" placeholder="Enter Product Name" /></td>
                           </tr>
                           <tr>
                        	<td>&nbsp;</td>
                              <td>&nbsp;</td>
                           </tr>
                           	<tr>
                        	<td><label >Size </label></td>
                              <td><input type="text" name="size" placeholder="Enter Size" /></td>
                           </tr>
                           <tr>
                        	<td>&nbsp;</td>
                              <td>&nbsp;</td>
                           </tr>
                           <tr>
                        	<td><label >Color </label></td>
                        	 <td><input type="text" name="color" placeholder="Enter Color" /></td>
                           </tr>
                           <tr>
                        	<td>&nbsp;</td>
                              <td>&nbsp;</td>
                           </tr>	
                           <tr>
                        	<td><label >Price </label></td>
                        	 <td><input type="text" name="price" placeholder="Enter Price" /></td>
                           </tr>
                           <tr>
                        	<td>&nbsp;</td>
                              <td>&nbsp;</td>
                           </tr>	
                           <tr>
                        	<td><label >Product Image</label></td>
                              <td><input type="file" name="image"/></td>
                           </tr>
                           <tr>
                        	<td>&nbsp;</td>
                              <td>&nbsp;</td>
                           </tr>
                           <tr><td></td>
                           <td> <button name="action" value="addproduct" class="main_bt">Add Product</button></td>
                           <tr>
                        </table>
                     </form>
                  </div>
            			<%@ include file="footer.jsp" %>
            
            
            	</div>
            </div>
    </div>
 </div>
   <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <!-- wow animation -->
      <script src="js/animate.js"></script>
      <!-- select country -->
      <script src="js/bootstrap-select.js"></script>
      <!-- owl carousel -->
      <script src="js/owl.carousel.js"></script> 
      <!-- chart js -->
      <script src="js/Chart.min.js"></script>
      <script src="js/Chart.bundle.min.js"></script>
      <script src="js/utils.js"></script>
      <script src="js/analyser.js"></script>
      <!-- nice scrollbar -->
      <script src="js/perfect-scrollbar.min.js"></script>
      <script>
         var ps = new PerfectScrollbar('#sidebar');
      </script>
      <!-- custom js -->
      <script src="js/custom.js"></script>
      <script src="js/chart_custom_style1.js"></script>
</body>
</html>