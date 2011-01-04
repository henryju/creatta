package org.mmteam.creatta.config

import org.mmteam.creatta.App
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers._

/**
 * User: Julien HENRY
 * Date: 22/12/10
 * Time: 11:59
 */

class ConfigTest {

  @Test
  def loadConfigTest {
     val config = App.loadConfig
     assertThat(config.getString("db.username"), is("sa"))
  }
}