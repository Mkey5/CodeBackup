function sortLetters(string,boolean){

    function sorting(array){
        if(bol === true){
            array.sort(function sortAlph(a,b){return a.toLowerCase() > b.toLowerCase()})
        }
        else{
            array.sort(function sortAlph(a,b){return a.toLowerCase() < b.toLowerCase()})
        }
        return array;
    }

    var word = string;
    var bol = boolean;
    var wordArray = new Array;

    for (var i = 0; i < word.length; i++) {
        wordArray.push(word[i]);
    }

    var theSortedArray = sorting(wordArray);
    console.log('\'' + theSortedArray.join('') + '\'');

}

sortLetters('HelloWorld', true);
sortLetters('HelloWorld', false);