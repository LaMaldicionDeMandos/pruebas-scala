package org.pasut.pruebas.scala.tiposabstractos

/**
 * Created by marcelo on 05/12/14.
 */
abstract class TiposAbstractos {
  type T //Esto es el tipo abstracto
  val element: T //El elemento del tipo T
  def printTypo():Unit
  def printElement():Unit = {
    println("Element " + element)
  }
}
