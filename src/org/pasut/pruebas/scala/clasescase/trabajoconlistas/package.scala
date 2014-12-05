package org.pasut.pruebas.scala.clasescase

/**
 * Created by marcelo on 05/12/14.
 */
package object trabajoconlistas {
  var lista: List[Int] = Nil
  def main(args: Array[String]): Unit = {
    addToList(1)
    addToList(2)
  }

  /**
   * Agrea x a la lista
   * @param x
   */
  def addToList(x:Int): Unit = {
    lista = x :: lista
    println(lista)
  }
}
