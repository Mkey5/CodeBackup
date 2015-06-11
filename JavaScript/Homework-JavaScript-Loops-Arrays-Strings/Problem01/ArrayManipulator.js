function solve(arr){

    function filtering(element){

        if(!isNaN(element)){
            return(true);
        }
    }

    function sorting(a,b){
        return a < b;
    }

    var input=arr;
    var counter = 1;
    var bestCounter = 1;
    var filtered = input.filter(filtering).sort(sorting);
    var minNumver = filtered[filtered.length-1];
    var maxNumver = filtered[0];
    var mostFrequent;

    for (var i = 0; i < filtered.length; i++) {
        if(filtered[i] === filtered[i+1]){
            counter++;
            if(counter > bestCounter){
                bestCounter = counter;
                mostFrequent = filtered[i];
            }
            else{
                counter = 1;
            }
        }

    }

    console.log('Min number: '+ minNumver + '\nMax number: ' + maxNumver + '\nMost frequent number: '+ mostFrequent + '\n[' + filtered + ']');

}

solve(["Pesho", 2, "Gosho", 12, 2, "true", 9, undefined, 0, "Penka", { bunniesCount : 10}, [10, 20, 30, 40]]);