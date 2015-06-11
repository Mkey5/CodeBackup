function solve(arr){
    var bladesArray = arr;

    console.log('<table border="1">');
    console.log('<thead>');
    console.log('<tr><th colspan="3">Blades</th></tr>');
    console.log('<tr><th>Length [cm]</th><th>Type</th><th>Application</th></tr>');
    console.log('</thead>');
    console.log('<tbody>');

    for (var i = 0; i < bladesArray.length; i++) {
        var bladeLength = Number(Math.floor(bladesArray[i]));
        var dividedByFive = bladeLength % 5;
        var type = bladeLength > 40 ? 'sword':'dagger';
        var application;

        if(bladeLength > 10){
            switch (dividedByFive){
                case 1:
                    application = 'blade';
                    break;
                case 2:
                    application = 'quite a blade';
                    break;
                case 3:
                    application = 'pants-scraper';
                    break;
                case 4:
                    application = 'frog-butcher';
                    break;
                case 0:
                    application = '*rap-poker';
                    break;
                default :
                    application = 'ERROR!'
            }
            console.log('<tr><td>'+ bladeLength +'</td><td>'+ type +'</td><td>'+ application +'</td></tr>');
        }
    }

    console.log('</tbody>');
    console.log('</table>');

}


solve(['17.8',
    '19.4',
    '13',
    '55.8',
    '126.96541651',
    '3'
]);

//<table border="1">
//<thead>
//<tr><th colspan="3">Blades</th></tr>
//<tr><th>Length [cm]</th><th>Type</th><th>Application</th></tr>
//</thead>
//<tbody>
//<tr><td>17</td><td>dagger</td><td>quite a blade</td></tr>
//<tr><td>19</td><td>dagger</td><td>frog-butcher</td></tr>
//<tr><td>13</td><td>dagger</td><td>pants-scraper</td></tr>
//<tr><td>55</td><td>sword</td><td>*rap-poker</td></tr>
//<tr><td>126</td><td>sword</td><td>blade</td></tr>
//</tbody>
//</table>
