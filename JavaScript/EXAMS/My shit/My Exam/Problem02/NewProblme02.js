function solve(arr){
    var regOfSent = /([a-z]+\s+[A-Za-z,;'\"\s]+[.?!])|([a-z]+[.?!])/gi;
    var secondText = arr[1];
    var sentences = [];

    // we find and add the sentences in the arrey
    while ((match = regOfSent.exec(secondText)) !== null) {
        if (match.index === regOfSent.lastIndex) {
            regOfSent.lastIndex++;
        }

        sentences.push(match[0]);

    }
    //console.log(sentences);
    var firstText = arr[0].split(/[\W]+/);
    //console.log(fistText);
    // we make count which is an object
    var  count = {};
    //then we use the anonymous function that will check for dublicate element and returns them as object
    firstText.forEach(function(i) { var i = i.toLowerCase(); count[i] = (count[i]||0)+1;  });
    //console.log(count);
// count = {"a":3,"b":2,"c":2,"d":2,"e":2,"f":1,"g":1,"h":3}

//
//    //  here it will use the value of the keys
//    for (var key in theObject){
//        console.log(theObject[key]);
//    }
//
////  here it will use the only the key
//    for (var key in theObject){
//        console.log(key);
//    }
    var endSentences = [];
    for (var i = 0; i < sentences.length; i++) {
        var sent = sentences[i];
        //console.log(sent);
        var toCheck = sent.split(/[\W]+/);
        var countMatch = 0;
        for (var j = 0; j < toCheck.length-1; j++) {
            var word = toCheck[j].toLowerCase();
            //console.log(word);
            for (var key in count){
                //console.log(key);

                if(word === key && Number(count[key]) >=3){
                    countMatch+=1;
                }
            }

        }
        if(countMatch>=2){
            endSentences.push(sent);
        }

    }

    if(Object.getOwnPropertyNames(count).length === 0){
        console.log("No words");
    }else if(endSentences[0]!= null){
        endSentences.forEach(function(sentence) { console.log(sentence) });
    }else{
        console.log("No sentences");
    }
    //console.log(countMatch);
}

solve(["Captain Obvious was walking down the street. As the captain was walking a person came and told him: You" +
" are Captain Obvious! He Replied: Thank you CAPTAIN OBVIOUS you are the man!","The captain was walking and he was obvious." +
"He did not know what was going to happen to you in the future. Was he curious? We do not know."])