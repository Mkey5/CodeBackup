<?php
    date_default_timezone_set("Europe/Sofia");
    $input = $_GET['conferences'];
    $page = $_GET['page'];
    $pageSize = $_GET['pageSize'];
    $list = preg_split("/\r?\n/", $input, -1, PREG_SPLIT_NO_EMPTY);
//    var_dump($list);
    $rows = [];
    $events=[];

    for ($i=1;$i<count($list);$i++){
        $rows[] = preg_replace('/[\[\]);]/','',$list[$i]);
    }

    for ($k=1;$k<count($rows);$k++){
        $data = explode(',',$rows[$k]);
        if(count($data)== 6){
            if($data[0] === date("Y-m-d", $data[0] || $data[0]=== date("Y/m/d",$data[0]))){

            }
        }
    }

//        if($data[0])


    var_dump($data);


