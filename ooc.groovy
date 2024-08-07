class ooc {
  ooc(a) {
    this.answer = this.solve(a)
  }

  def solve(a) {
    return this.lgpf(a)
  }

  def lgpf(a) {
    if (a < 2) {
      throw new Exception('lgpf(a) is not defined for a < 2')
    } else if (a < 4) {
      return a
    } else {
      def b = 2
      def c = 4
      def d = 0
      while (c <= a) {
        def e = ((a % b) == 0)
        if (e) {
          d = b
          a = a.intdiv(b)
        } else {
          b = b + ((b == 2) ? 1 : 2)
          c = b * b
        }
      }
      return Math.max(a, d)
    }
  }

  def answer

  static def print_lgpf(a) {
    def b = new ooc(a)
    println("lgpf(${a}) = ${b.answer}")
  }

  static def main(args) {
    print_lgpf(1319513195)
    print_lgpf(1319513196)
  }
}
