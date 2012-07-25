package spire.math

import language.experimental.macros
import language.implicitConversions

import scala.reflect.makro.Context
import scala.{specialized => spec}

import spire.macros.Macros

class Literals(s:StringContext) {
  def b():Byte = macro Macros.byte
  def h():Short = macro Macros.short
  def r():Rational = macro Macros.rational
}

object Literals {
  implicit def literals(s:StringContext) = new Literals(s)
}

class SiLiterals(s:StringContext) {
  def i():Int = macro Macros.siInt
  def j():Long = macro Macros.siLong
  def big():BigInt = macro Macros.siBigInt
}

object SiLiterals {
  implicit def siLiterals(s:StringContext) = new SiLiterals(s)
}
