var currentDateTime = new Date();

var dayNames = new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
var dayOfWeek = dayNames[currentDateTime.getDay()];

var day = currentDateTime.getDate();
var month = currentDateTime.getUTCMonth() + 1;
var year = currentDateTime.getFullYear();

var hours = currentDateTime.getHours();
var minutes = currentDateTime.getMinutes();
var seconds = currentDateTime.getSeconds();

if(day<10){
    day = '0' + day;
}

if(month<10){
    month = '0' + month;
}

if(hours<10){
    hours = '0' + hours;
}

if(minutes<10){
    minutes = '0' + minutes;
}

if(seconds<10){
    seconds = '0' + seconds;
}

var currentTime = dayOfWeek + "," + " "+ day + " " + month + " " + year + " " + hours + ":" + minutes + ":" + seconds + " GMT";
console.log(currentTime);