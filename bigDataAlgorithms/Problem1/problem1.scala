import scala.io.Source
import java.io.PrintWriter

val stopWords = "bigDataAlgorithms/Problem1/stopwords_en.txt"
val file = "bigDataAlgorithms/Problem1/witcher.txt"

var source = Source.fromFile(file, "UTF-8").mkString
var stop = Source.fromFile(stopWords).getLines.toList
var words = source.split("\\s")
var filteredWords = words.filterNot(word => stop.contains(word.toLowerCase())).toList
val pairs = (x:String) => List(x, 1)
var paired = filteredWords.map(pairs)
var grouped = filteredWords.groupBy(x=>x)
var mapped = grouped.mapValues(x=>x.length)
var sorted = mapped.toSeq.sortWith((x,y)=> x._2 > y._2)
println(sorted)

val writer = new PrintWriter("Result.txt", "UTF-8")
writer.println(sorted)
sorted.foreach(writer.println)
writer.close()