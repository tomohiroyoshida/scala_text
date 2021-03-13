object ErrorHandling {
  def main(args: Array[String]): Unit = {
    val o: Option[String] = Option("hoge")
    println(o.get, o.isEmpty, o.isDefined)

    val v1: Option[Int] = Some(3)
    // v1: Option[Int] = Some(value = 3)
    val v2: Option[Int] = Some(5)
    // v2: Option[Int] = Some(value = 5)
    val v3: Option[Int] = Some(7)
    // v3: Option[Int] = Some(value = 7)
    println(for {
        i1 <- v1
        i2 <- v2
        i3 <- v3 
    } yield i1 * i2 * i3)

    val v01: Either[String, Int] = Right(123)
    // v01: Either[String, Int] = Right(value = 123)
    val v02: Either[String, Int] = Left("left")
    // v02: Either[String, Int] = Left(value = "abc")
    // パターンマッチで値を取得できるのもOptionと同じです。
    v02 match {
      case Right(i) => println(i)
      case Left(s)  => println(s)
    }
  }
}
