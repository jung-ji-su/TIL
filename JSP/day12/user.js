/**
 * 회원가입 폼 validation 체크
 */

function sendit(){
	let frm = document.joinForm;
	let userid = frm.userid;
	let userpw = frm.userpw;
	let userpw_re = frm.userpw_re;
	let username = frm.username;
	
	// validation check
	// 아이디체크
	if(userid.value == ""){
		alert("아이디를 입력하세요!");
		userid.focus();
		return false;
	}
	
	// 비밀번호
	if(userpw.value == ""){
		alert("패스워드를 입력하세요!");
		userpw.focus();
		return false;
	}
	
	// 비밀번호 자리수, 8자리 이상 입력
	if(userpw.value.length < 8){
		alert("비밀번호는 8자리 이상으로 입력하세요!");
		userpw.focus();
		return false;
	}
	
	// 비밀번호 비밀번호 확인 일치 여부
	if(userpw.value != userpw_re.value){
		alert("비밀번호 확인을 다시 하세요!");
		userpw_re.focus();
		return false;
	}
	
	// 이름체크
	if( username.value == "" ){
		alert("이름을 입력해 주세요!");
		username.focus();
		return false;
	}	
	frm.submit();
}