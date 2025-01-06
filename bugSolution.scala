```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  //Solution 1: Check the index before accessing
  if (list.size > 3 && list.isDefinedAt(3)) {
    println(list(3))
  } else {
    println("Index out of bounds")
  }

  //Solution 2: Use getOrElse to provide a default value
  println(list.getOrElse(3, -1)) //prints -1 if index is out of bounds

  //Solution 3: Use a try-catch block
  try {
    println(list(3))
  } catch {
    case e: IndexOutOfBoundsException => println("Index out of bounds")
  }
}
```