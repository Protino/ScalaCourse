object session {
  def fact(x: Int): Int = {
    if (x == 0) 1 else fact(x - 1) * x
  }

  fact(3)
}