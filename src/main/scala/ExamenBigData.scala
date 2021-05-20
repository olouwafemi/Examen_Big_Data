import scala.collection.immutable.List

object ExamenBigData {

  def main(args: Array[String]): Unit = {

  }

  def listeValeurs (listText : List[String]) : List[String] = {
    val result : List[String] = listText.filter(l => l.endsWith("n"))
    return result
  }

}
