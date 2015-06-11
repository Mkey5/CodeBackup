console.log(calculateKnots(20));
console.log(calculateKnots(112));
console.log(calculateKnots(400));

function calculateKnots(km){
    var knots = (km * 0.5399568034557235);
    return((knots).toFixed(2));
}