class FootballMatch {
    var firstTeamScore = 0
    var secondTeamScore = 0

    fun setTeamScore(){
        firstTeamScore = (0..5).random()
        secondTeamScore = (0..5).random()
    }

    init{
        setTeamScore()
    }

}