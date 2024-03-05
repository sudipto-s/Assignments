/* Q1 */
const theList = ['Laurence', 'Svekis', true, 35, null, undefined,
    {
        test: 'one',
        score: 55
    },
    ['one', 'two']
]
theList.shift()
theList.pop()
theList.unshift('FIRST')
theList.pop()
theList.pop()
theList.pop()
theList.pop()
theList.pop()
theList.push('MIDDLE', 'hello world', 'LAST')
console.log(theList)


/* Q2 */
const inventory = []
const item1 = {
    name: "Koinegsegg",
    model: "Revera",
    cost: 500,
    quantity: 10
}
const item2 = {
    name: "Koinegsegg",
    model: "Revera",
    cost: 500,
    quantity: 10
}
const item3 = {
    name: "Koinegsegg",
    model: "Revera",
    cost: 500,
    quantity: 10
}
inventory.push(item1, item2, item3);
console.log(inventory)
console.log(inventory[2].quantity)


/* Q3 */
const name = prompt("Enter name")
switch (name) {
    case "name1":
    case "name2":
    case "name3":
    case "name4":
        console.log("Friend")
        break;
    default:
        console.log("Not friend")
}


/* Q4 */
var hk = ['rock', 'paper', 'scissors'],
comp = hk[Math.floor(Math.random()*3)],
user = prompt('Enter your choice: 0 - Rock, 1 - Paper or 2 - Scissor', Math.floor(Math.random()*3))
console.log(`You chose ${hk[user]}`)
console.log(`Computer chose ${comp}`)
 switch (`${hk[user]}${comp}`) {
     case 'rockscissors':
     case 'paperrock':
     case 'scissorspaper':
         console.log('You win!'); break;
     case 'rockrock':
     case 'paperpaper':
     case 'scissorsscissors':
         console.log('It\'s a draw!'); break;
     default:
         console.log('Computer wins!')
 }


/* Q5 */
let final = [], max = 10
for(i = 1; i <= max; i++) {
    let temp = []
    for(j = 1; j <= max; j++)
        temp.push(i * j)
    final.push(temp)
}
console.log(final)


/* Q6 */
function rec(n) {
    if(n > 10) return
    console.log(n)
    rec(++n)
}
rec(-2)


/* Q7 */
let f1 = () => {
    console.log("one")
}
let f2 = () => {
    console.log("two")
}
let f3 = () => {
    console.log("three")
    f1()
    f2()
}
let f4 = () => {
    console.log("four")
    f3()
    setTimeout(f1, 0);
}
f4()


/* Q8 */
class EmployeeTracker {
    constructor(fName, lName, years) {
        this.fName = fName
        this.lName = lName
        this.years = years
    }
}
const empArr = []
let e1 = new EmployeeTracker("f1", "l1", 5)
let e2 = new EmployeeTracker("f2", "l2", 8)
empArr.push(e1, e2)
EmployeeTracker.prototype.details = function() {
    console.log(`
    Name: ${this.fName} ${this.lName}
    Years: ${this.years}`)
}
empArr.forEach(e => e.details())


/* Q9 */
class Menu {
    #price1 = 50
    #price2 = 60
    constructor(n1, n2) {
        this.n1 = n1
        this.n2 = n2
    }
    total() {
        this.val = this.n1 * this.#price1 + this.n2 * this.#price2
        return this.val
    }
    get totalPrice() {
        return this.val
    }
}
let m1 = new Menu(2, 5)
console.log(m1.total())
console.log(m1.totalPrice)

let m2 = new Menu(6, 4)
console.log(m2.total())
console.log(m2.totalPrice)
