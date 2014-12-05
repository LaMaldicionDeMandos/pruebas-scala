package org.pasut.pruebas.scala.tiposabstractos

/**
 * Created by marcelo on 05/12/14.
 */
class TipoEntero extends TiposAbstractos {
  type T = Int
  def printTypo():Unit = {
    println("Este es del tipo Int")
  }

  val element: T = 3
}
