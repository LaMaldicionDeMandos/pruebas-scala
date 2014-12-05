package org.pasut.pruebas.scala.tiposabstractos

/**
 * Created by marcelo on 05/12/14.
 */
class TipoListaDeEnteros extends TipoSecuencia {
  type U = Int
  type T = List[U]
  override def printTypo():Unit = {
    println("Este es del tipo List[Int]")
  }

  override def printElement():Unit = {
    println("Element" + element)
  }

  val element: T = List(1, 2)
}
