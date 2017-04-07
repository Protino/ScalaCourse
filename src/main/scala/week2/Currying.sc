def product(a: Int, b: Int): Int = a * b

def sum(a: Int, b: Int): Int = a + b


def productF(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 1
  else f(a) * productF(f)(a + 1, b)

productF(x => x + x)(1, 2)

def factorial(a: Int) = productF(x => x)(1, a)

factorial(5)

def general(f: Int => Int, op: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if (a > b) zero
  else op(f(a), general(f, op, zero)(a + 1, b))

general(x => x + x, product, 1)(1, 2)

