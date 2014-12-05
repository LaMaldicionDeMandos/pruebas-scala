package org.pasut.pruebas.scala

/**
 * Lo unico que hay que tener en cuenta es que las clases internas estan relacionadas a los objetos y no a la clase
 * o sea el tipo de una clase interna de una instancia es diferente al de otra instancia.
 * Se puede implementar clases internas como en java de la siguiente manera
 *
 * Created by marcelo on 05/12/14.
 */
package object clasesinternas {

}

/**
 * ClaseInterna por objeto
 */
abstract class Clase1 {
  class ClaseInterna {}
  var instancia: ClaseInterna
}

/**
 * ClaseInterna por clase
 */
abstract class Clase2 {
  class ClaseInterna {}
  var instancia: Clase2#ClaseInterna
}
