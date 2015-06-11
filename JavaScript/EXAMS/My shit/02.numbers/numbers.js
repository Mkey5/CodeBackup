/**
 * Created by Marek on 4.4.2015 г..
 */
solve([
    '5tffwj(//*7837xzc2---34rlxXP%$”.'
]);

function solve(args){
    var nums = args[0].split(/[^0-9]+/),
        output = [],
        hex;

    nums.forEach(function(num){
        if(num.length > 0){
            hex = Number(num).toString(16).toUpperCase();
            while(hex.length < 4){
                hex = '0' + hex;
            }
            output.push('0x' + hex);
        }
    })
    console.log(output.join('-'));
}