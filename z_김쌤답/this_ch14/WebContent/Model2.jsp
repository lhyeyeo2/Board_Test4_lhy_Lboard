<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ page import = "model1.StudentBean" %>

<%
	StudentBean student = (StudentBean) request.getAttribute("student");
%>

<html>
	<head>
		<title>Model1 방식</title>
	</head>
	<body>
		<h3> 학번 [<%=student.getStudentId() %>] 학생 정보</h3>
		<table border="1">
			<tr align="center">
				<td>학생 아이디</td>
				<td>학생 이름</td>
				<td>학생 이메일</td>
				<td>학생 전화번호</td>
				<td>학과 아이디</td>
			</tr>
			<tr align="center">
				<td><%=student.getStudentId()   %></td>
				<td><%=student.getStudentName() %></td>
				<td><%=student.getStudentEmail()%></td>
				<td><%=student.getStudentTel()  %></td>
				<td><%=student.getDepartmentId()%></td>
			</tr>
		</table>
	</body>
</html>
