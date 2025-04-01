import { Heater } from './q6.mjs'

const heat = new Heater()

heat.on('msg', data => console.log(`Q7 - ${data}`))

heat.start()
