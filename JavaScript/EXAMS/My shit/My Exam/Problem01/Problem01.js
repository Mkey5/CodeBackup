solve(['coin 76' , 'coin five']);
//you must check if they are integer
function solve(arr){
    var bagOfCoins = arr;
    var amountOfAll = 0;
    for (var i = 0; i < bagOfCoins.length; i++) {
        var obj = bagOfCoins[i].split(" ");
        var isItCoin = obj[0].toLowerCase();
        var amount = Number(obj[1]);

        if(isItCoin === 'coin'){
            if(amount === parseInt(amount, 10) && amount >0){
                amountOfAll+=amount;
            }
        }
    }

    //console.log(amountOfAll);
    var gold = Math.floor(amountOfAll/100);
    amountOfAll -= (gold * 100)
    //console.log(amountOfAll);
    var silver = Math.floor(amountOfAll/10);
    amountOfAll-= (silver * 10);
    var bronze = amountOfAll;

    console.log('gold : '+ gold);
    console.log('silver : ' + silver);
    console.log('bronze : '+ bronze);

}