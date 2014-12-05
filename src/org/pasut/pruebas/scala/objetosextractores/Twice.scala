package org.pasut.pruebas.scala.objetosextractores

/**
 * Si el valor es par, devuelve la mitad, de lo contrario devuelve el mismo
 * Created by marcelo on 05/12/14.
 */
object Twice {
  def apply(x: Int): Int = x
  def unapply(z:Int): Option[Int] = if (z%2 == 0) Some(z/2) else Some(z)
}
