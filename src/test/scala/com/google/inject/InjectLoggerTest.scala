package com.google.inject

import org.junit.Test
import org.mmteam.creatta.CreatTaModule


class InjectLoggerTest {

  @Test
  def testInject() = {
    val injector = Guice.createInjector(new CreatTaModule)
    val myClass = injector.getInstance(classOf[AClassWithALogger])
    myClass.log
  }

}