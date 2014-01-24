package hellotest

// example straight from scalatest.org 

import scala.collection.mutable.Stack

import org.scalatest.FlatSpec
import org.scalatest.Suite
import org.scalatest.matchers.MustMatchers

class StackSpec extends FlatSpec with MustMatchers with Suite {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() must equal (2)
    stack.pop() must equal (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[String]
    evaluating { emptyStack.pop() } must produce[NoSuchElementException]
  }
}