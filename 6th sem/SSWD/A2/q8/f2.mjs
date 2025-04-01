import calcGCD_LCM from './f1.mjs'

const num1 = 144, num2 = 180, num3 = 240
const { gcd, lcm } = calcGCD_LCM(num1, num2, num3)

console.log(`GCD of ${num1}, ${num2}, and ${num3} is: ${gcd}`)
console.log(`LCM of ${num1}, ${num2}, and ${num3} is: ${lcm}`)

export function countFactors(num) {
   let count = 0
   for (let i = 1; i <= num; i++) {
      if (num % i === 0) count++
   }
   return count
}

export const fc_gcd = countFactors(gcd)
export const fc_lcm = countFactors(lcm)
