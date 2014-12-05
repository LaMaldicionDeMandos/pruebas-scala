package org.pasut.pruebas.scala.tiposabstractos

/**
 * Created by marcelo on 05/12/14.
 */
class TipoListaDeStrings extends TipoSecuencia {
  type U = String
  type T = List[U]
  def printTypo():Unit = {
    println("Este es del tipo List[Strings]")
  }

  override val element: T = List("a", "b")
}
