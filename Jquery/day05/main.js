$('#typo, h1').click(function(){
	// animate : 애니메이션 효과를 만든다.
	// 선택자.animate({속성:값, 속성:값},시간,이징, 애니메이션이 끝나면 할일);
	//		.animate(properties [,duration] [,easing] [, complete] );
	//		properties 	: 애니메이션 효과를 줄 속성
	//		duration	: 애니메이션 효과를 완료할 때까지 걸리는 시간(ms)
	//		easing		: 애니메이션 효과의 방식을 정합니다.
	//					  swing과 linear 가능하며, 기본값은 swing이다.
	//		complete	: 요소가 사라진 후 수행할 작업을 정한다.
	
	$(this).animate({
		opacity: 0,
		fontSize: "0px"
	},2000,'easeInOutElastic',
		function(){
			$(this).animate({opacity: 1,fontSize: "110px"});
		});
	});