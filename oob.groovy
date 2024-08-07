class oob {
  oob(a) {
    this.answer = this.solve(a)
  }

  def solve(a) {
    def b = 0
    def c = 1
    def d = 0
    while (b <= a) {
      def e = ((b % 2) == 0)
      d = d + (e ? b : 0)
      def f = b + c
      b = c
      c = f
    }
    return d
  }
  
  def answer
  
  static def main(args) {
    def a = new oob(4000000)
    println(a.answer)
  }
}
