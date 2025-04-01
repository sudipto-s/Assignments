const getVal = () =>
   new Promise((res, rej) => rej("Catch concept implementation"))

getVal()
.then(console.log)
.catch(e => console.log('Error:', e))