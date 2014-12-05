package org.pasut.pruebas.scala

/**
 * Se usa para definir patrones en forma independiante a las clases Case
 * el metodo apply seria como un constructor, o sea, se llama al construirlo
 * Created by marcelo on 05/12/14.
 */
package object objetosextractores {
  def main(args: Array[String]): Unit = {
    val x = Twice(21)
    val y = Twice(10)

    x match { case Twice(n) => Console.println(n) }
    y match { case Twice(n) => Console.println(n) }
  }
}
