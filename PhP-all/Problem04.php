<?php
    $endNum = 145;
	$startNum = 102;
	$arr = array();

	if($endNum<100){
		echo "No!";
	}
	else{
		for ($i= $startNum; $i <= $endNum ; $i++) { 
			$num = $i;
			$ones = (int) substr($num,2,1);
			$tens = (int) substr($num, 1,1);
			$hundreds = (int) substr($num,0,1);
			if ($hundreds != $tens && $tens != $ones && $ones !=$hundreds) {
				array_push($arr,$num);
			}
		}
		
		foreach ($arr as $value) {
		echo $value.' ';
		}
	}
?>