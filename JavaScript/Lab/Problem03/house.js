var canvas = document.getElementById('canvas');
var ctx = canvas.getContext('2d');

//ctx.beginPath();
//ctx.moveTo(50,50);
//ctx.lineTo(250,200);
//ctx.lineTo(250,0);
//ctx.fill();


var height = 300 * (Math.sqrt(3)/2);
var X = 200;
var Y = 100;
ctx.beginPath();
ctx.moveTo(X, Y);
ctx.lineTo(X+150, Y + height);
ctx.lineTo(X-150, Y + height);
ctx.lineTo(X, Y);
ctx.fillStyle= '#965A5A';
ctx.fill();
ctx.closePath();

ctx.fillRect(50,359,300,300);
ctx.strokeRect(50,359,300,300);

ctx.fillRect(270,170,50,170);
ctx.strokeRect(270,170,50,170);

ctx.clearRect(250,420,80,80);
ctx.strokeRect(250,420,80,80);

ctx.clearRect(70,420,80,80);
ctx.strokeRect(70,420,80,80);

ctx.strokeRect(160,535,80,120);

//ctx.fillRect(25,25,100,100);
//ctx.clearRect(45,45,60,60);
//ctx.strokeRect(50,50,50,50);