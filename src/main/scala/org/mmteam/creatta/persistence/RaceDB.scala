package org.mmteam.creatta.persistence

import javax.annotation.Generated
import javax.persistence._

@Entity
@Table(name="RACE")
class RaceDB {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id: Long = 0

  @Column(length = 50)
  var name: String = ""

}

object RaceDB {
    def getAll: List[RaceDB] = {
        val races = List()
        
        races
    }
}