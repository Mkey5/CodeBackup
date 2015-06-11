solve(['10','19','angel, 9','Boris, 10','Georgi, 3','Dimitar, 7']);

function solve(arr){
    var input = arr;
    var numberOfJumpsAllowed = Number(input[0]);
    var lengthOfTrack = Number(input[1]);
    var position = 0;
    var winner;
    var output = [];
    var str = new Array(lengthOfTrack + 1).join( '#' );
    console.log(str);
    console.log(str);

    //removing the first two elements of the array
    var onlyFleas = [];
    for (var i = 2; i < input.length; i++) {
        onlyFleas.push(input[i]);
    }



    for (var i = 0; i < numberOfJumpsAllowed; i++) {

        output = [];
        for (var j = 0; j < onlyFleas.length; j++) {
            var obj = onlyFleas[j].split(",");
            var name = obj[0];
            var jumpLength = Number(obj[1].trim());
            jumpLength*=(i+1);
            var counter = jumpLength;

            var dots1 = new Array(jumpLength + 1).join('.');
            var letter = name.slice(0, 1).toUpperCase();

            if(lengthOfTrack-jumpLength >0){
                var dots2 = new Array(lengthOfTrack - jumpLength).join('.');
                var miniOutput = dots1.concat(letter, dots2);
                output.push(miniOutput);
            }
            else{
                var miniOutput = dots1.concat(letter);
                output.push(miniOutput);
            }



            if (counter >= lengthOfTrack && i != numberOfJumpsAllowed) {
                winner = name;

                break;
            }


        }



    }

    for (var i = 0; i < output.length; i++) {
        console.log(output[i]);
    }

    console.log('Winner: '+ winner);
    console.log(str);
    console.log(str);

}
    //first that reaches the line , or the one that is the furthest , or if they all are on the
//same distance , the last that reached it