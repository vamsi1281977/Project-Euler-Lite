# Project-Euler-Lite
Answers to lite version of Project Euler problems.

This page contains answers to Project Euler problems for parameters easier than the ones at Project Euler, hence the lite. For answers to Project Euler problems, please visit: https://github.com/luckytoilet/projecteuler-solutions.

1. Problem 001: S(n): sum of all multiples of 3 or 5 less than n. S(1000) = 233168. Can be solved using arithmetic progressions and the principle of inclusion-exclusion.
2. Problem 002: S(n): sum of even fibonacci numbers not greater than n. S(4000000) = 4613732. Can be solved by observing the pattern in 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... NOTE: E, O, O, E, O, O, E, ... where E means even and O means odd.
3. Problem 003: lgpf(n): largest prime factor of n. lgpf(600851475143) = 6857. NOTE: to compute the prime-factors of N, (naively) we only need to check 2 and all odd numbers in the interval [3, sqrt(N)].
4. Problem 004: The largest palindromic number that is a product of two three digit numbers is 906609.
5. Problem 005: lcm(1,2,3,...,20) = 232792560.
6. Problem 006: a(n): sum of the first n positive integers = (n * (n + 1)) / 2, b(n): sum of the squares of the first n positive integers = (n * (n + 1) * (n + n + 1)) / 6, (a(100) ** 2) - b(100) = 25164150.
7. Problem 007: This problem can be solved using a variation of Lucy Hedgehog's algorithm for Problem 10. Prime(10001) = 104743.
8. Problem 008: Largest product of 13 contiguous digits is 23514624000.
9. Problem 009: The Pythagorean triple with a + b + c = p = 1000 is (200, 375, 425) = 25 * (8, 15, 17). abc = 31875000.
10. Problem 010: Lucy Hedgehog has the best answer to this problem. The Lucy Hedgehog algorithm can be modified to compute Prime_Pi(x). The Prime_Pi(x) can be used to solve problem 7. S(x): sum of all primes not greater than x, S(2000000) = 142913828922.
11. Problem 011: We have to visit the following points: (x, y), (x + dx, y + dy), (x + dx + dx, y + dy + dy), (x + dx + dx + dx, y + dy + dy + dy) for (dx, dy) in (1, 0), (0, 1), (1, 1) and (1, (- 1)). We have to make sure the 4 points are in-bounds. The answer is: 70600674.
12. Problem 012: There are solutions based on the fact that GCD(2n, 2n + 1) = GCD(2n + 1, 2n + 2) = 1. NOTE: computing the number of divisors from the prime factorization of a number is well-known fact in elementary number theory. The answer is: 76576500.
13. Problem 013: There is no need for big-integer to solve this problem. Adding the first 15 digits of each number should be enough to get the answer: 5537376230.
14. Problem 014: Simple example demonstrating the usefulness of a technique called memoization. The problem can be solved without memoization, but memoization is going to come in handy for later problems. The answer is: 837799.
15. Problem 015: At any point in a (n + 1) x (n + 1) grid: f(a, b) = f(a - 1, b) + f(a, b - 1), with f(0, b) = 1 = f(a, 0) for 0 <= a,b <= n. The answer is: 137846528820.
16. Problem 016: Consider a programming environment with big-integer to solve this problem. The answer is: 1366.
17. Problem 017: A problem of a different flavor. A dictionary from int -> str, e.g. 1 -> 'one' etc. should help solve the problem. NOTE: there is a recursive structure to translating numbers to words. e.g. 982 = 900 + 82, to_words(982) = to_words(000) . ' and ' . to_words(82). Here '.' means string concatenation. The answer is: 21124.
18. Problem 018: Take all paths from the root node to any internal node. Do we have to consider each and every one of them to solve the problem or only the path with the maximum sum? The answer is: 1074.
19. Problem 019: Consider using an environment with calendar built in. The answer is: 171. This curiosly happens to be (12 * 100) // 7.
20. Problem 020: Consider using a programming environment with big-integer. The answer is: 648.
21. Computing the sum of proper divisors of a number from its prime factorization is a well known result in elementary number theory. The answer is: 31626.
22. A problem of a different flavor. A programming environment with builtin sort function is preferable. The answer is: 871198282.
23. Solving this problem is easy if you have already solved problem 21. The answer is: 4179871.
24. There are ways of solving this problem without enumerating the first million permutations. Simply enumerating the permutations using standard library is enough. Consider a programming environment with a permutations or next_permutation function available. The answer is: 2783915460.
25. This problem can be solved with big-integers very easily. With some help from WolframAlpha, use this problem as an opportunity to learn how to solve recurrence relations using generating functions. The answer is: 4782.
26. Problem 162: How would you count the number of n-digit hexadecimal numbers with at-least one zero in them? NOTE: Leading zeros are not allowed.
