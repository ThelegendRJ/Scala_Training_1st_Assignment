package Employee_System
import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps

class EmployeeManagmentTest extends AnyFlatSpec {

  //Consultant class
  //Case 1
  "Consultant" should "give" in {

    val test1 = new Consultant("1588", "Ronak", "Janawa", 15000)
    assert(test1 == "Emplym")


  }

}
