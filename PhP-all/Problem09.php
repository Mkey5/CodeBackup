<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calendar</title>
    <style>
        table{
            color: blue;
            display: inline-block;
            height: 200px;
            margin: 5px;
            text-align: center;
        }
        td{
            height: 100%;
        }
    </style>
</head>
<body>
<?php
for ($i = 0; $i < 12; $i++) {

    $date = time();

    $day = date('d', $date);
    $month = 1 + $i;
    $year = date('Y', $date);


    $firstDay = mktime(0, 0, 0, $month, 01, $year);

    $title = date('F', $firstDay);

    $day_of_week = date('D', $firstDay);

    switch ($day_of_week) {
        case 'Sun' :
            $blank = 0;
            break;
        case 'Mon' :
            $blank = 1;
            break;
        case 'Tue' :
            $blank = 2;
            break;
        case 'Wed' :
            $blank = 3;
            break;
        case 'Thu' :
            $blank = 4;
            break;
        case 'Fri' :
            $blank = 5;
            break;
        case 'Sat' :
            $blank = 6;
            break;
    }

    $day_in_month = cal_days_in_month(0, $month, $year);

    echo "<table border='6' width='300'>";
    echo "<tr> <th colspan='60'> $title $year</th></tr>";
    echo "<tr> <td width='62'>S</td><td width='62'>M</td><td width='62'>T</td><td width='62'>W</td><td width='62'>T</td><td width='62'>F</td><td width='62'>S</td>";

    $day_count = 1;

    echo "<tr>";

    while ($blank > 0) {
        echo "<td></td>";
        $blank = $blank - 1;
        $day_count++;
    }

    $day_num = 1;

    while ($day_num <= $day_in_month) {
        echo "<td> $day_num</td>";
        $day_count++;
        $day_num++;

        if ($day_count > 7) {
            echo "</tr><tr>";
            $day_count = 1;
        }
    }

    while ($day_count > 1 && $day_count <= 7) {
        echo "<td></td>";
        $day_count++;
    }

    echo "</td></table>";


}
?>

</body>
</html>