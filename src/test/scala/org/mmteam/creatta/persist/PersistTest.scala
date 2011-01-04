package org.mmteam.creatta.persist

import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject
import javax.persistence.EntityManager
import org.mmteam.creatta.model.Race
import com.google.inject.persist.Transactional
import org.mmteam.creatta.persistence.RaceDB

/**
 * User: Julien HENRY
 * Date: 21/12/10
 * Time: 14:40
 */
@RunWith(classOf[CreatTaGuiceTestRunner])
class PersistTest {

  @Inject private var em: EntityManager = null

  @Test
  @Transactional
  def testPersist() = {
    val race = new Race
    race.name = "Toto"
    em.persist(race:RaceDB)

  }
}