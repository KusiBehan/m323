package main

object main extends App {

  case class Course(title: String, students: List[String])

  val courses = List(
    Course("M323", List("Peter", "Petra", "Paul", "Paula")),
    Course("M183", List("Paula", "Franz", "Franziska")),
    Course("M117", List("Paul", "Paula")),
    Course("M114", List("Petra", "Paul", "Paula")),
  )

  println(courses.map(_.students).filter(_.contains("Peter")).size) // 1
  println(courses.map(_.students).filter(_.contains("Petra")).size) // 2

  val peterCourses = courses.filter(_.students.contains("Peter")).map(_.title)

  val petraCourses = courses.filter(_.students.contains("Franziska"))
}
