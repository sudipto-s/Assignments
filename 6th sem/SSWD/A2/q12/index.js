const express = require('express')
const app = express()

function callBk(req, res, next) {
   console.log(`Callbach executed`)
   next()
}

app.get('/', callBk, (req, res) => {
   res.send('Sent after executing the callback function!')
})

app.listen(5000, () => console.log(`http://localhost:5000`))
