<?php
    $data = strtolower($_GET['data']);
//    var_dump($data);
    $gold = 0;
    $silver=0;
    $diamonds=0;

    $arr = explode(', ',$data);
//    var_dump($arr);

    for ($i=0; $i<count($arr); $i++){
        $line = explode(' ',$arr[$i]);
//        var_dump(count($line));
        if(count($line)== 4 && $line[0]=='mine'){
            if($line[2] == 'gold'){
                $gold+= intval($line[3]);
            }else if($line[2]== 'silver'){
                $silver+= intval($line[3]);
            }else if($line[2]== 'diamonds'){
                $diamonds+= intval($line[3]);
            }
        }
    }

    echo '<p>*Gold: '.$gold.'</p><p>*Silver: '.$silver.'</p><p>*Diamonds: '.$diamonds.'</p>';
