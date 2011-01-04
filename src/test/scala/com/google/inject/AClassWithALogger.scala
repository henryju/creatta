package com.google.inject

import org.slf4j.Logger

class AClassWithALogger {

  @InjectLogger private val logger: Logger = null

  def log() = logger.debug("Test")
}