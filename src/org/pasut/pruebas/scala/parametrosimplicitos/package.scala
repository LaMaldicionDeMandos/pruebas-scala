package org.pasut.pruebas.scala

/**
 * Tenes que definir un default para tomar como parametro implicito
 * Created by marcelo on 05/12/14.
 */
package object parametrosimplicitos {
  implicit val x:Int = 0
  def main(args: Array[String]): Unit = {
    println(suma(List()))
    println(suma(List(1,2,3,4,5)))
    println(suma(List(1,2,3,4))(5))
  }

  def suma(xs:List[Int])(implicit sum:Int):Int = {
    if (xs.isEmpty)
      sum
    else
      suma(xs.tail)(sum + xs.head)
  }
}
