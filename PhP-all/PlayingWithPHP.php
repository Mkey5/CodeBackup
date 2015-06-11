<?php

	$pipe = ['Marin','Pesho','Nikolai'];
	
	foreach ($pipe as $key => $value) {
		echo $value.'</br>';
	}
	
	echo '</br>';
    $myArray = array('Marin','Martin','Luben');
	
	for ($i=0; $i < 10 ; $i++) { 
		$myArray[] = $i;
	}
	
	foreach ($myArray as $variable) {
		echo $variable.'</br>';
	}
	
	// while ($a <= 10) {
// 		
	// }
// 	
	// do {
// 		
	// }while ($a <= 10)
	
	var_dump($myArray);
	
?>