<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ page import = "model1.StudentBean" %>

<%
	String studentId = request.getParameter("studentId");
	StudentBean studentBean = new StudentBean();
	studentBean.selectStudent(studentId);
%>

<html>
	<head>
		<title>Model1 방식</title>
	</head>
	<body>
		<h3> 학번 [<%=studentId %>] 학생 정보</h3>
		<table border="1">
			<tr align="center">
				<td>학생 아이디</td>
				<td>학생 이름</td>
				<td>학생 이메일</td>
				<td>학생 전화번호</td>
				<td>학과 아이디</td>
			</tr>
			<tr align="center">
				<td><%=studentBean.getStudentId() %></td>
				<td><%=studentBean.getStudentName() %></td>
				<td><%=studentBean.getStudentEmail() %></td>
				<td><%=studentBean.getStudentTel() %></td>
				<td><%=studentBean.getDepartmentId() %></td>
			</tr>
		</table>
	</body>
</html>
