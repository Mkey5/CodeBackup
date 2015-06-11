<?php
  
  $array = array("Team building: 6-7 September 2014, Pirin", "Nakov", "studying programming", "SoftUni");
  
  usort($array,function($a,$b){
  	return strlen($a)-strlen($b);
  });
  
  foreach ($array as $value) {
      echo $value.'</br>';
  }
  
  // print_r($array);
  
  echo '</br>';
  echo '</br>';
  
  $arr = [
    		"Gosho" => 3.55, "Mimi" => 6.00,
    		"Pesho" => [3.00, 3.50, 3.40],
   			 "Zazi" => [5.00, 5.26]
		];

  echo json_encode($arr);
  
  echo '</br>';
  echo '</br>';
  
  	
uasort($arr, function ($a, $b) {
    $first = is_array($a) ? max($a) : $a;
    $second = is_array($b) ? max($b) : $b;
    return $first - $second;
});
echo json_encode($arr);
  
?>