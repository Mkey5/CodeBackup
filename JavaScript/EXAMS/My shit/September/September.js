function solve(arr){
    var bill = Number(arr[0]);
    var mood = arr[1];
    var exactTip = 0;

    if(mood === 'happy'){
        exactTip = bill*0.1;

    }
    else if(mood ==='married'){
        exactTip = bill*0.0005;

    }
    else if(mood === 'drunk'){
        var temporaryTill = bill*0.15;
        var n = Number(temporaryTill.toString()[0]);
        exactTip = Math.pow(temporaryTill,n);
    }
    else{
        exactTip = bill*0.05;
    }

    console.log(exactTip.toFixed(2));

}


solve(['120.44',
    'happy'
]);

solve(['1230.83',
    'drunk'
]);

solve(['716.00',
    'bored'
]);