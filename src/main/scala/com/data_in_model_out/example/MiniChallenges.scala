package com.data_in_model_out.example


import java.io._

import scala.io.Source

/**
  * Created by peterjmyers on 3/10/18.
  */
object MiniChallenges extends App{
  var x1 = 1
  println(x1)
  var x2 = List(1,2,3)
  x2.foreach(println)
  var x3 = Set(1,2,3)
  x3.foreach(println)
  var x4 = Map(1 -> "one",2 -> "two",3 -> "three")
  x4.foreach(println)
  var x5 = (1, 2, 3)
  println(x5._1, x5._2, x5._3)
  println("Filters")
  x2.filter(x => x < 3).foreach(println)
  x4.filterKeys(k => k < 3).foreach(println)
  println("Maps")
  x2.map(x => x * 3).foreach(println)
  x4.mapValues(v => v * 3).foreach(println)
  println("Diff one")
  var x6 = List(1,2,3,4)
  x6.diff(x2).foreach(println)
  println("Diff two")
  x2.diff(x6).foreach(println)
  println("Diffs done")

  println("Control statements")
  var x7 = 0
  if (x7 < 3) {
    println("x7 is less than 3")
  } else {
    println("x7 is not less than 3")
  }

  println("while loop")
  var x8 = 0
  while (x8 < 10) {
    println(x8)
    x8 = x8 + 1
  }

  println("for loop")
  for (i <- 1 to 5) {
    println(i)
  }

  println("breaks")
  import util.control.Breaks._ // Place imports at the top of the page
  breakable {
    for (i <- 1 to 10) {
      if (i == 7)
        break
      println(i)
    }
  }

  println("match")
  var x9 = "1"
  var x10 = x9 match { case "1" => 2
    case _ => 0
  }
  println(x10)

  // read from file

  val lines = Source.fromFile("src/main/scala/HelloWorld.scala").getLines().toList
  for (line <- lines) { println(line) }

  // write to file

  val pw = new PrintWriter(new File("hello.txt" )); pw.write("Hello, world"); pw.close

  def foo(a: Int): Int = {
    a + 1
  }

  println(s"${foo(5)}")

  case class Dog(name: String)
  var dog = Dog("Ralf")
  println(dog)

  // inheritance

  abstract class Animal {
    def name: String
    def age: Int
    def getName(): String =  {
      return name
    }
  }

  case class Cat(val name: String, val age: Int)
    extends Animal

  val cat = Cat("Snickers", 3)
  println(cat)
  println(cat.getName())
  println(cat.age)

  // trait

  trait Bar {
    def foo(): Unit = println("foo")
  }

  class Example extends Bar {
    private var a = "a"
    var b = "b"
  }

  var e = new Example()
  e.foo()
  println(e.b) // e.a is hidden

  var foobar: Option[String] = Option("a")
  println(foobar)
  foobar = None
  println(foobar)

  var expression = "^(.*) ".r
  var string = "abcdef ghijklm"
  for (s <- expression findAllIn string)
    println(s)




}
