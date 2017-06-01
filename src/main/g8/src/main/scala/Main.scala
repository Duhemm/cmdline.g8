package example

import java.io.File

/**
 * Represents that config options given to the app
 * @param all Set to true to display entries whose name start with '.'
 */
case class Config(all: Boolean)

object Main {
  def main(args: Array[String]): Unit =
    parser.parse(args, Config(all = false)) match {
      case None => // Parsing failed, scopt will show an error
        ()
      case Some(config) =>
        showFiles(config)
    }

  private def showFiles(config: Config): Unit = {
    val base = new File(".")
    val children =
      if (config.all) base.listFiles
      else base.listFiles.filterNot(_.isHidden)
    children.foreach(file => println(file.getName))
  }

  private val parser = new scopt.OptionParser[Config]("ls") {

    head("ls on Native", "0.x")

    opt[Unit]('a', "all")
      .action((b, c) => c.copy(all = true))
      .text("do not ignore entries starting with .")
  }
}
