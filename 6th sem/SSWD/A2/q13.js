let n = 123456, s = 0

const res = new Promise((res, rej) => {
   if(n.toString().length != 6)
      rej(`Invalid input: ${n}`)
   while(n > 0) {
      s += n % 10
      n = Math.floor(n / 10)
   }
   res(`Sum: ${s}`)
})

res.then(console.log)
.catch(console.log)
