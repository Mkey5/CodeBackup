
<!DOCTYPE html>
<html>
    <head>
        <title>Santa</title>
        <meta charset="utf-8" />
    </head>
    <body>
        <form method="get">
            <label for="childName">Child Name</label><br/>
            <input id="childName" type="text" name="childName" value="Petyrcho"/><br/>
            <label for="wantedPresent">Wanted Present</label><br/>
            <input id="wantedPresent" type="text" name="wantedPresent" value="Big Truck" /> <br/>
            <label for="riddles">Riddles</label><br/>
            <textarea id="riddles" rows="10" cols="80" name="riddles">What do you call bears with no ears?;What is black and white and red all over?;Why do bears have fur coats?</textarea><br/>
            <input type="submit" value="Send" autofocus="autofocus"/>
        </form>	
        
        	<?php
			$childName = $_GET['childName'];
			// $childName = 'Petyrcho';
			$wantedPresent = $_GET['wantedPresent'];
			// $wantedPresent = 'Big Truck';
			$riddlesInput = $_GET['riddles'];
			// $riddlesInput = 'What do you call bears with no ears?;What is black and white and red all over?;Why do bears have fur coats?';
			
			$childName = preg_replace("/\s/", "-", $childName);
			$riddles = explode(';', $riddlesInput);
			$nrLettersChildName = strlen($childName);
			$numberOfRiddles = count($riddles);
			$riddleNumber = $nrLettersChildName % $numberOfRiddles;
			if($riddleNumber == 0) {
			    $pickedRiddle = $riddles[$numberOfRiddles - 1];
			} else {
			    $pickedRiddle = $riddles[$riddleNumber - 1];
			}
			
			$santaMessage = "\$giftOf" . $childName . " = \$[wasChildGood] ? '" . $wantedPresent . "' : '" . $pickedRiddle . "';";
			
			echo htmlspecialchars($santaMessage);
			//$encryptedMessage = encrypt($santaMessage, $nrLettersChildName);
			//echo $encryptedMessage;
			
			//echo (encrypt('Santa', 5));
			
			function encrypt($message, $key) {
			    $messageLength = strlen($message);
			    $result = '';
			    for ($i = 0; $i < $messageLength; $i++) {
			        $encryptedChar = ord($message[$i]) + $key;
			        $result .= $encryptedChar;
			    }
			    return $result;
			}
		?>

			        
        
    </body>
</html>		








