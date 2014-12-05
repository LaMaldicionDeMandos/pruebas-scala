package org.pasut.pruebas.scala.tiposabstractos

/**
 * Created by marcelo on 05/12/14.
 */
abstract class TipoSecuencia extends TiposAbstractos{
  type U
  type T <: Seq[U] //T ahora es cualquier cosa que extienda Seq

}
