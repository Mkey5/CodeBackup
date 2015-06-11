<?php
    $text = $_GET['text'];
    $finalString = '';
//    the REGEX in preg_replace matches the whole REGEX NOT ONLY ( ) !
    $newLine = preg_replace_callback('/\b[0-9]*?([A-Z]+)[0-9]*?\b/',
            function($m){
//                when matches it the match twice like : PHP PHP , and makes an array
//                so that's why I take only the [0] element
                $matched = $m[1];
                var_dump($matched);
                $reversed = strrev($matched);
                $doubled ='';

                if($matched == $reversed){
                    for ($k=0;$k<strlen($matched);$k++){
                        $temp = $matched[$k];
                        $doubled.=$temp.$temp;
                    }
                    return $doubled;
                }else{
                    return $reversed;
                }
            },$text);
    $finalString.=$newLine;

    echo '<p>'.htmlspecialchars($finalString).'</p>';
?>