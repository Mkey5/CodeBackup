/**
 * Created by Marek on 4.4.2015 г..
 */
solve([
    'ab**l5',
    'bBb*555',
    'absh*5',
    'ttHHH',
    'ttth'
]);

function solve(args){
    var matrix = [],
        output = [],
        row = 0,
        col = 0,
        char2Check;

    for (row = 0; row < args.length; row++) {
        matrix.push([]);
        output.push([]);
        for (col = 0; col < args[row].length; col++) {
            matrix[row].push(args[row].charAt(col).toLowerCase());
            output[row].push(args[row].charAt(col));
        }
    }

    for (row = 0; row < matrix.length - 2; row++) {
        for (col = 1; col < matrix[row].length; col++) {
            if(matrix[row + 1].length < col + 1||
            matrix[row + 2].length < col){
                break;
            }
            checkIfPlus(row, col);
        }
    }

    output.forEach(function(line){
        console.log(line.join(''));
    });

    function checkIfPlus(row, col){
        char2Check = matrix[row][col];
        if(matrix[row + 1][col - 1] === char2Check &&
        matrix[row + 1][col] === char2Check &&
        matrix[row + 1][col + 1] === char2Check &&
        matrix[row + 2][col] === char2Check){
            output[row][col] = '';
            output[row + 1][col - 1] = '';
            output[row + 1][col] = '';
            output[row + 1][col + 1] = '';
            output[row + 2][col] = '';
        }
    }
}