/**
  * Created by peterjmyers on 3/13/18.
  */
import org.scalatest._

class ExampleTest extends FlatSpec {

  "Foo" should "have three letters" in {
    var foo = "foo"
    var length = foo.length
    assert(length == 3)
  }

  "Foobar" should "have six letters" in {
    var foobar = "foobar"
    var length = foobar.length
    assert(length == 6)
  }

}
