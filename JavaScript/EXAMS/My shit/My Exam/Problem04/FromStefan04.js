function solve(args) {
    var regex = /\s*vs\.\s*|\s*:\s*/g,
        line,
        result,
        players = {},
        objectPLayer = {},
        player;

    args.forEach(function (elem) {
        line = elem.split(regex);
        //console.log(line);
        hostPlayer = line[0].trim().replace(/\s+/, ' ');
        guestPlayer = line[1].trim().replace(/\s+/, ' ');
        result = line[2].split(/\s+|-/);
        //console.log(result);
        //console.log(result);

        if (!players[hostPlayer]) {
            players[hostPlayer] = {
                name: hostPlayer,
                matchesWon: 0,
                matchesLost: 0,
                setsWon: 0,
                setsLost: 0,
                gamesWon: 0,
                gamesLost: 0
            }
        }

        players[hostPlayer].gamesWon += calculateGamesWon(result);
        players[hostPlayer].gamesLost += calculateGamesLost(result);
        players[hostPlayer].setsWon += calculateSetsWon(result);
        players[hostPlayer].setsLost += calculateSetsLost(result);
        players[hostPlayer].matchesWon += calculateMatchesWon(result);
        players[hostPlayer].matchesLost += calculateMatchesLost(result);

        if (!players[guestPlayer]) {
            players[guestPlayer] = {
                name: guestPlayer,
                matchesWon: 0,
                matchesLost: 0,
                setsWon: 0,
                setsLost: 0,
                gamesWon: 0,
                gamesLost: 0
            }
        }

        players[guestPlayer].gamesWon += calculateGamesLost(result);
        players[guestPlayer].gamesLost += calculateGamesWon(result);
        players[guestPlayer].setsWon += calculateSetsLost(result);
        players[guestPlayer].setsLost += calculateSetsWon(result);
        players[guestPlayer].matchesWon += calculateMatchesLost(result);
        players[guestPlayer].matchesLost += calculateMatchesWon(result);

    });
    //console.log(players);

    var sorted = [];

    var nameKeys = Object.keys(players);

    nameKeys.sort(function (a, b) {
        if (players[b].matchesWon === players[a].matchesWon) {

            if (players[b].setsWon === players[a].setsWon) {

                if (players[b].gamesWon === players[a].gamesWon) {

                    return players[a].name.localeCompare(players[b].name);

                } else return players[b].gamesWon - players[a].gamesWon;

            } else return players[b].setsWon - players[a].setsWon;

        } else return players[b].matchesWon - players[a].matchesWon;
    });
    // console.log(nameKeys);
    // console.log(players);

    nameKeys.forEach(function (tennisPLayer) {
        sorted.push(players[tennisPLayer]);
    });

    console.log(JSON.stringify(sorted));




    function calculateGamesWon(res) {
        var games = 0;
        for (var i = 0; i < res.length; i += 2) {
            games += Number(res[i])
        }
        return games;
    }

    function calculateGamesLost(res) {
        var games = 0;
        for (var i = 1; i < res.length; i += 2) {
            games += Number(res[i])
        }
        return games;
    }

    function calculateSetsWon(res) {
        var sets = 0;
        for (var i = 0; i < res.length; i += 2) {
            if (res[i] > res[i + 1]) {
                sets++;
            }
        }
        return sets;
    }

    function calculateSetsLost(res) {
        var sets = 0;
        for (var i = 0; i < res.length; i += 2) {
            if (res[i] < res[i + 1]) {
                sets++;
            }
        }
        return sets;
    }

    function calculateMatchesWon(res) {
        var matches = 0,
            setsWon = 0,
            setsLost = 0;
        for (var i = 0; i < res.length; i += 2) {
            if (res[i] > res[i + 1]) {
                setsWon++;
            } else setsLost++;
        }
        if (setsWon > setsLost) {
            matches++;
        }
        return matches;
    }

    function calculateMatchesLost(res) {
        var matches = 0,
            setsWon = 0,
            setsLost = 0;

        for (var i = 0; i < res.length; i += 2) {
            if (res[i] > res[i + 1]) {
                setsWon++;
            } else setsLost++;
        }
        if (setsWon < setsLost) {
            matches++;
        }
        return matches;
    }

}

solve([
    'Rafa Nadal vs. His Knees : 5-4 2-3 7-5 4-6 0-1',
    'Roger 		Federervs.His			Age:7-6 6-3 6-1',
    'HuanMartin  delPotro			vs.Wrist Injuries:		6-3		1-6 2-6',
    'WAYNE ODESNIK vs. Doping TwiceAlready             :0-6 0-6',
    'Rafa Nadal vs. His Knees : 5-4 1-3 7-5 4-6 0-1',
    'Roger 		Federervs.His			Age:7-6 6-3 6-1',
    'HuanMartin  delPotro			vs.Wrist Injuries:		6-3		1-6 2-6',
    'WAYNE ODESNIK vs. Doping TwiceAlready             :0-6 0-6 6-0 6-0 0-6',
    'Rafa Nadal vs. His Knees : 7-4 2-3 7-5 4-6 2-5',
    'Roger 		Federervs.His			Age:7-6 6-3 6-1',
    'HuanMartin  delPotro			vs.Wrist Injuries:		6-3		1-6 2-6',
    'WAYNE ODESNIK vs.Doping TwiceAlready             :0-6 0-6',
    'Rafa Nadalvs.His Knees : 5-3 2-3 7-1 4-6 0-1',
    'Roger Federer	vs.		His Age:7-6 6-3 6-1',
    'HuanMartin  delPotrn			vs.Wrist Injuries:		6-3		1-6 2-6',
    'WAYNE ODESNIK vs. Doping TwiceAlready             :0-6 0-6',
    'Rafa Nadal vs. His Knees : 5-4 2-3 7-5 4-6 0-1',
    'Roger 		Federervs.His			Age:7-6 6-3 6-1',
    'HuanMartin  delPotrn	  vs.Wrist Injuries:		6-3		1-6 2-6',
    'WAYNE ODESNIKvs. Doping TwiceAlready             :0-6 0-6',
    'Rafa Nadal vs. His Knees : 5-1 2-4 7-5 2-6 0-1',
    'Roger 		Federervs.His			Age:7-6 6-3 6-1',
    'HuanMartin  	delPotrn			vs.Wrist Injuries:		6-3 1-6 2-6',
    'WAYNE 	ODESNIK 	vs. Doping 		TwiceAlready	:1-6 2-6'
])