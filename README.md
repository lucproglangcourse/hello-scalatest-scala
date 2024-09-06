# hello-scalatest-scala

Small project to get started with Scala and ScalaTest.

## Running the main program

```
$ sbt run
```

## Running the tests

```
$ sbt test
```

or

```
$ sbt coverage test coverageReport
```

to see the code coverage percentages of your test suite.

## Running successive tasks with sbt

To speed up the edit-compile-test/run cycle, you can start sbt without arguments

```
$ sbt
```

and repeatedly run individual tasks

```
sbt> run
```

```
sbt> test
```
