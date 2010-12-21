package org.mmteam.creatta.model

import javax.annotation.Generated
import javax.persistence.{GenerationType, GeneratedValue, Id, Entity}

@Entity
class Race {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id: Long = 0

  var name: String = ""

}

object Race {
    def getAll: List[Race] = {
        val races = List()
        
        races
    }
}