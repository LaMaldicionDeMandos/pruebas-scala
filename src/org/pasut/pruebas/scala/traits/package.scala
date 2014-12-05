package org.pasut.pruebas.scala

/**
 * Los Traits son como interfaces, pero pueden implementar metodos
 * Created by marcelo on 05/12/14.
 */
package object traits {
  def main(args: Array[String]): Unit = {
    class Iter extends StringIterator(args(0)) with RichIterator
    val iter = new Iter
    iter foreach println
  }

  //Puedo esperar un objeto que sea de dos tipos a la vez
//  def cloneAndCompare(obj: Cloneable with Comparable[AnyRef]): Cloneable = {
//    val copia: AnyRef = obj.clone()
//    obj.compareTo(copia)
//    obj
//  }

//  Puedo usar herencia multiple de la siguiente manera
  abstract class AbsIterator {
    type T
    def hasNext: Boolean
    def next: T
  }

  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit) { while (hasNext) f(next) }
  }

  class StringIterator(s: String) extends AbsIterator {
    type T = Char
    private var i = 0
    def hasNext = i < s.length()
    def next = { val ch = s charAt i; i += 1; ch }
  }
}
