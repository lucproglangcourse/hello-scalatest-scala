# Example project to illustrate the use of ScalaTest

## The Test Information
Under the src/test/scala/hellotest directory, StackTest.scala exists. Two test cases are created:
 * The first test creates a Stack object, pushes two elements, and then pops them off.  The test asserts the second
element pushed is the first to be popped, then the first element is popped afterward.
 * The second test creates a new Stack object, and it does not push any elements onto the Stack. Next, it attempts to
pop the top item from the Stack, and expects a _NoSuchElementExists_ exception

## More about ScalaTest
The tests will look different to developers who are familiar with JUnit style testing only. ScalaTest allows for
developers to write natural sentences to create tests. For example, one can tell the system that a specific
datatype should have a particular size of elements, by something like:
"An empty Set" should "have size 0"

For more information, check out the [official documentation](http://www.scalatest.org/user_guide/selecting_a_style)

