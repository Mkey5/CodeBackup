function findYoungestPerson(array){

    var arr = array;

    //with this function u can sort array of objects by keys
    //age is a key : {name:Marek , age:24}
    arr.sort(function sortByAge(a,b){
        if(a.age < b.age){
            return -1;
        }
        if(a.age > b.age){
            return 1;
        }
        return 0;
    });

    for (var i = 0; i < arr.length; i++) {
        if(arr[i].hasSmartphone === true){
            console.log('The youngest person is '+ arr[i].firstname + ' ' + arr[i].lastname);
            break;
        }

    }

}
var people = [
    { firstname : 'George', lastname: 'Kolev', age: 32, hasSmartphone: false },
    { firstname : 'Vasil', lastname: 'Kovachev', age: 40, hasSmartphone: true },
    { firstname : 'Bay', lastname: 'Ivan', age: 81, hasSmartphone: true },
    { firstname : 'Baba', lastname: 'Ginka', age: 40, hasSmartphone: false }
];

findYoungestPerson(people);