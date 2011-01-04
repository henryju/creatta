package org.mmteam.creatta

import swing._
import liquibase.Liquibase
import liquibase.database.DatabaseFactory
import liquibase.resource.ClassLoaderResourceAccessor
import org.apache.commons.dbcp.BasicDataSource
import java.sql.Connection
import org.apache.commons.configuration.{Configuration, PropertiesConfiguration, SystemConfiguration, CompositeConfiguration}
import liquibase.integration.commandline.CommandLineUtils
import liquibase.database.jvm.JdbcConnection
import com.google.inject.Guice

object App extends SwingApplication {

  override def startup(args: Array[String]) {
    //Load configuration
    val config = loadConfig
    //Prepare db
    prepareDb(config)
    //Load guice
    val injector = Guice.createInjector(new CreatTaModule)
    //Start main
    val mainController = injector.getInstance(classOf[org.mmteam.creatta.controller.MainController])
    mainController.exec()
  }

  def loadConfig: Configuration = {
    val config = new CompositeConfiguration
    config.addConfiguration(new SystemConfiguration)
    config.addConfiguration(new PropertiesConfiguration("creatta.properties"))
    return config
  }

  def prepareDb(config: Configuration): Unit = {
    //Create connection
    var ds: BasicDataSource = null
    try {
      ds = new BasicDataSource()
      ds.setUsername(config.getString("db.username"))
      ds.setPassword(config.getString("db.password"));
      ds.setDriverClassName(config.getString("db.driver"));
      ds.setUrl(config.getString("db.url"));
      var con: Connection = null
      try {
        con = ds.getConnection
        //Init DB using liquibase
        val database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(con))
        val liquibase = new Liquibase("liquibase.xml", new ClassLoaderResourceAccessor(), database)
        liquibase.update("")
      }

      finally {
        if (con != null) {
          con.close
        }
      }
    }
    finally {
      if (ds != null) {
        ds.close
      }
    }
  }

}
