package org.pasut.pruebas.scala.clases

/**
 * Created by marcelo on 05/12/14.
 */
class ClaseConConstructor(value: Int) {
  var x = value
  def printValue() = { //No es necesario decir que devuelve Unit
    println("Valor " + x)
  }
}
