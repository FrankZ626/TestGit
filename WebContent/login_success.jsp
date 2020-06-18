<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background='face/10.jpg'>
<center>
<font>在线书店系统</font>
<hr>
<br>
<%
//页面访问计数
    ServletContext context=this.getServletContext();
	String str_counter=(String)application.getAttribute("counter");
	if(str_counter!=null){
		int int_counter=Integer.parseInt(str_counter);
		int_counter+=1;
		str_counter=Integer.toString(int_counter);
		application.setAttribute("counter",str_counter);
	}else{
		application.setAttribute("counter","1");
	}
%>
<% if(session.getAttribute("me")!=null){%>
<font color="green"></font>
<h2>登录成功
	欢迎<font size="12" color="green">
	<%=session.getAttribute("me") %>
	</font>光临书店</h2>
	<h3>
	
	<%
	  ServletContext sc=this.getServletContext();
	%>
	    你是第<%=(String)sc.getAttribute("counter") %>位访客
	</h3>

<h3>
<a href="list_notes.jsp">进入书店</a></h3>
<a href="list_notes.jsp"><img src="face/liuyan.jpg" alt="进入书店"></a>
<%} 
else{//用户未登录，提示用户未登录，并跳转  自动更新页面
	response.setHeader("refresh","2;URL=login.html");


%>
您还没有登录，请先登录！！！<br>
两秒钟后自动跳转<font color="green">登录</font> <font color="green">窗口！！！<br>
如果没有跳转，请按<a href="login.html">这里</a>!!!</font>
<%} %>
</center>
</body>
</html>