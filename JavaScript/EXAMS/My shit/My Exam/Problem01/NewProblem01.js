function solve(arr){

    var gold = 0;
    var silver = 0;
    var diamonds = 0;


    for (var i = 0; i < arr.length; i++) {
        var line = arr[i].trim().split(/[\s]+/);
        //console.log(line);


        if(line.length == 6 && line[0] === 'mine'){

            if(line[3].toLowerCase() === 'gold'){
                var theGold = Number(line[5]);
                gold+=theGold;
            }else if(line[3].toLowerCase() === 'silver'){
                var theSilver = Number(line[5]);
                silver+=theSilver;
            }else if(line[3].toLowerCase() === 'diamonds'){
                var theDiamonds = Number(line[5]);
                diamonds+=theDiamonds;
            }
        }else if(line[0] === 'mine' && line.length == 5){
            if(line[2].toLowerCase() === 'gold'){
                var theGold2 = Number(line[4]);
                gold+=theGold2;
            }else if(line[2].toLowerCase() === 'silver'){
                var theSilver2 = Number(line[4]);
                silver+=theSilver2;
            }else if(line[2].toLowerCase() === 'diamonds'){
                var theDiamonds2 = Number(line[4]);
                diamonds+=theDiamonds2;
            }
        }

    }
    console.log('*Silver: '+silver);
    console.log('*Gold: '+gold);
    console.log('*Diamonds: '+diamonds);

}

//solve(['mine bobovDol - gold: 10','mine medenRudnik - silver: 22','mine chernoMore - shrimps : 24','gold: 50']);
solve(['mine bobovdol - gold: 10','mine - diamonds: 5','mine colas - wood: 10', 'mine myMine - silver:  14', 'mine silver:14 - silver: 14'])











//<?php
//    $data = strtolower($_GET['data']);
////    var_dump($data);
//$gold = 0;
//$silver=0;
//$diamonds=0;
//
//$arr = explode(', ',$data);
////    var_dump($arr);
//
//for ($i=0; $i<count($arr); $i++){
//    $line = explode(' ',$arr[$i]);
////        var_dump(count($line));
//    if(count($line)== 4 && $line[0]=='mine'){
//        if($line[2] == 'gold'){
//            $gold+= intval($line[3]);
//        }else if($line[2]== 'silver'){
//            $silver+= intval($line[3]);
//        }else if($line[2]== 'diamonds'){
//            $diamonds+= intval($line[3]);
//        }
//    }
//}
//
//echo '<p>*Gold: '.$gold.'</p><p>*Silver: '.$silver.'</p><p>*Diamonds: '.$diamonds.'</p>';