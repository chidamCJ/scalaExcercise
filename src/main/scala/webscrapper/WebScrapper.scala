package webscrapper

/**
  * Imagine a webscrapper which connects to a URL and get the response. The respone is then
  * parsed to get only a required portion of the page.
  *
  *
  * implement logic for the method parseUrl. That's the first learning you are going to have
  */
class WebScrapper {
  private val symbol = "BEPL"
  private val url =
    s"""https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?symbol=$symbol"""

  def parseUrl() = {

  }

}

/**
  * This is the starting point of the application
  */
object WebScrapper extends App {}
