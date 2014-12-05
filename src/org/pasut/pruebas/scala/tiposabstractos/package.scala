package org.pasut.pruebas.scala

/**
 * Created by marcelo on 05/12/14.
 */
package object tiposabstractos {
  def main(args: Array[String]): Unit = {
    val tipoListaEntero = new TipoListaDeEnteros()
    val tipoListaString = new TipoListaDeStrings()
    val tipoEntero = new TipoEntero()
    val tipoString = new TipoString()
    tipoListaEntero.printTypo()
    tipoListaEntero.printElement()
    tipoListaString.printTypo()
    tipoListaString.printElement()
    tipoEntero.printTypo()
    tipoEntero.printElement()
    tipoString.printTypo()
    tipoString.printElement()
  }
}
