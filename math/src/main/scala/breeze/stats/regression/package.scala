package stats

package object regression {
  trait RegressionResult[T,U] extends (T => U)
}
