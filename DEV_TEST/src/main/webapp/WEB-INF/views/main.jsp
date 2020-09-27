<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ include file="setting.jsp" %> 
  
<html>
<body onload="mainFocus();">
	<h2> 메인페이지 </h2>
	
<form action="loginPro" method="post" name="mainform" onsubmit="return mainCheck();">
	<c:if test="${sessionScope.memId == null}"> <!-- 로그인 실패, 첫진입 -->
		<table>
			<tr>
				<th colspan="2">
					<c:choose>
						<c:when test="${cnt == -1}">
							비밀번호가 다릅니다. 다시 확인하세요.!!   <!-- 로그인 실패  -->
						</c:when>
						<c:when test="${cnt == 0}">
							존재하지 않는 아이디입니다. 다시 확인하세요.!! <!-- 비가입 -->
						</c:when>
						<c:when test="${cnt == 1}">
							회원가입을 축하합니다. 로그인하세요.!!  <!-- 회원가입에 성공한 경우 -->
						</c:when>
						<c:otherwise>
							방문을 환영합니다.!!  <!-- 방문한 경우, 로그아웃 -->
						</c:otherwise>
					</c:choose>					
				</th>
			</tr>	
			<tr>
				<th> 아이디 </th>
				<td><input class="input" type="text" name="id" maxlength="20"></td>	
			</tr>
			
			<tr>
				<th> 비밀번호 </th>
				<td><input class="input" type="password" name="pwd" maxlength="10"></td>
			</tr>		
			
			<tr>
				<th colspan="2">
					<input class="inputButton" type="submit" value="로그인">
					<input class="inputButton" type="reset" value="취소">
					<input class="inputButton" type="button" value="회원가입"
							onclick="window.location='inputForm'">
				</th>
			</tr>
		</table>
	</c:if>	

	<c:if test="${sessionScope.memId != null}">   <!-- 로그인 성공, 로그아웃, 회원탈퇴, 회원정보 수정 -->
		<table>
			<tr>
				<td align="center" style="width:300px">
					<span>${sessionScope.memId}</span>님 안녕하세요!!
				</td>
			</tr>
			
			<tr>
				<th>
					<input class="inputButton" type="button" value="정보수정"
						onclick="window.location='modifyForm'">
					<input class="inputButton" type="button" value="회원탈퇴"
						onclick="window.location='deleteForm'">
					<input class="inputButton" type="button" value="로그아웃"
						onclick="window.location='logout'">		
				</th>			
			</tr>
		</table>
	</c:if>	
		
	</form>
	
</body>
</html>