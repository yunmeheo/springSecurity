<%@ page language="java" pageEncoding="UTF-8"%>
<% String contextPath=request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>spring security</title>
</head>
<body>
	<div class="logincontainer" >
	  <div class="loginDv" >
	  
	    <form id="loginform" action="<%=contextPath%>/security/signin" method="post">  
	       <input type ="text" name="admId" placeholder="관리자 ID를 입력 해 주세요."><br>
	       <input type ="password" name="admPassword"  placeholder="관리자 PW를 입력 해 주세요." ><br/>
	       <input type ="submit" id="signin" value = "로그인"><br/>
	    </form>
	    
		<form id="logoutform" action="<%=contextPath%>/security/logout" method="get">  
	    	<input type ="submit" id="signout" value = "로그아웃">
	    </form>
	    
	  </div>
	</div> 
</body>
</html>