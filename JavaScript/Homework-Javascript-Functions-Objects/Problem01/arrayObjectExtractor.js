function extractObjects(array){
    var forExtracting = array;
    var onlyObjects = new Array;

    for (var i = 0; i < forExtracting.length; i++) {
        if(typeof forExtracting[i] == "object" && !(forExtracting[i] instanceof Array)){
            onlyObjects.push(forExtracting[i]);
        }
    }
    console.log(onlyObjects);

    //the instanceof Array is for checking is an object = array ;)
}


extractObjects([
        "Pesho",
        4,
        4.21,
        { name : 'Valyo', age : 16 },
        { type : 'fish', model : 'zlatna ribka' },
        [1,2,3],
        "Gosho",
        { name : 'Penka', height: 1.65}
    ]
)