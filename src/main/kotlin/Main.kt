import kotlin.math.abs

    fun main(){

        val footballMatches = ArrayList<FootballMatch>(10).apply{
            for(i in 0..9){
                this.add(FootballMatch())
            }
        }
        


        println("All matches:")
        printFootballMatches(footballMatches)

        val footballIterator = footballMatches.iterator()

        while(footballIterator.hasNext()){
            val item = footballIterator.next()
            if(item.firstTeamScore == item.secondTeamScore) {
                footballIterator.remove()
                footballMatches.remove(item)
            }
        }

        footballMatches.forEachIndexed() { index, element ->
            if(element.firstTeamScore == element.secondTeamScore)
                footballMatches.removeAt(index)
        }

        println("All matches without drafts")
        printFootballMatches(footballMatches)

        val bestFootballMatches = footballMatches.toSet()
        bestFootballMatches.sortedBy {
            abs(it.firstTeamScore - it.secondTeamScore)
        }

        println("All best sorted matches")
        printBestFootballMatches(bestFootballMatches)


    }

    private fun printFootballMatches(footballMatches: ArrayList<FootballMatch>) {
        println()
        footballMatches.forEachIndexed { index, value ->
            println("Match number: $index")
            println("${value.firstTeamScore} ${value.secondTeamScore}")
        }
    }

    private fun printBestFootballMatches(footballMatches: Set<FootballMatch>) {
        println()
        footballMatches.forEachIndexed { index, value ->
            println("Match number: $index")
            println("${value.firstTeamScore} ${value.secondTeamScore}")
        }
    }
