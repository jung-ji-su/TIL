<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실시간 순위</title>
</head>
<body>
	<h1>Ajax를 이용해 실시간 순위 나타내기</h1>
	<table border="1">
		<tr>
			<th>실시간 검색 순위</th>
			<th>키워드</th>
		</tr>
		<tr>
			<td id="td1">순위</td>
			<td id="td2">키워드</td>
		</tr>
	</table>
</body>
<script>
	window.onload = function(){
		// ajax
		let xhr = new XMLHttpRequest();
		let word = new Array();
		let obj = "";
		xhr.open("GET", "data2.json", true);
		xhr.send();
		xhr.onreadystatechange = function(){
			if( xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200 ){
				//alert(xhr.responseText);
				obj = JSON.parse(xhr.responseText);
				//alert(obj);
				// 파싱된 obj에서 search_word 라는 key를 가지고 있는 
				// value 꺼내면 [{},{},{},{},{}]가 나온다.(배열이다)
				
				for( let i=0; i<obj.search_word.length; i++ ){
					// obj.search_word 배열의 각 방에는 
					// 또 json들이 담겨있다 {"rank":"1","name":"코로나"}
					// 각 방의 json들에서 name 키로 담겨있는 검색어를 꺼내서 
					// word배열의 각 방에 넣어준다. 
					word[i] = obj.search_word[i].name;
				}
			}
		}				
		let i = 0;
		
		let interval = setInterval(function(){
			i = i % obj.search_word.length;
			document.getElementById("td1").innerHTML = i + 1;
			document.getElementById("td2").innerHTML = word[i];
			i++;						
		}, 2000);
		
		// 일정시간이 지나면 setInterval stop => clearInterval(인터벌함수)
		// setTimeout(함수, 밀리초);
		setTimeout(function() {
			clearInterval(interval);
		}, 20000);	// 20초 뒤에 멈춘다
		
	};	
</script>
</html>