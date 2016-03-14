package com.daggerok.scala.spring.calc

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.junit.JUnitRunner
import com.daggerok.scala.spring.calc.Calc._

@RunWith(classOf[JUnitRunner])
class ScalatestTest extends FunSuite with BeforeAndAfter {
  test("add") {
    assert(3 == add(1, 2))
  }
}
