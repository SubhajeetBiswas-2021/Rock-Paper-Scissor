fun main() {

    var rounds = 1
    var youWon =0
    var computerWon=0
    println("Welcome to Rock-Paper-Scissors! Let's start the game.")

    while (rounds <= 3) {

        println("Input the option number of Your Choice!!")
        println("Any one -> \n 1. Rock \n 2. Paper \n 3. Scissors")

        val choiceString = readLine()

        val choice: Int? = choiceString?.toIntOrNull()


        if (choice != null) {
            if (choice > 3) {
                println("Please  enter a valid digit within range")
            }else{
                var randomnumber = (1..4).random()

                if(randomnumber==1 && choice== 2){
                    println("You Won Computer choice 1 !!")
                    youWon++
                }else if(randomnumber==2 && choice ==2){
                    println("Draw Computer choice 2")
                }else if(randomnumber==3 && choice ==2){
                    println("Computer Won Computer choice 3!!")
                    computerWon++
                }else if(randomnumber==1 && choice ==1){
                    println("Draw!! Computer choice 1")
                }else if(randomnumber==2 && choice ==1){
                    println("Computer Won!! Computer choice 2")
                    computerWon++
                }else if(randomnumber==3 && choice ==1){
                    println("You Won!! Computer choice 3")
                    youWon++
                }else if(randomnumber==1 && choice ==3){
                    println("Computer Won!! Computer choice 1")
                    computerWon++
                }else if(randomnumber==2 && choice ==3){
                    println("You Won!! Computer choice 2")
                    youWon++
                }else if(randomnumber==3 && choice ==3){
                    println("Draw Computer choice 3")
                }
            }
        }else{
            println("Please enter something game can not proceed")
        }
        rounds++
    }

    if(youWon > computerWon){
        println("Game Over!")
        println("Congratulations You Have Won the game")
    }else if(youWon < computerWon){
        println("Game Over!")
        println("Congratulation to me !! HAA HAA I Won You Loose")
    }else{
        println("Game Over!")
        println("DRAW!!!!")
    }
}