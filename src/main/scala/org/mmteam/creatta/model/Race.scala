package org.mmteam.creatta.model

import org.mmteam.creatta.persistence.RaceDB

class Race {

  var id: Long = 0

  var name: String = ""

}

object Race {
  def getAll: List[Race] = {
    val races = List()

    races
  }

  implicit def race2raceDBPersist(race : Race) : RaceDB = new RaceDB
}