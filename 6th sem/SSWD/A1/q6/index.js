const express = require('express')
const path = require('path')

const app = express()
app.use(express.static('public'))

const filePath = path.join(__dirname, 'public', 'image.jpg')

app.get("/", (req, res) => {
   res.send("Click <a href='/download'>here</a> to download the image")
})

app.get('/download', (req, res) => {
   res.download(filePath, 'downloaded-image.jpg', err => {
      if (err) {
         console.error('Error downloading file:', err)
         res.status(500).send('Error downloading file')
      }
   })
})

app.listen(5000, () => {
   console.log(`Server running at http://localhost:5000`)
})