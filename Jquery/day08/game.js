/**
 *	2021-12-20 kjh	game.js 개발 시작
 */

// myCanvas 영역
let canvas = $("#myCanvas")[0];

let ctx = canvas.getContext('2d');
let w = $('#myCanvas').width();
let h = $('#myCanvas').height();

// 뱀과 먹이의 크기
let sq = 15;
let food;
let snake;
// 게임 시작 후 처음 움직이는 방향설정
let d = "RIGHT";

// 먹이의 위치를 랜덤으로 추출
function placeFood(){
	food = {
		x :	Math.round(Math.random()*(w-sq)/sq),
		y : Math.round(Math.random()*(h-sq)/sq)
	}
}

// 뱀의위치를 랜덤으로 추출
function placeSnake(){
	snake = {
		x :	Math.round(Math.random()*(w-sq)/sq),
		y : Math.round(Math.random()*(h-sq)/sq)
	}
}

// 위치에 맞춰 색을 넣어준다.
function paint_cell(x, y, color) {
	ctx.fillStyle = color;
	ctx.fillRect(x*sq,y*sq,sq,sq);
	ctx.strokeStyle="white"
	ctx.strokeRect(x*sq,y*sq,sq,sq);
}

placeFood();
paint_cell(food.x, food.y, "grey");
placeSnake();
paint_cell(snake.x, snake.y, "green");

// 0.1초마다 update 함수 호출
let gameloop = setInterval(update, 100);

function update() {
	if(d == "RIGHT"){
		snake.x = snake.x + 1;
	} else if( d == "LEFT" ){
		snake.x = snake.x - 1;
	} else if( d == "UP" ){
		snake.y = snake.y - 1;
	} else if( d == "DOWN" ){
		snake.y = snake.y + 1;
	}
	
	// 뱀이 지나간 위치를 다시 검은색으로 채워준다.
	blank();
	
	paint_cell(food.x, food.y, "grey");
	paint_cell(snake.x, snake.y, "green");
	
	// 경계선에 닿으면 게임이 종료된다.
	check_borders();
	
	check_food();
}

function blank(){
	ctx.fillStyle = 'black';
	ctx.fillRect(0,0,w,h);
}

function check_borders(){
	if(snake.x < 0 || snake.x > (w-sq)/sq 
		|| snake.y < 0 || snake.y > (h-sq)/sq ){
		
		clearInterval(gameloop);
		showGameOver();
	}
}

function showGameOver(){
	let current = $('#current').text();
	$('#final').text(current);
	$("#gameover").fadeIn();
}

// keyboard Controller
$(document).keydown(function(e){
	// 39 : RIGHT
	// 37 : LEFT
	// 38 : UP
	// 40 : DOWN
	
	let key = e.which;
	if( key == "37" ){
		snake.x -= 1;
		d = "LEFT";
	} else if( key == "38" ) {
		snake.y -= 1;
		d = "UP";
	} else if( key == "39" ) {
		snake.x += 1;
		d = "RIGHT";
	} else if( key == "40" ) {
		snake.y += 1;
		d = "DOWN";
	}
	
	check_food();
});

function check_food(){
	if( food.x == snake.x && food.y == snake.y ){
		let current = parseInt($("#current").text());
		current += 1;
		$('#current').text(current);
		placeFood();
	}
}