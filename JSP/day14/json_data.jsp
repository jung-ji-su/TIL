<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>
	let xhr = new XMLHttpRequest();
	xhr.open("GET", "data.json", true);
	xhr.send();
	xhr.onreadystatechange = function(){
		if( xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200 ){
			//alert(xhr.responseText);
			let obj = JSON.parse(xhr.responseText);
			alert(obj.result);
			alert(obj.count);
		}
	}
</script>
</body>
</html>