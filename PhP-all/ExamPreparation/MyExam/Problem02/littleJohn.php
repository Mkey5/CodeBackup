<?php
    $input = $_GET['arrows'];
    $input1 = $_GET['arrows1'];
    $input2 = $_GET['arrows2'];
    $input3 = $_GET['arrows3'];

    $arr = [$input,$input1,$input2,$input3];

//    var_dump($arr);
    $largeArrows=[];
    $mediumArrows=[];
    $smallArrows=[];

    for ($i=0;$i<count($arr);$i++){
        $line = $arr[$i];
        preg_match_all('/>{3}-{5}>{2}/',$line,$large,PREG_SET_ORDER);
        if(!empty($large)){

            for ($k=0;$k<count($large);$k++){
                $largeArrows[]=implode(',',$large[$k]);
            }
        }

        $line=preg_replace('/>>>----->>/',' ',$line);

        preg_match_all('/>{2}-{5}>{1}/',$line,$medium,PREG_SET_ORDER);
        if(!empty($medium)){
            for ($k=0;$k<count($medium);$k++){
                $mediumArrows[]=implode(',',$medium[$k]);
            }
        }
        $line = preg_replace('/>{2}-{5}>{1}/',' ',$line);
        preg_match_all('/>{1}-{5}>{1}/',$line,$small,PREG_SET_ORDER);
        if(!empty($small)){
            for ($k=0;$k<count($small);$k++){
                $smallArrows[]=implode(',',$small[$k]);
            }
        }
    }

//    var_dump($largeArrows);
    $theNumber = intval(count($smallArrows).count($mediumArrows).count($largeArrows));
//    var_dump($theNumber);
    $binary = decbin($theNumber);

//    $binary = chr($binary);

    $revBinary = strrev($binary);

    $endBinNum =$binary.$revBinary;

    $endDecNum = bindec($endBinNum);

    echo $endDecNum;
