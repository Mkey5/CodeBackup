<?php
    $input = htmlspecialchars($_GET['code']);
    $varRegex = '/(\$[A-Za-z]+)/';
    $forRegex = '/(for \([^]]+\))/';
    $whileRegex = '/(while \([^]]+\))/';
    $foreachRegex = '/(foreach \([^]]+\))/';
    $ifRegex = '/(if \([^]]+\))/';
    $ifElseRegex = '/(else if \([^]]+\))/';

    preg_match_all($varRegex,$input,$varArr,PREG_SET_ORDER);
    preg_match_all($forRegex,$input,$forArr,PREG_SET_ORDER);
    preg_match_all($whileRegex,$input,$whileArr,PREG_SET_ORDER);
    preg_match_all($foreachRegex,$input,$foreachArr,PREG_SET_ORDER);
    preg_match_all($ifRegex,$input,$ifArr,PREG_SET_ORDER);
    preg_match_all($ifElseRegex,$input,$ifElseArr,PREG_SET_ORDER);

    $variables = [];
    for ($i=0;$i<count($varArr);$i++){
        for ($k=0;$k<count($varArr[$i]);$k+=2){
            $variables[]= $varArr[$i][$k];
        }
    }
    $for = [];
    for ($i=0;$i<count($forArr);$i++){
        for ($k=0;$k<count($forArr[$i]);$k+=2) {

            $for[] = $forArr[$i][$k];
        }
    }

    $while =[];
    for ($i=0;$i<count($whileArr);$i++){
        for ($k=0;$k<count($whileArr[$i]);$k+=2){

            $while[]= $whileArr[$i][$k];
        }
    }

    $foreach = [];
    for ($i=0;$i<count($foreachArr);$i++){
        for ($k=0;$k<count($foreachArr[$i]);$k+=2){

            $foreach[]= $foreachArr[$i][$k];

        }
    }

    $if =[];
    for ($i=0;$i<count($ifArr);$i++){
        for ($k=0;$k<count($ifArr[$i]);$k+=2){
            $if[]= $ifArr[$i][$k];
        }
    }

    $ifElse = [];
    for ($i=0;$i<count($ifElseArr);$i++){
        for ($k=0;$k<count($ifElseArr[$i]);$k+=2){
            $ifElse[]= $ifElseArr[$i][$k];
        }
    }


    $analArray = [];

    $object2 = new stdClass('for');
    foreach ($for as $key => $value)
    {
        $object2->$key = $value;
    }

    $object = new stdClass('while');
    foreach ($while as $key => $value)
    {
        $object->$key = $value;
    }

    $object3 = new stdClass('foreach');
    foreach ($foreach as $key => $value)
    {
        $object3->$key = $value;
    }
    $loops = [$object,$object2,$object3];


    $object4 = new stdClass('if');
    foreach ($if as $key => $value)
    {
        $object4->$key = $value;
    }

    $object5 = new stdClass('else if');
    foreach ($ifElse as $key => $value)
    {
        $object5->$key = $value;
    }

    $conditionals = [$object4,$object5];

$analArray = array(
        'variables' => array_count_values($variables),
        'loops' => $loops,
        'conditionals' => $conditionals,
    );

    echo json_encode($analArray);
    




