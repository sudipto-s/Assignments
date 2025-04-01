const fact = n => {
   if (n === 0 || n === 1) return 1
   return n * fact(n - 1)
}

const isStrongNumber = n => {
   let sum = 0
   let temp = n
   
   while (temp > 0) {
      let digit = temp % 10
      sum += fact(digit)
      temp = Math.floor(temp / 10)
   }
   
   return sum === n
}

const number = 145
if (isStrongNumber(number))
   console.log(`${number} is a Strong Number.`)
else
   console.log(`${number} is not a Strong Number.`)
