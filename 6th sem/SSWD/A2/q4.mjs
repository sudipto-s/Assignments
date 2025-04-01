import fs from "fs/promises"

try {
   const data = await fs.readFile('./t.txt', 'utf-8')
   console.log(data)
} catch (e) {
   console.log(e)
}
