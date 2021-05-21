import scala.collection.immutable.List

object ExamenBigData {

  def main(args: Array[String]): Unit = {
    listeValeurs (List("Julien", "Paul", "Jean", "rac", "trec", "joel", "ed", "chris", "maurice"))

    list_double ()

  }

  def listeValeurs (listText : List[String]) : List[String] = {
    val result : List[String] = listText.filter(l => l.endsWith("n"))
    return result
  }

  def list_double () : Unit = {

    val liste : List[(String, String)] = List(("ecommercemag.fr", ""), ("https://www.journalducm.com/contact/" , "Payant"),
      ("https://www.zatsaz.com/", ""), ("https://www.larevenu.com/", ""), ("https://www.cadre-dirigfdeant-magazine.com/", "Payant"),
      ("https://www.silicon.fr/nous-contacter/", "Payant"), ("https://www.itespresso.fr", ""), ("https://www.industrie-mag.com/article4.html", "invité"),
      ("https://www.sjesuisundev.com/article-invite/",  "invité"), ("https://www.numerama.com", ""))

    val liste2 : List[(String, String)] = liste.map(l => l)
    liste2.foreach(l => println(l))

  }

}
