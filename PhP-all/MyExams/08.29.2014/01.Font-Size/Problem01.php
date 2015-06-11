<?php
    
    $text = $_GET['text'];
	$minFontSize = intval($_GET['minFontSize']);
	$maxFontSize = intval($_GET['maxFontSize']);
	$step = intval($_GET['step']);
	
	$increase = TRUE;
	$curSize = $minFontSize;
	
	for ($i=0; $i < strlen($text); $i++) { 
		$letter = $text[$i];
		$decor = (!(ord($letter)%2));
		$output = "<span style='font-size:".$curSize.";";
		if($decor){
			$output .= "text-decoration:line-through;";
		}
		$output .= "'>$text[$i]</span>";
		echo $output;
		if(ctype_alpha($letter)){
			if($increase){
				$curSize += $step;
				if($curSize >= $maxFontSize){
					$increase = FALSE;
				}
			}else{
				$curSize -= $step;
				if($curSize <= $minFontSize){
					$increase = true;
				}
			}
		}
	}
	
	/*for ($i=0; $i < strlen($text); $i++) { 
		$letter = $text[$i];
		// this takes ASCII
		$asciiNum = intval($letter); 
		$decoration = FALSE;
		if ($asciiNum%2==0) {
			$decoration = TRUE;
		}
		
		
	}*/
	
	
	
	// <label>Text:</label>
    // <textarea name="text">Hi PHP5</textarea>
    // <label>Minimum font size:</label>
    // <input type="text" name="minFontSize" value="4"/>
    // <label>Maximum font size:</label>
    // <input type="text" name="maxFontSize" value="8"/>
    // <label>Step:</label>
    // <input type="text" name="step" value="3"/>
    // <input type="submit" value="Submit" />
?>