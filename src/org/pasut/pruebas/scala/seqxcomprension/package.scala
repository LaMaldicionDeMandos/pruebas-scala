package org.pasut.pruebas.scala

import scala.collection.immutable.IndexedSeq

/**
 * Secuencias, como por ejemplo rangos, en el for if se devuelve yield y este se acumula en otra lista.
 * Luego uso esa lista.
 * Cualquier tipo de datos que soporte las operaciones filterWith, map, y flatMap (con los tipos apropiados) puede ser usado en la comprensión de secuencias.
 * Created by marcelo on 05/12/14.
 */
package object seqxcomprension {
  def main(args: Array[String]): Unit = {
    println(pares(1, 20))
  }

  def pares(desde:Int, hasta:Int):IndexedSeq[Int] =
    for (item <- desde until hasta if item % 2 == 0) yield item
}
