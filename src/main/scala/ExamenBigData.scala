import scala.collection.immutable.List

object ExamenBigData {

  def main(args: Array[String]): Unit = {
    listeValeurs (List("Julien", "Paul", "Jean", "rac", "trec", "joel", "ed", "chris", "maurice"))

  }

  def listeValeurs (listText : List[String]) : List[String] = {
    val result : List[String] = listText.filter(l => l.endsWith("n"))
    return result
  }

  def list_double () : Unit = {

    val liste : List[List[String]] = List(List("ecommercemag.fr", ""), List("https://www.journalducm.com/contact/" , "Payant"),
      List("https://www.zatsaz.com/", ""), List("https://www.larevenu.com/", ""), List("https://www.cadre-dirigfdeant-magazine.com/", "Payant"),
      List("https://www.silicon.fr/nous-contacter/", "Payant"), List ("https://www.itespresso.fr", ""), List ("https://www.industrie-mag.com/article4.html", "invité"),
      List ("https://www.sjesuisundev.com/article-invite/",  "invité"), List ("https://www.numerama.com", ""))

  }

}
