<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="setting.jsp" %>
<script src="${project}script.js"></script>
<link type="text/css" rel="stylesheet" href="${project}style.css">    

<html>
<body>
	<h2> 중복확인 페이지 </h2>
<%-- <%
	int cnt = (Integer) request.getAttribute("selectCnt");  // (Integer) Object 타입
	String id = (String) request.getAttribute("id"); // (String) Object 타입
%> --%>	

<form action="confirmId.do" method="post" name="confirmform" onsubmit="return confirmIdCheck();">
<%-- <%
	// id 중복
	if(cnt == 1) {
%>	 --%>
	<c:if test="${selectCnt == 1}">
		<table>
			<tr>
				<th colspan="2">
					<span>${id}</span>는 사용할 수 없습니다.
				</th>
			</tr>
			<tr>
				<th>아이디 : </th>
				<td>
					<input class="input" type="text" name="id" maxlength="20"
							style="width:150px">
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input class="inputButton" type="submit" value="확인">
					<input class="inputButton" type="reset" value="취소" onclick="self.close();">
				</th>
			</tr>
		</table>	
	</c:if>
<%-- <%		
	// id 중복 아닐 때	
	} else {
%> --%>
	<c:if test="${selectCnt != 1}">
		<table>
			<tr>
				<td align="center">
					<span>${id}</span>는 사용할 수 있습니다.
				</td>
			</tr>
			<tr>
				<th>
					<input class="inputButton" type="button" value="확인" onclick="setId('${id}');">
				</th>			
			</tr>
		</table>
	</c:if>
<%-- <%		
	}
%> --%>	

</form>
</body>
</html>