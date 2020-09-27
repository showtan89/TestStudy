/**
 * validation check
 */
var msg_id = "아이디를 입력하세요.!!";
var msg_pwd = "비밀번호를 입력하세요.!!";
var msg_repwd = "비밀번호를 재입력하세요.!!";
var msg_pwdChk = "비밀번호가 일치하지 않습니다.!!";
var msg_name = "이름을 입력하세요.!!";
var msg_jumin1 = "주민번호를 입력하세요.!!";
var msg_jumin2 = "주민번호 뒷자리를 입력하세요.!!";
var msg_email = "이메일을 입력하세요.!!";
var msg_emailChk = "이메일 형식에 일치하지 않습니다.!!";
var msg_confirmId = "중복확인을 해주세요.!!";
	
var insertError = "회원가입에 실패했습니다.\n확인후 다시 시도하세요.!!"
var updateError = "회원정보 수정에 실패했습니다.\n확인후 다시 시도하세요.!!"
var deleteError = "회원탈퇴에 실패했습니다.\n확인후 다시 시도하세요.!!"
var passwdError = "입력하신 비밀번호가 일치하지 않습니다.\n확인후 다시 시도하세요.!!"

// 에러메시지
function errorAlert(errorMsg) {
	alert(errorMsg);
	window.history.back(); // 이전 페이지로 이동
}	
	
//-------------- 메인  ---------------------
// 메인페이지
function mainFocus() {
	document.mainform.id.focus();
}

function mainCheck() {
	if(!document.mainform.id.value) {
		alert(msg_id);
		document.mainform.id.focus();
		return false;
	} else if(!document.mainform.pwd.value) {
		alert(msg_pwd);
		document.mainform.pwd.focus();
		return false;
	}
}

// --------------- 회원 가입 --------------------
// 회원가입폼
function inputFocus() {
	document.inputform.id.focus();
}

function inputCheck() {
	if(!document.inputform.id.value) {
		alert(msg_id);
		document.inputform.id.focus();
		return false;
		
	} else if(!document.inputform.pwd.value) {
		alert(msg_pwd);
		document.inputform.pwd.focus();
		return false;
	
	} else if(!document.inputform.repwd.value) {
		alert(msg_repwd);
		document.inputform.repwd.focus();
		return false;
		
	} else if(document.inputform.pwd.value != document.inputform.repwd.value) {
		alert(msg_pwdChk);
		document.inputform.pwd.value ="";
		document.inputform.repwd.value ="";
		document.inputform.pwd.focus();
		return false;
	
	} else if(!document.inputform.name.value) {
		alert(msg_name);
		document.inputform.name.focus();
		return false;
	
	} else if(!document.inputform.jumin1.value) {
		alert(msg_jumin1);
		document.inputform.jumin1.focus();
		return false;
	
	} else if(!document.inputform.jumin2.value) {
		alert(msg_jumin2);
		document.inputform.jumin2.focus();
		return false;
	
	} else if(!document.inputform.email1.value) {
		alert(msg_email);
		document.inputform.email1.focus();
		return false;
		
	// 이메일2 값 null && 직접입력	
	} else if(!document.inputform.email2.value && document.inputform.email3.value == 0) {
		alert(msg_emailChk);
		document.inputform.email2.focus();
		return false;
		
	// 중복확인 버튼을 클릭하지 않는 경우
	// inputForm - hiddenId : 중복확인 버튼 클릭여부 체크(0:클릭안함, 1:클릭함)
	// inputForm - <input type="hidden" name="hiddenId" value="0">	
	} else if(document.inputform.hiddenId.value == 0) {
		alert(msg_confirmId);
		document.inputform.dupChk.focus();
		return false;
	}
	
}

// 중복확인 버튼 클릭시 서브창 open
function confirmId() {
	// id값 미입력시
	if(!document.inputform.id.value) {
		alert(msg_id);
		document.inputform.id.focus();
		return false;
	}
	
	/*
	 * window.open("파일명", "윈도우명", "창속성");
	 * url="주소?속성=" + 속성값; --> get방식
	 */
	var url="confirmId?id=" + document.inputform.id.value;
	window.open(url, "confirm", "menubar=no, width=300, height=200");
}

// 중복확인 창에서 id입력 여부 
function confirmIdCheck() {
	if(!document.confirmform.id.value) {
		alert(msg_id);
		document.confirmform.id.focus();
		return false;
	}
}

// opener : window 객체의 open() 메소드로 열린 새창(=중복확인창)에서, 열어준 부모창(=회원가입창)에 접근할 때 사용 
// self.close(); 메시지없이 현재창을 닫을 때 사용
// hiddenId : 중복확인 버튼 클릭 여부 체크(0:클릭안함, 1:클릭함)
function setId(id) {
	opener.document.inputform.id.value=id;
	opener.document.inputform.hiddenId.value="1";
	self.close();
}

function selectEmailChk() {
	// 직접입력
	if(document.inputform.email3.value == 0) {
		document.inputform.email2.value = "";
		document.inputform.email2.focus();
	} else {
	  // 이메일 직접입력이 아닌 경우 select box의 값(email3)을 email2의 값으로 설정
		document.inputform.email2.value = document.inputform.email3.value;
	}
}

function nextJumin1() {
	if(document.inputform.jumin1.value.length >= 6) {
		document.inputform.jumin2.focus();
	}
}

function nextJumin2() {
	if(document.inputform.jumin2.value.length >= 7) {
		document.inputform.hp1.focus();
	}
}

function nextHp1() {
	if(document.inputform.hp1.value.length >= 3) {
		document.inputform.hp2.focus();
	}
}

function nextHp2() {
	if(document.inputform.hp2.value.length >= 4) {
		document.inputform.hp3.focus();
	}
}

function nextHp3() {
	if(document.inputform.hp3.value.length >= 4) {
		document.inputform.email1.focus();
	}
}

//---------- 회원 정보 수정 ---------------
//---------- modifyForm --------------
function passwdFocus() {
	document.passwdform.pwd.focus();
}

function passwdCheck() {
	if(!document.passwdform.pwd.value) {
		alert(msg_pwd);
		document.passwdform.pwd.focus();
		return false;
	}
}
//---------- modifyView --------------
function modifyFocus() {
	document.modifyform.pwd.focus();
}

function modifyCheck() {
	
	if(!document.modifyform.pwd.value) {
		alert(msg_pwd);
		document.modifyform.pwd.focus();
		return false;
	
	} else if(!document.modifyform.repwd.value) {
		alert(msg_repwd);
		document.modifyform.repwd.focus();
		return false;
		
	} else if(document.modifyform.pwd.value != document.modifyform.repwd.value) {
		alert(msg_pwdChk);
		document.modifyform.pwd.value ="";
		document.modifyform.repwd.value ="";
		document.modifyform.pwd.focus();
		return false;
	
	} else if(!document.modifyform.email1.value) {
		alert(msg_email);
		document.modifyform.email1.focus();
		return false;
		
	// 이메일2 값 null
	} else if(!document.modifyform.email2.value) {
		alert(msg_emailChk);
		document.modifyform.email2.focus();
		return false;
	}
}