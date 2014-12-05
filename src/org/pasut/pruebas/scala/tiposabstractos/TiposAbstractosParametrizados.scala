package org.pasut.pruebas.scala.tiposabstractos

/**
 * Created by marcelo on 05/12/14.
 */
abstract class TiposAbstractosParametrizados[+T] {
    val element: T //El elemento del tipo T
    def printTypo():Unit
    def printElement():Unit = {
      println("Element " + element)
    }
}
