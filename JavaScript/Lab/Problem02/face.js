var c = document.getElementById("canvas");
var ctx = c.getContext("2d");

ctx.beginPath();
ctx.arc(200,200,100,0,2*Math.PI);
ctx.lineWidth = 5;
ctx.stroke();
ctx.fillStyle='#8FC9D6';
ctx.fill();

ctx.beginPath();
ctx.arc(160,180,30,0,2*Math.PI);
ctx.strokeStyle = '#007F09';
ctx.lineWidth = 5;
ctx.stroke();

ctx.fill();

ctx.beginPath();
ctx.arc(230,180,30,0,2*Math.PI);
ctx.lineWidth = 5;
ctx.stroke();
ctx.strokeStyle = '#007F09';
ctx.fill();


ctx.beginPath();
ctx.strokeStyle = 'black';
ctx.arc(240,190,10,0,2*Math.PI);
ctx.strokeStyle = 'black';
ctx.lineWidth = 5;
ctx.stroke();
ctx.strokeStyle = '#007F09';
ctx.fill();

ctx.beginPath();
ctx.strokeStyle = 'black';
ctx.arc(150,180,10,0,2*Math.PI);
ctx.lineWidth = 5;
ctx.stroke();
ctx.strokeStyle = '#007F09';
ctx.fill();

ctx.beginPath();
ctx.arc(195,230,60,0,1*Math.PI,false);
ctx.lineWidth = 5;
ctx.stroke();

