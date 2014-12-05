package org.pasut.pruebas.scala

/**
 * Created by marcelo on 11/7/14.
 */
abstract class Tree
case class Sum(l: Tree, r:Tree) extends Tree;
case class Product(l: Tree, r:Tree) extends Tree;
case class Const(v: Int) extends Tree;
case class Var(v: String) extends Tree;

object EjemploExpression {
  type Enviroment = String => Int;
  def main(args: Array[String]): Unit = {

    //a + b*c
    val expression:Tree = Sum(Var("a"), Product(Var("b"), Var("c")));

    val env: Enviroment = {case "a" => 2 case "b" => 3 case "c" => 5};
    println("2 + 3*5 = "  + eval(expression, env));

    val env1: Enviroment = {case "a" => 1 case "b" => 2 case "c" => 5};
    println("1 + 2*5 = "  + eval(expression, env1));

    println("null = "  + eval(null, env1));
  }
  def eval(tree:Tree, env:Enviroment): Int = tree match {
    case null => 0;
    case Sum(l, r) => eval(l, env) + eval(r,env);
    case Product(l, r) => eval(l, env) * eval(r,env);
    case Const(v) => v;
    case Var(n) => env(n);
    //Este patchea con cualquier cosa
    case _ => 0;
  }
}




