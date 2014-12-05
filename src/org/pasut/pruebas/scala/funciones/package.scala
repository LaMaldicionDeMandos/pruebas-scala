package org.pasut.pruebas.scala

/**
 * Una funcion puede tener funciones anidadas.
 * Created by marcelo on 05/12/14.
 */
package object funciones {
  def main(args: Array[String]): Unit = {
    println(filter(List(1,2,3,4,5), 3))
  }
  def filter(xs: List[Int], threshold: Int) = {
    def process(ys: List[Int]): List[Int] =
      if (ys.isEmpty) ys
      else if (ys.head < threshold) ys.head :: process(ys.tail)
      else process(ys.tail)
    process(xs)
  }
}
