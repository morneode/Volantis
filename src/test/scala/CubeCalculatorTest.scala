class CubeCalculatorTest extends org.scalatest.FunSuite {
  println("running in test")
  test("3 cubed = 27") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("2 cubed = 8") {
    assert(CubeCalculator.cube(2) === 8)
  }

}
