<?php
    $text = $_GET['text'];
    $minFontSize = intval($_GET['minFontSize']);
    $maxFontSize = intval($_GET['maxFontSize']);
    $step = intval($_GET['step']);

    $crtFontSize = $minFontSize;


    for ($i=0; $i<strlen($text); $i++){
        $letter = $text[$i];
        if(ctype_alpha($letter)){
            if($crtFontSize<$maxFontSize){
                $crtFontSize+=$step;
            }else{
                $crtFontSize-=$step;
            }
        }

        if($letter === $text[0]){
            if(ord($letter)%2==0){
                echo "<span style='font-size:".$minFontSize.";text-decoration:line-through;'>".htmlspecialchars($letter)."</span>";
                $crtFontSize -=$step;
            }else{
                echo "<span style='font-size:".$minFontSize.";'>".htmlspecialchars($letter)."</span>";
                $crtFontSize -=$step;
            }
        }else{

            if(ord($letter)%2==0){
                echo "<span style='font-size:".$crtFontSize.";text-decoration:line-through;'>".htmlspecialchars($letter)."</span>";
            }else{
                echo "<span style='font-size:".$crtFontSize.";'>".htmlspecialchars($letter)."</span>";
            }
        }
//        var_dump($crtFontSize);
    }

?>