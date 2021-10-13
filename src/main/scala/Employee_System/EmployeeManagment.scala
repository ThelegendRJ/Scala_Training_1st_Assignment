package Employee_System

trait EmployeeDetails {
  val empid: String
  def firstName: String
  def lastName: String
  def salary: Int
  def attendance(empid: String): String
  def attendance(empid:String, st: String, et: String): String
}

class Consultant(id:String, fn: String, ln:String, sl:Int) extends EmployeeDetails {
  private val prefix = "CONS"
  val empid: String = prefix + id
  def firstName: String = fn
  def lastName: String = ln
  def salary: Int = sl
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+" \nIn Time- 09:45 AM"+"\nOut Time- 06:45 PM"+ "\nEmployee Name" + fullName + "\nSalary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + " \nIn time:  " + st + " \nOut Time " + et+ "\n Employee Name" + fullName + "\nSalary "+salary
  }
}

class Manager(id:String, fn: String, ln:String, sl:Int) extends EmployeeDetails {
  private val prefix = "MANA"
  val empid: String = prefix + id
  def firstName: String = fn
  def lastName: String = ln
  def salary: Int = sl
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+" \nIn Time- 09:45 AM"+"\nOut Time- 06:45 PM"+ "\nEmployee Name" + fullName + "\nSalary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + " \nIn time:  " + st + " \nOut Time " + et+ "\n Employee Name" + fullName + "\nSalary "+salary
  }
}

class SrManager(id:String, fn: String, ln:String, sl:Int) extends EmployeeDetails {
  private val prefix = "SRMA"
  val empid: String = prefix + id
  def firstName: String = fn
  def lastName: String = ln
  def salary: Int = sl
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+" \nIn Time- 09:45 AM"+"\nOut Time- 06:45 PM"+ "\nEmployee Name" + fullName + "\nSalary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + " \nIn time:  " + st + " \nOut Time " + et+ "\n Employee Name" + fullName + "\nSalary "+salary
  }
}

class President(id:String, fn: String, ln:String, sl:Int) extends EmployeeDetails {
  private val prefix = "POTC"
  val empid: String = prefix + id
  def firstName: String = fn
  def lastName: String = ln
  def salary: Int = sl
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+" \nIn Time- 09:45 AM"+"\nOut Time- 06:45 PM"+ "\nEmployee Name" + fullName + "\nSalary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + " \nIn time:  " + st + " \nOut Time " + et+ "\n Employee Name" + fullName + "\nSalary "+salary
  }
}
