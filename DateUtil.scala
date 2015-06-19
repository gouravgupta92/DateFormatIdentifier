/**
 * @author Gourav_Gupta
 */
import java.text.SimpleDateFormat
import java.util.Date

object DateUtil {
  def main(args: Array[String]) {

    var testDateArray = Array("04-12-1992", "15/04/1992", "04/12/1929", "04-Jan-1992", "Jan-04-1992")

    var dd_MM_yyyy = Array("04-12-1992 00:00:00", "04-12-1992", "13-02-1992", "04-04-1992", "04-12-1992")
    var MM_dd_yyyy = Array("12/04/1992", "12/15/1992", "12/04/1992", "10/04/1992", "12/04/1992")
    var dd_MMM_yyyy = Array("04-Jan-1992", "04-Jan-1992", "04-Jan-1992", "04-Jan-1992")
    var MMM_dd_yyyy = Array("Jan-04-1992", "Jan-04-1992", "Jan-04-1992", "Jan-04-1992")

    println((10.50).toInt)

    // println(getDateFormat(MM_dd_yyyy))
    //var dd_MM_yyyy = Array("04-12-1992", "04-12-1992", "04-12-1992", "04-12-1992", "04-12-1992")
    //var dd_MM_yyyy = Array("04-12-1992", "04-12-1992", "04-12-1992", "04-12-1992", "04-12-1992")
    //var dd_MM_yyyy = Array("04-12-1992", "04-12-1992", "04-12-1992", "04-12-1992", "04-12-1992")

    /* var strDate = "04-15-1992"

    var sdf = new SimpleDateFormat("d-M-yy")
    sdf.setLenient(false);
    var d = sdf.parse("06-12-2013 00:0:0")

    sdf.applyPattern("dd/MMM/yyyy")
    var newString = sdf.format(d)
    println(newString)*/

    /*var formats = Array(new SimpleDateFormat("dd-MM-yyyy"),
      new SimpleDateFormat("dd-MMM-yyyy"),
      new SimpleDateFormat("dd-MMMM-yyyy"),
      new SimpleDateFormat("dd/MM/yyyy"),
      new SimpleDateFormat("dd/MMM/yyyy"),
      new SimpleDateFormat("dd/MMMM/yyyy"),
      new SimpleDateFormat("MM-dd-yyyy"),
      new SimpleDateFormat("MMM-dd-yyyy"),
      new SimpleDateFormat("MMM-dd-yyyy"),
      new SimpleDateFormat("MM/dd/yyyy"),
      new SimpleDateFormat("MMM/dd/yyyy"),
      new SimpleDateFormat("MMMM/dd/yyyy"),
      new SimpleDateFormat("yyyy-MM-dd"),
      new SimpleDateFormat("yyyy-MMM-dd"),
      new SimpleDateFormat("yyyy-MMMM-dd"),
      new SimpleDateFormat("yyyy/MM/dd"),
      new SimpleDateFormat("yyyy/MMM/dd"),
      new SimpleDateFormat("yyyy/MMMM/dd"))

    var parsedDate: Date = null
    for (i <- 0 until formats.length) {
      try {
        parsedDate = formats(i).parse(strDate)
        println(formats(i).toPattern())
        // exit(0)
      } catch {
        case e: Exception => { None }
      }
    }*/

  }

  def getDateFormat(dateArray: Array[String]): String = {

    var formats = Array(new SimpleDateFormat("dd/MM/yy"),
      new SimpleDateFormat("MM/dd/yy"),
      new SimpleDateFormat("dd/MMM/yy"),
      new SimpleDateFormat("MMM/dd/yy"),
      new SimpleDateFormat("yy/MM/dd"),
      new SimpleDateFormat("yy/MMM/dd"),
      new SimpleDateFormat("dd-MM-yy"),
      new SimpleDateFormat("MM-dd-yy"),
      new SimpleDateFormat("dd-MMM-yy"),
      new SimpleDateFormat("MMM-dd-yy"),
      new SimpleDateFormat("yy-MM-dd"),
      new SimpleDateFormat("yy-MMM-dd"))

    formats.foreach(sdformat => {
      sdformat.setLenient(false)
      try {
        var parsedDate = dateArray.map(dateval => {
          sdformat.parse(dateval)
        })
        parsedDate.size
        return sdformat.toPattern()
      } catch {
        case e: Exception => None
      }
    })
    return "String"
  }

}





  
