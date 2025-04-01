import evEm from 'events'

export class Heater extends evEm {
   start() {
      setInterval(() => {
         console.log(`Q6 - Sent!`)
         this.emit('msg', 1)
      }, 2000)
   }
}