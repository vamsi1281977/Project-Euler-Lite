class ooa {
  ooa(a, b, c) {
    this.answer = this.solve(a, b, c)
  }

  def solve(a, b, c) {
    def d = 0
    for (def e = 1; e < a; e = e + 1) {
      def f = ((e % b) == 0)
      def g = ((e % c) == 0)
      def h = f || g
      d = d + (h ? e : 0)
    }
    return d
  }

  def answer

  static void main(args) {
    def a = new ooa(1000, 3, 5)
    println(a.answer)
  }
}
