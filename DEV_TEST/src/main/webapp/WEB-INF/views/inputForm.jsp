<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="setting.jsp" %>    

<html>
<body onload="inputFocus();">
	<h2> 회원가입 </h2>
	<form action="inputPro" method="post" name="inputform" onsubmit="return inputCheck();">
		<!-- hiddenId : 중복확인 버튼 클릭여부 체크(0:클릭안함, 1:클릭함) -->
		<input type="hidden" name="hiddenId" value="0">
		<table>
			<tr>
				<th colspan="2"> 회원정보를 입력하세요/!! </th>
			</tr>		
			
			<tr>
				<th> * 아이디 </th>
				<td>
					<input class="input" type="text" name="id" maxlength="20">
					<input class="inputButton" name="dupChk" type="button" value="중복확인" onclick="confirmId();">						
				</td>
			</tr>
			
			<tr>
				<th> * 비밀번호 </th>
				<td>
					<input class="input" type="password" name="pwd" maxlength="10">
				</td>
			</tr>
			
			<tr>
				<th> * 비밀번호 확인 </th>
				<td>
					<input class="input" type="password" name="repwd" maxlength="10">
				</td>
			</tr>
			
			<tr>
				<th> * 이름 </th>
				<td>
					<input class="input" type="text" name="name" maxlength="10">
				</td>
			</tr>
			
			<tr>
				<th> * 주민번호 </th>
				<td>
					<input class="input" type="text" name="jumin1" maxlength="6"
							style="width:50px" onkeyup="nextJumin1();">
					-
					<input class="input" type="text" name="jumin2" maxlength="7"
							style="width:60px" onkeyup="nextJumin2();">	
				</td>
			</tr>
			
			<tr>
				<th> 핸드폰번호 </th>
				<td>
					<input class="input" type="text" name="hp1" maxlength="3"
						style="width:30px" onkeyup="nextHp1();">
					-	
					<input class="input" type="text" name="hp2" maxlength="4"
						style="width:40px" onkeyup="nextHp2();">
					-
					<input class="input" type="text" name="hp3" maxlength="4"
						style="width:40px" onkeyup="nextHp3();">
				</td>
			</tr>
			
			<tr>	
				<th> * 이메일 </th>
				<td>
					<input class="input" type="text" name="email1" maxlength="10"
						style="width:60px">
					@
					<input class="input" type="text" name="email2" maxlength="20"
						style="width:70px">
					<select class="input" name="email3" onchange="selectEmailChk();">
						<option value="0">직접입력</option>
						<option value="naver.com">네이버</option>
						<option value="gmail.com">구글</option>
						<option value="daum.net">다음</option>
					</select>		
				</td>
			</tr>
			
			<tr>
				<th colspan="2">
					<input class="inputButton" type="submit" value="회원가입">
					<input class="inputButton" type="reset" value="재작성">
					<input class="inputButton" type="button" value="가입취소"
							onclick="window.location='main'">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>