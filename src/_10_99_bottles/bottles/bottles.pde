
  for (int i = 100; i > -1; i--){
    println(i + " Bottles of beer on the wall, " + i + " bottles of beer." );
    println("Take one down and pass it around, "+  i + " bottles of beer on the wall.");
    if (i == 1){
          println(i + " Bottles of beer on the wall, " + i + " bottles of beer." );
          println("Take one down and pass it around, no more bottles of beer");
    }
    else if ( i == 0){
      println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
  }
