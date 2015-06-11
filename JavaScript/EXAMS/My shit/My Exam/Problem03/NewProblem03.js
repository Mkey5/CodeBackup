function solve(arr){
    var encrypt = arr[0];
    var magicNum = Number(arr[1]);

    var grid = [];
    for (var m = 2; m < arr.length; m++) {
        var line = arr[m].split(" ");
        grid.push(line);

    }

    var cipher = 0;
    for (var row = 0; row < grid.length; row++) {
        for (var col = 0; col < grid.length; col++) {
            var elOne = Number(grid[row][col]);
            for (var row2 = 0; row2 < grid.length; row2++) {
                for (var col2 = 0; col2 < grid.length; col2++) {
                    var elTwo = Number(grid[row2][col2]);
                    if(row != row2 && col!=col2){
                        if(elOne+elTwo === magicNum){
                            //console.log(row+" "+col+" "+row2+" "+col2 );
                            cipher+=(row+row2)+(col+col2);
                            break;
                        }
                    }

                }

            }

        }
        
    }

    cipher= cipher/2;
    //console.log(cipher);
    var newWord = '';
    for (var n = 0; n < encrypt.length; n++) {
        var letter;
        var char = ascii(encrypt[n]);
        if(n%2===0){
            char+=cipher;
            letter = String.fromCharCode(char);
            newWord = newWord.concat(letter);

        }else{
            char-=cipher;
            letter = String.fromCharCode(char);
            newWord = newWord.concat(letter);
        }

    }

    function ascii (a) { return a.charCodeAt(0); }
    //var res = String.fromCharCode(65);

    console.log(newWord);
}

solve(['QqdvSpg','400','100 200 120','120 300 310','150 290 370'])