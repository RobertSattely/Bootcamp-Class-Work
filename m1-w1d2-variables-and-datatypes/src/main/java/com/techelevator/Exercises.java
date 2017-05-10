package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		int birdsOnBranch = 4;
		int birdsFlewAway = 1;
		int birdsLeft = birdsOnBranch - birdsFlewAway;
		System.out.println("1. Number of birds left: " + birdsLeft);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		int birds = 6;
		int nest = 3;
		int moreBirdsThanNest = birds - nest;
		System.out.println("2. There are " + moreBirdsThanNest + " more birds than nest.");

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		
		int raccoonsPlayingWoods = 3;
		int goHomeToEat = 2;
		int totalRaccoonsPlayingStill = raccoonsPlayingWoods - goHomeToEat;
		System.out.println("3. There is " + totalRaccoonsPlayingStill + " raccoon still playing in the woods.");

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		
		int flowers = 5;
		int bees = 3;
		int totalLessBees = flowers - bees;
		System.out.println("4. There are " + totalLessBees + " less bees than flowers.");

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		
		int lonelyPigeons = 1;
	    int newPigeons = 1;
	    int totalPigeons = lonelyPigeons + newPigeons;
	    System.out.println("5. There are " + totalPigeons + " pigeons eating breadcrumbs.");

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
	    
	    int owlsOnFence = 3;
	    int owlsJoiningOnFence = 2;
	    int totalOwlsOnFence = owlsOnFence + owlsJoiningOnFence;
	    System.out.println("6. There are " + totalOwlsOnFence + " owls on the fence.");

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
	    
	    int beaversWorking = 2 ;
	    int beaversSwimming = 1 ;
	    int totalBeaversWorking = beaversWorking - beaversSwimming ;
	    System.out.println("7. Only " + totalBeaversWorking + " beaver is working still.");
	    
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
	    
	    int toucansSitting = 2  ;
	    int toucansJoinSitting = 1 ;
	    int totalToucansSitting = toucansSitting + toucansJoinSitting;
	    System.out.println("8. " + totalToucansSitting + " toucans are sitting on a tree limb.");

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
	    
	    int squirrels = 4 ;
	    int nuts = 2 ;
	    int squirrelsWithoutNuts = squirrels - nuts ;
	    System.out.println("9. There are " + squirrelsWithoutNuts + " more squirrels then there are nuts.");

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
	    
	    int quarter = 25 ;
	    int dime = 10 ;
	    int nickels = 5;
	    int totalMoneyHiltFound = (quarter + dime + (nickels * 2)) ;
	    System.out.println("10. Mrs. Hilt found $" + ((double)totalMoneyHiltFound * 0.01) + " cents.");

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
	    
	    int briersMuffins = 18 ;
	    int macadamsMuffins = 20 ;
	    int flanneryMuffins = 17;
	    int totalFirstGradeMuffins = briersMuffins + macadamsMuffins + flanneryMuffins ;
	    System.out.println("11. The first grade class baked " + totalFirstGradeMuffins + " muffins.");

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
	    
	    int yoyo = 25 ;
	    int whistle = 14 ;
	    int totalMoneySpent= yoyo + whistle ;
	    System.out.println("12. Mrs. Hilt spent $0." + totalMoneySpent + " cents for a yoyo and whistle.");
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
	    
	    int riceKrispieTreats = 5 ;
	    int largeMarshmallows = 8;
	    int miniMarshmallows = 10;
	    int totalMarshmallowsUsed = largeMarshmallows + miniMarshmallows ;
	    System.out.println("13. To make Mrs Hilts " + riceKrispieTreats + " rice krispie treats, she used " + largeMarshmallows +
	    		" large marshmallows and " + miniMarshmallows+ " mini marshmallows. She used a total of " + totalMarshmallowsUsed +
	    		" Marshmallows.");
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
       
	    int snowHiltsHouse = 29 ;
	    int snowBrecknockSchool = 17 ;
	    int snowFallDifferance = snowHiltsHouse - snowBrecknockSchool ;
	    System.out.println("14. Mrs. Hilt had " + snowFallDifferance + " more inchs of snow than the school did.");
	    
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
	    
	    int hiltsMoney = 10 ;
	    int toyTruck = 3 ;
	    int pencilCase = 3;
	    int moneyLeftOver = hiltsMoney - (toyTruck + pencilCase) ;
	    System.out.println("15. Mrs. Hilt only has $" + moneyLeftOver + " dollars leftover.");
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
	    
	    int marbleCollection = 16;
	    int marblesLost = 7;
	    int marblesNotLost = marbleCollection - marblesLost;
	    System.out.println ("16. Bad News! Josh only has " + marblesNotLost + " marbles now, because " + marblesLost +
	    		" rolled away.");
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
	    
	    int currentSeashells = 19;
	    int seashellsWanted = 25;
	    int seashellsNeededToFind = seashellsWanted - currentSeashells;
	    System.out.println("17. Megan needs to find " + seashellsNeededToFind + " seashells to acheive her goal of " + seashellsWanted);
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
	    
	    int redBalloons = 8;
	    int totalBalloons = 17;
	    int greenBalloons = totalBalloons - redBalloons;
	    System.out.println("18. Brad has " + greenBalloons + " green balloons.");
	    
            
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        
	    int booksNotUsed = 38;
	    int booksMartaReturns = 10;
	    int totalBooksOnShelf = booksNotUsed + booksMartaReturns;
	    System.out.println("19. Today at the Library Marta returned her books! we now have " + totalBooksOnShelf + " books on the shelf.");
	    
	    
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
	    
	    int beeLegs = 6;
	    int totalBees =8;
	    int totalBeeLegs = beeLegs * totalBees;
	    System.out.println("20. Did you know 8 bees have a combind Leg count of " + totalBeeLegs);
	    
        
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
	    
	    double iceCreamConeCost = 0.99;
	    int quanityOfCones = 2;
	    double totalCost = iceCreamConeCost * quanityOfCones;
	    System.out.println("21. Mrs. Hilt wanted two ice cream cones but it would cost $" + totalCost);
	    
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        
	    int rocksHiltHas = 64;
	    int aRockBorderTakes= 125;
	    int rocksHiltNeeds = aRockBorderTakes - rocksHiltHas;
	    System.out.println("22. Like Trump, Mrs. Hilt wants to build a wall, however she is " + rocksHiltNeeds + " rocks short of what she needs.");
	    
	    
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
	    
	    int marbleHiltHas = 38;
	    int marblesHiltLost = 15;
	    int marblesHiltHasLeft = marbleHiltHas - marblesHiltLost;
	    System.out.println ("23. OH NO! Mrs. Hilt only has " + marblesHiltHasLeft + " Left. ");
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        
	    int concertDistance = 78;
	    int milesDrove = 32;
	    int milesLeftToGo = concertDistance - milesDrove;
	    System.out.println ("24. The sisters have " + milesLeftToGo + " miles Left. ");
        
	    /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
	    
	    double morningShovelTime = 1.5;
	    double afternoonShovelTime = 0.45;
	    double totalTimeShoveling = (morningShovelTime + afternoonShovelTime) * 60;
	    System.out.println ("25. Mrs. Hilt shoveld for a total of " + totalTimeShoveling + " minutes. ");
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
	    
	    int hotdogsBought = 6;
	    double hotdogsCost = 0.5;
	    double moneyNeedForHotdogs = hotdogsBought * hotdogsCost;
	    System.out.println ("26. Mrs. Hilt spent $" + moneyNeedForHotdogs + "0 to buy 6 hotdogs.");
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        
	    double hiltsPencilMoney = 0.5;
	    double pencil = 0.07;
	    double totalPencilsBought = hiltsPencilMoney / pencil;
	    System.out.println ("27. Mrs Hilt can buy " + (int)totalPencilsBought + " whole pencils.");
	    		
	    
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        
	    int totalButterflys = 33;
	    int orangeButterflys = 20;
	    int redButterflys = totalButterflys - orangeButterflys;
	    System.out.println("28. There are " + redButterflys + " red butterflys.");
	    
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
	    
	    int candy = 54;
	    int moneyKateHas = 100;
	    int kateChange = moneyKateHas - candy;
	    System.out.println("29. Kate has $" + (double)(kateChange*.01) + " Left.");
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        
	    int existingTrees = 13;
	    int newTrees = 12;
	    int totalTrees = existingTrees + newTrees;
	    System.out.println ("30. Mark has " + totalTrees + " trees in his backyard.");
	    
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        
	    int dayInHours = 24;
	    int daysTillGrandmasHouse = 2;
	    int hoursLeft = dayInHours * daysTillGrandmasHouse;
	    System.out.println("31. There are " + hoursLeft + " hours and counting till GRANDMAS!.");
	    
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        
	    int cousins = 4;
	    int gum = 5;
	    int gumForEveryone = cousins * gum;
	    System.out.println("32. Kim needs " + gumForEveryone + " pieces of gum.");
	    
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        
	    int dansMoney = 3;
	    int candyCost = 1;
	    int moneyDanHasLeft = dansMoney - candyCost;
	    System.out.println("33. Dan has $" + (double)(moneyDanHasLeft) + "0 left for more candy.");
	    
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        
	    int boats = 5;
	    int peoplePerBoat = 3;
	    int totalPeopleOnLake = boats * peoplePerBoat;
	    System.out.println("34. There are " + totalPeopleOnLake + " people on the lake today.");
	    
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
	    
	    int legosEllenHas = 380;
	    int legosLost = 57;
	    int legosEllenHasLeft = legosEllenHas - legosLost;
	    System.out.println("35. Ellen only has " + legosEllenHasLeft + " legos left.");
            
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
	    int muffinsAlreadyBaked = 35;
	    int amountNeeded = 83;
	    int arthurNeedsToMake = amountNeeded - muffinsAlreadyBaked;
	    System.out.println ("36. Arthur needs to make " + arthurNeedsToMake + " more muffins;");
	    
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        
	    int willyCrayons = 1400;
	    int lucyCrayons = 290;
	    int crayonDifferance = willyCrayons - lucyCrayons;
	    System.out.println("37. Will has " + crayonDifferance + " more Crayons then Lucy.");
	    
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
	    
	    int stickersPerPage = 10;
	    int totalPages = 22;
	    int totalStickers = stickersPerPage * totalPages;
	    System.out.println("38. There are " + totalStickers + " stickers in this book.");
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
	    
	    int cupcakes = 96;
	    int children = 8;
	    int cupcakePerChild = cupcakes / children;
	    System.out.println("39. Each kid will get " + cupcakePerChild + " cupcakes.");
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        
	    int gingerbreadCookies = 47;
	    int tinyGlassJar = 6;
	    int cookiesWithNoJar = gingerbreadCookies % tinyGlassJar;
	    System.out.println("40. There will be " + cookiesWithNoJar  + " homeless cookies... so sad.");
	    
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
	    
	    int croissantsPrepared = 59;
	    int numberOfNeighbors = 8;
	    int whatsLeftForMarian = croissantsPrepared % numberOfNeighbors;
	    System.out.println("41. There will be " + whatsLeftForMarian  + " croissants left.");
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
	    
	    int cookiesPerTray = 12;
	    int numberOfCookies = 276;
	    int numberOfTraysNeeded = numberOfCookies / cookiesPerTray;
	    System.out.println ("42. Marian will need " + numberOfTraysNeeded + " trays.");
            
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        
	    int biteSizePretzels = 480;
	    int servingSize = 12;
	    int avalibleServings = biteSizePretzels / servingSize;
	    System.out.println("43. Marian has " + avalibleServings + " Servings avalible.");
	    
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
          
	    int lemonCupcakes = 53;
	    int cupcakesLeftHome = 2;
	    int cupcakesPerBox = 3;
	    int totalAvalibleBoxes = (lemonCupcakes - cupcakesLeftHome) / cupcakesPerBox;
	    System.out.println("44. Marian has " + totalAvalibleBoxes + " boxes to Serve to the kids.");
	    
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
	    
	    int carrotSticks = 74;
	    int peopleGettingCarrots = 12;
	    int leftOverCarrots = carrotSticks % peopleGettingCarrots;
	    System.out.println("45. Susie has " + leftOverCarrots + " uneaten carrots.");
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        
	    int totalTeddyBears = 98;
	    int maxShelfLoad = 7;
	    int filledShelves = totalTeddyBears / maxShelfLoad;
	    System.out.println("46. The Sisters can fill " + filledShelves + " shelves.");
	    
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
	    
	    int picturePerAlbum = 20;
	    int mothersCollection = 480;
	    int numberOfAlbumsNeeded = mothersCollection / picturePerAlbum;
	    System.out.println("47. Susies mom needs " + numberOfAlbumsNeeded + " albums.");
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
            
	    int joesCards = 94;
	    int cardBoxHolds = 8;
	    int boxsNeedForCards = joesCards / cardBoxHolds;
	    System.out.println("48. joe filled " + boxsNeedForCards + " boxs and had " + (joesCards % cardBoxHolds) + " cards left");
        
	    
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
	    
	    int dadsBooks = 210;
	    int totalShelves = 10;
	    int booksPerShelf = dadsBooks / totalShelves;
	    System.out.println("49. Dad can fill " + booksPerShelf + " books per shelves.");

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
            
	    int cristingsCroissants = 17;
	    int cristingsGuest = 7;
	    int eachGuestGets = cristingsCroissants / cristingsGuest;
	    System.out.println("50. Each guest will get " + eachGuestGets + " croissant.");    
	 
	}

}
