function solve(args) {
    var item,
        strDate,
        dateParts,
        date,
        min = new Date("January 1, 1900"),
        breakPoint = new Date("May 25, 1973"),
        max = new Date("January 1, 2015"),
        dateArray = [],
        hasHater = false,
        hasFan = false;

    for (item in args) {
        strDate = args[item];
        dateParts = strDate.split('.');

        // The DATE SHIT IS TRICKY ! If u put the month like: dateParts[1] it will  give u the month after (month+1)
        // the new Date is used like : year , month , day

        date = new Date(dateParts[2], (dateParts[1]-1), dateParts[0]);
        if (date > min && date < max) {
            if (date < breakPoint) {
                hasHater = true;
            }
            if (date >= breakPoint) {
                hasFan = true;
            }
            dateArray.push(date);
        }
    }

    if (!dateArray.length) {
        console.log('No result');
        return;
    }

    dateArray.sort(function(a, b) {
        return a.getTime() - b.getTime();
    });
    if (hasFan) {
        printResult(dateArray[dateArray.length - 1], 'fan');
    }
    if (hasHater) {
        printResult(dateArray[0], 'hater');
    }

    function printResult(date, type) {
        console.log('The biggest ' + type + ' of ewoks was born on ' + date.toDateString());
    }

}

solve(['22.03.2014',
    '17.05.1933',
    '10.10.1954'
]);

//The biggest fan of ewoks was born on Sat Mar 22 2014
//The biggest hater of ewoks was born on Wed May 17 1933
