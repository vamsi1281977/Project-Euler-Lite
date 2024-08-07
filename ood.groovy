class ood {
  ood(a, b) {
    this.answer = this.solve(a, b)
  }

  def reverse_digits(a) {
    def b = 0
    while (a > 0) {
      def c = a % 10
      b = ((b * 10) + c)
      a = a.intdiv(10)
    }
    return b
  }

  def is_palindrome(a) {
    def b = this.reverse_digits(a)
    return a == b
  }

  def solve(a, b) {
    def c = 0
    for (def d = a; d < b; d = d + 1) {
      for (def e = d; e < b; e = e + 1) {
        def f = d * e
        def g = this.is_palindrome(f)
        c = (g ? Math.max(c, f) : c)
      }
    }
    return c
  }

  def answer

  static def main(args) {
    def a = new ood(100, 1000)
    println(a.answer)
  }
}
