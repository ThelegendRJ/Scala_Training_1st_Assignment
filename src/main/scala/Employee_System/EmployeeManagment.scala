package Employee_System

trait EmployeeDetails {
  val empid: String
  def firstName: String
  def lastName: String
  def salary: Int
  def attendance(empid: String): String
  def attendance(empid:String, st: String, et: String): String
}

class Consultant(empID:String, fName: String, lName:String, income:Int) extends EmployeeDetails {
  private val prefix = "CONS"
  val empid: String = prefix + empID
  def firstName: String = fName

  def lastName: String = lName
  def salary: Int = income
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+" In Time- 09:45 AM"+"Out Time- 06:45 PM"+ "Employee Name" + fullName + "Salary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + " In time:  " + st + "Out Time " + et+ "Employee Name" + fullName + "Salary "+salary
  }
}

class Manager(empId:String, fName: String, lName:String, income:Int) extends EmployeeDetails {
  private val prefix = "MANA"
  val empid: String = prefix + empId
  def firstName: String = fName
  def lastName: String = lName
  def salary: Int = income
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+"In Time- 09:45 AM"+"Out Time- 06:45 PM"+ "Employee Name" + fullName + "Salary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + "In time:  " + st + " Out Time " + et+ " Employee Name" + fullName + "Salary "+salary
  }
}

class SrManager(empID:String, fName: String, lName:String, income:Int) extends EmployeeDetails {
  private val prefix = "SRMA"
  val empid: String = prefix + empID
  def firstName: String = fName
  def lastName: String = lName
  def salary: Int = income
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+" In Time- 09:45 AM"+"Out Time- 06:45 PM"+ "Employee Name" + fullName + "Salary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + " In time:  " + st + " Out Time " + et+ "Employee Name" + fullName + "Salary "+salary
  }
}

class President(empID:String, fName: String, lName:String, income:Int) extends EmployeeDetails {
  private val prefix = "POTC"
  val empid: String = prefix + empID
  def firstName: String = fName
  def lastName: String = lName
  def salary: Int = income
  var fullName: String = firstName +" "+ lastName
  def attendance(e:String): String = {
    "Employee-ID "+empid+"In Time- 09:45 AM"+"Out Time- 06:45 PM"+ "Employee Name" + fullName + "Salary "+ salary
  }
  def attendance(emid: String, st: String, et: String): String = {
    "Employee-ID "+empid + "In time:  " + st + "Out Time " + et+ "Employee Name" + fullName + "Salary "+salary
  }
}
