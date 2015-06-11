function solve(arr){
    var results = {};
    for (var i = 0; i < arr.length; i++) {
        var line = arr[i].split('|');
        var student = line[0].trim();
        var course = line[1].trim();
        var grade = Number(line[2].trim());
        var visits = Number(line[3].trim());

        // we create the object [course] in results
        if(!results[course]){
            results[course]={ grades:[],visits:[],students:[]};
        }
        results[course].grades.push(grade);
        results[course].visits.push(visits);

        // we check if this student is already in the object , in our "list", so
        // if it's not , we push him in
        if(results[course].students.indexOf(student) == -1){
            results[course].students.push(student);
        }
    }

    // with this u sort only the keys in the results
    var courses = Object.keys(results).sort();
    var output = {};

    for (var c in courses){
        var courseName = courses[c];
        var courseInfo = {
            avgGrade: average(results[courseName].grades),
            avgVisits: average(results[courseName].visits),
            students: results[courseName].students.sort()
        }

        output[courseName]= courseInfo;
    }

    console.log(JSON.stringify(output));

    function average(arr){
        var sum = 0;
        for(var i in arr){
            sum+=arr[i];
        }
        var avg = sum / arr.length;
        avg= Number(avg.toFixed(2));
        return avg;
    }
}

solve(['Peter Nikolov | PHP  | 5.50 | 8',
    'Maria Ivanova | Java | 5.83 | 7',
    'Ivan Petrov   | PHP  | 3.00 | 2',
    'Ivan Petrov   | C#   | 3.00 | 2',
    'Peter Nikolov | C#   | 5.50 | 8',
    'Maria Ivanova | C#   | 5.83 | 7',
    'Ivan Petrov   | C#   | 4.12 | 5',
    'Ivan Petrov   | PHP  | 3.10 | 2',
    'Peter Nikolov | Java | 6.00 | 9']);