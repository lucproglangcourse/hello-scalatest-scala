package edu.luc.cs.consoleapp

import scala.io.StdIn
import org.apache.commons.collections4.queue.CircularFifoQueue

object Main:

  val DefaultLastNWords = 10

  def main(args: Array[String]): Unit =

    // Argument validation
    val lastNWords = args match
      case Array() => DefaultLastNWords
      case Array(arg) =>
        try
          val n = arg.toInt
          if n < 1 then throw new NumberFormatException()
          n
        catch
          case _: NumberFormatException =>
            Console.err.println("argument should be a natural number")
            sys.exit(4)
      case _ =>
        Console.err.println("usage: ./target/universal/stage/bin/consoleapp [ last_n_words ]")
        sys.exit(2)

    val queue = new CircularFifoQueue[String](lastNWords)

    // Reading input and adding words to the queue
    scala.io.Source.stdin.getLines()
      .flatMap(_.split("""\W+""").nn)
      .foreach { word =>
        queue.add(word)
        println(queue)
        if Console.out.checkError() then sys.exit(1)
      }


