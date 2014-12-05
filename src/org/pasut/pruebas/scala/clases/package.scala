package org.pasut.pruebas.scala

/**
 * Created by marcelo on 05/12/14.
 */
package object clases {
  def main(args: Array[String]): Unit = {
    var a:ClaseConConstructor = new ClaseConConstructor(5)
    a.printValue()
  }
}
