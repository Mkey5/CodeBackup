<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>Square Root</title>
		<style>
			table,tr,td,th{
				border: solid 1px black;
				padding: 12px;
			}
			
			table{
				width: 200px;
				margin: 10px auto; 
			}
			
			body{
				font-size: 40px;
			}
			
			.bold{
				font-weight: bold;
			}
		</style>
	</head>
	<body>
		<table>
			<thead>
				<tr>
					<th>Numver</th>
					<th>Square</th>
				</tr>
			</thead>
			<tbody>
				<?php
					$sum = 0;
					
					for ($i=0; $i <= 100; $i+=2) {
						$square= round(sqrt($i),2); 
						echo '<tr><td>'.$i.'</td><td>'.$square.'</td>';
						$sum+=$square;
					}
					// echo '<tr><td>Total:</td><td>'.$sum.'</td></tr>';
				?>
				<tr class="bold"><td>Total:</td><td><?php echo $sum ?></td></tr>
			</tbody>
		</table>
	</body>
</html>