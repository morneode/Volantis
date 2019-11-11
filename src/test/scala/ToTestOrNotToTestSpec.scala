class ToTestOrNotToTestSpec extends org.scalatest.FunSuite {
  test("Testing the cube function") {
    assert(ToTestOrNotToTest.cube(3) === 27)
    assert(ToTestOrNotToTest.cube(2) === 8)
    assert(ToTestOrNotToTest.cube(-2) === -8)
  }
  test("Testing the add function") {
    assert(ToTestOrNotToTest.add(5,3) === 8)
  }
  test("Testing the multiply function") {
    assert(ToTestOrNotToTest.multiply(3,9) === 27)
  }
}
