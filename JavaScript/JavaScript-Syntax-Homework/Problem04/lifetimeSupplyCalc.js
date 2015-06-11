function calcSupply(age, maxAge, food, foodPerDay){

    var daysToEat = (maxAge - age)*365;
    var amountOfFood = daysToEat * foodPerDay;
    return(amountOfFood + 'kg of '+ food + ' would be enough until I am '+maxAge+' years old');
}

var age = [38,20,16];
var maxAge = [118,87,102];
var food = ["chocolate","fruits","nuts"];
var foodPerDay = [0.5,2,1.1];

console.log(calcSupply(age[0],maxAge[0],food[0],foodPerDay[0]));
console.log(calcSupply(age[1],maxAge[1],food[1],foodPerDay[1]));
console.log(calcSupply(age[2],maxAge[2],food[2],foodPerDay[2]));


