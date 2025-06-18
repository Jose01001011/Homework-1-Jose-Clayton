package jetbrains.kotlin.course.alias.team

import jetbrains.kotlin.course.alias.util.Identifier
import jetbrains.kotlin.course.alias.util.IdentifierFactory
import org.springframework.stereotype.Service

class TeamService {
    private val identifierFactory = IdentifierFactory()
    companion object {
        val teamsStorage: MutableMap<Identifier, Team> = mutableMapOf()
    }

    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        val teams = mutableListOf<Team>()
        repeat(teamsNumber) {
            val team = Team(identifierFactory.uniqueIdentifier())
            teamsStorage[team.id] = team
            teams.add(team)
        }
        return teams
    }
}
