package org.mmteam.creatta

import com.google.inject.AbstractModule
import com.google.inject.matcher.Matchers
import com.google.inject.Slf4jTypeListener
import com.google.inject.persist.jpa.JpaPersistModule
import java.util.Properties

class CreatTaModule extends AbstractModule {

  def configure: Unit = {
    install(new JpaPersistModule("creatta"))
    bindListener(Matchers.any, new Slf4jTypeListener)
  }
}