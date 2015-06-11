function solve(arr){
    var marek = "marek";
    console.log(marek);

    var mak = [];
    for (var i = 0; i < marek.length; i++) {
        var obj = marek[i];
        mak[i] = obj;
        
    }
    console.log(mak);

    mak = [];
    console.log(mak);

//    now defining an object:
    var theObject = {};
    theObject.name = "Marek";
    theObject.age = Number(24);
    theObject.hobby = "lifting";
    theObject.hobby = "drinking";
    console.log(theObject);

//  here it will use the value of the keys
    for (var key in theObject){
        console.log(theObject[key]);
    }

//  here it will use the only the key
    for (var key in theObject){
        console.log(key);
    }

//  taking only the keys
    console.log(Object.keys(theObject));

    marek+=" e pi4!"
    var pich = "pi4";
    var count = 4;
    for (j=0;j<count;j++){
        pich+="pi4";
    }
    marek+=pich;
    console.log(marek);
//    reversing a string:
    var reversed = marek.split("").reverse().join("");
    console.log(reversed);

//    function to take the ascii number from a char:
    var char = ascii('M');
    function ascii (a) { return a.charCodeAt(0); }
    console.log(char);

//  returns the doubled length of the given string
    String.prototype.len2 = function() { return this.length * 2; }
    var lenTwice = 'hello'.len2();
    console.log(lenTwice);

    var objjj = {};
    if(Object.getOwnPropertyNames(objjj).length === 0){
        console.log("EMPTY !")
    }

    var number = 6;
    console.log(number%2);

}

solve('marek');