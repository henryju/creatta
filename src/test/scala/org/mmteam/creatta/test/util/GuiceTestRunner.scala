package org.mmteam.creatta.test.util

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Module
import org.junit.runners.BlockJUnit4ClassRunner

import java.util.List
import com.google.inject.persist.PersistService
;

/**
 * User: Julien HENRY
 * Date: 21/12/10
 * Time: 15:00
 */
class GuiceTestRunner(classToRun: Class[AnyRef], modules: Module*) extends BlockJUnit4ClassRunner(classToRun) {
  private val injector = Guice.createInjector(java.util.Arrays.asList(modules: _*))
  injector.getInstance(classOf[PersistService]).start

  override def createTest(): java.lang.Object = {
    return injector.getInstance(getTestClass().getJavaClass()).asInstanceOf[java.lang.Object]
  }

  override def validateZeroArgConstructor(errors: List[Throwable]) {
    // Guice can inject constructors with parameters so we don't want this method to trigger an error
  }

  /**
   * Returns the Guice injector.
   *
   * @return the Guice injector
   */
  def getInjector(): Injector = {
    return injector
  }
}
