package org.mmteam.creatta.persist

import org.mmteam.creatta.test.util.GuiceTestRunner
import org.mmteam.creatta.CreatTaModule

/**
 * User: Julien HENRY
 * Date: 21/12/10
 * Time: 14:54
 */

class CreatTaGuiceTestRunner(classToRun: Class[AnyRef]) extends GuiceTestRunner(classToRun, new CreatTaModule)