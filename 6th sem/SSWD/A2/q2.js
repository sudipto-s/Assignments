const getVal = () =>
   new Promise((res, rej) => {
      setTimeout(() => {
         res(1)
      }, 1000)
   })

getVal()
.then(console.log)
.catch(console.log)