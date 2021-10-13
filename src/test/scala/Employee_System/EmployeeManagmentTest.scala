package Employee_System
import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps

class EmployeeManagmentTest extends AnyFlatSpec {

  //Consultant Class
  //Case 1
  "Consultant" should "give" in{
    val test = new Consultant("1588","Ronak","Janawa", 15000)
    val test1 = new Consultant("1111","Naruto","Uzumaki",120000)
    val t1 = test.attendance("1588")
    val t2 = test1.attendance("1111","09:50 AM","06:50 PM")
    assert(test.empid=="CONS1588")
    assert(test.fullName=="Ronak Janawa")
    assert(test.salary==15000)
    assert(test.attendance("1588")==t1)
    println(test.attendance("1588"))
    assert(test1.attendance("1111","09:50 AM","06:50 PM")==t2)
    println(test1.attendance("1111","09:50 AM","06:50 PM"))
  }
  //Manager Class
  //Case 2
  "Manager" should "give" in{
    val test = new Manager("1586","Rakhi","Pareek", 100000)
    val test1 = new Manager("1500","Gurpreet","Kaur",200000)
    val t1 = test.attendance("1586")
    val t2 = test1.attendance("1500","09:52 AM","06:52 PM")
    assert(test.empid=="MANA1586")
    assert(test.fullName=="Rakhi Pareek")
    assert(test.salary==150000)
    assert(test.attendance("1586")==t1)
    println(test.attendance("1586"))
    assert(test1.attendance("1500","09:52 AM","06:52 PM")==t2)
    println(test1.attendance("1500","09:52 AM","06:52 PM"))
  }
  //Senior Manager Class
  //Case 3
  "Sr Manager" should "give" in{
    val test = new SrManager("1000","Prabhat","Kashyap", 1000000)
    val test1 = new SrManager("1001","Shivraj","Kumar",120000)
    val t1 = test.attendance("1000")
    val t2 = test1.attendance("1001","09:47 AM","07:00 PM")
    assert(test.empid=="SRMA1000")
    assert(test.fullName=="Prabhat Kashyap")
    assert(test.salary==1000000)
    assert(test.attendance("1000")==t1)
    println(test.attendance("1000"))
    assert(test1.attendance("1001","09:47 AM","07:00 PM")==t2)
    println(test1.attendance("1001","09:47 AM","07:00 PM"))
  }
  // President Class
  //Case 4
  "President" should "give" in{
    val test = new President("0001","Vikas","Hazarati", 100000000)
    val test1 = new President("0002","Bhavya","Agraval",10000000)
    val t1 = test.attendance("0001")
    val t2 = test1.attendance("0002","09:54 AM","07:05 PM")
    assert(test.empid=="POTC0001")
    assert(test.fullName=="Vikas Hazarati")
    assert(test.salary==100000000)
    assert(test.attendance("0001")==t1)
    println(test.attendance("0001"))
    assert(test1.attendance("0002","09:54 AM","07:05 PM")==t2)
    println(test1.attendance("0002","09:54 AM","07:05 PM"))
  }



}
