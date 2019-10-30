class ToTestOrNotToTestSpec extends org.scalatest.FunSuite {
  println("Running in test")

  test("3 Cubed.cube") {
    assert(ToTestOrNotToTest.cube(3) === 27)
    assert(ToTestOrNotToTest.cube(2) === 8)
    assert(ToTestOrNotToTest.cube(-2) === -8)
  }

  test("To Add.add") {
    assert(ToTestOrNotToTest.add(3,2) === 5)
  }

  test("To Multiply.multiply") {
    assert(ToTestOrNotToTest.multiply(5,2) === 10)
  }


}
