# Project-Euler-Lite
Answers to lite version of Project Euler problems.

This page contains answers to Project Euler problems for parameters easier than the ones at Project Euler, hence the lite. For answers to Project Euler problems, please visit: https://github.com/luckytoilet/projecteuler-solutions.

1. S(n): sum of all multiples of 3 or 5 less than n. S(1000) = 233168.
2. S(n): sum of even fibonacci numbers not greater than n. S(4000000) = 4613732.
3. lgpf(n): largest prime factor of n. lgpf(600851475143) = 6857.
4. The largest palindromic number that is a product of two three digit numbers is 906609.
5. lcm(1,2,3,...,20) = 232792560.
6. a(n): sum of the first n positive integers = (n * (n + 1)) / 2, b(n): sum of the squares of the first n positive integers = (n * (n + 1) * (n + n + 1)) / 6, (a(100) ** 2) - b(100) = 25164150.
7. This problem can be solved using a variation of Lucy Hedgehog's algorithm for Problem 10. Prime(10001) = 104743.
8. Largest product of 13 contiguous digits is 23514624000.
9. The Pythagorean triple with a + b + c = p = 1000 is (200, 375, 425) = 25 * (8, 15, 17). abc = 31875000.
10. Lucy Hedgehog has the best answer to this problem. The Lucy Hedgehog algorithm can be modified to compute Prime_Pi(x). The Prime_Pi(x) can be used to solve problem 7. S(x): sum of all primes not greater than x, S(2000000) = 142913828922.
11. We have to visit the following points: (x, y), (x + dx, y + dy), (x + dx + dx, y + dy + dy), (x + dx + dx + dx, y + dy + dy + dy) for (dx, dy) in (1, 0), (0, 1), (1, 1) and (1, (- 1)). We have to make sure the 4 points are in-bounds. The answer is: 70600674.
12. There are solutions based on the fact that GCD(2n, 2n + 1) = GCD(2n + 1, 2n + 2) = 1. NOTE: computing the number of divisors from the prime factorization of a number is well-known fact in elementary number theory. The answer is: 76576500.
13. There is no need for big-integer to solve this problem. Adding the first 15 digits of each number should be enough to get the answer: 5537376230.
14. Simple example demonstrating the usefulness of a technique called memoization. The problem can be solved without memoization, but memoization is going to come in handy for later problems. The answer is: 837799.
15. At any point in a (n + 1) x (n + 1) grid: f(a, b) = f(a - 1, b) + f(a, b - 1), with f(0, b) = 1 = f(a, 0) for 0 <= a,b <= n. The answer is: 137846528820.
16. Consider a programming environment with big-integer to solve this problem. The answer is: 1366.
17. A problem of a different flavor. A dictionary from int -> str, e.g. 1 -> 'one' etc. should help solve the problem. NOTE: there is a recursive structure to translating numbers to words. e.g. 982 = 900 + 82, to_words(982) = to_words(000) . ' and ' . to_words(82). Here '.' means string concatenation. The answer is: 21124.
18. Take all paths from the root to any internal node. Do we have to consider each and every one of them to solve the problem or only the path with the maximum sum? The answer is: 1074.
