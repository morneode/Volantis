object ToTestOrNotToTest  {
  println("Running in main:" + codeName)

  def codeName = this.getClass.getSimpleName
//  def codeName = this.getClass
  println("setting z")
  val z:Int = 1

  def b = {
    println("something asked for b")
    2
  }
  println("setting a ")
  def a :Int = cube(z)
  println("setting c ")
  val c :Int = cube(b)

  println("adding")
  val d = add(b,b)
  val e = add(z,z)
  val f = add(cube(1),add(1,1))
  println("f should be 3 but it is:" + f.toString)

  def cube(x: Int) = {
    x * x * x
  }

  def add(x: Int, y: Int) = {
    x + y
  }

  def multiply(x: Int, y: Int) = {
    x * y
  }
}