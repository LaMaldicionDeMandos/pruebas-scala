package org.pasut.pruebas.scala.tiposabstractos

/**
 * Created by marcelo on 05/12/14.
 */
class TipoString extends TiposAbstractos {
  type T = String
  def printTypo():Unit = {
    println("Este es del tipo String")
  }

  val element: T = "C"
}
