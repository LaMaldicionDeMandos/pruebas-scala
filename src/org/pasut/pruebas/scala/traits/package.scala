package org.pasut.pruebas.scala

/**
 * Los Traits son como interfaces, pero pueden implementar metodos
 * Created by marcelo on 05/12/14.
 */
package object traits {
  def main(args: Array[String]): Unit = {

  }

  //Puedo esperar un objeto que sea de dos tipos a la vez
//  def cloneAndCompare(obj: Cloneable with Comparable[AnyRef]): Cloneable = {
//    val copia: AnyRef = obj.clone()
//    obj.compareTo(copia)
//    obj
//  }
}
