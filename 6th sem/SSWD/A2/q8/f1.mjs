export const calcGCD = (a, b) => {
   while (b !== 0)
      [a, b] = [b, a % b]
   return a
}

export const calcLCM = (a, b) =>
   (a * b) / calcGCD(a, b)

export default (a, b, c) => {
   const gcd = calcGCD(calcGCD(a, b), c)
   const lcm = calcLCM(calcLCM(a, b), c)
   return { gcd, lcm }
}
