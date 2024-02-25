// Q1

// Q2

// Q3
/*
let perpenicular = prompt('Enter value of perpendicular'),
base = prompt('Enter value of base')
let hypotenuse = (perpendicular ** 2 + base ** 2) ** 0.5
console.log(hypotenuse)
*/

// Q4
var a = 1, b = 2, c = 3
a += b
a /= c
c %= b
//console.log(a, b, c)

// Q5
var miles = 6,
km = miles * 1.60935
//console.log(km)

// Q6
/*
let weight = prompt('Enter weight in pound'),
height = prompt('Enter height in inch')
weight *= 0.454
height *= 0.0254
let bmi = weight / (height * height)
console.log(bmi)
*/

// Q7
var ar1 = ['Milk', 'Bread', 'Apple']
//console.log(ar1.length)
ar1[1] = 'Banana'
//console.log(ar1)

// Q8
/*var ar2 = []
ar2.push('Milk', 'Bread', 'Apple')
ar2.splice(1, 1, 'Banana', 'Egg')
console.log(ar2.pop())
ar2.sort()
console.log(ar2.indexOf('Milk'))
ar2.splice(1, 0, 'Carrot', 'Lettuce')
var ar3 = ['Juice', 'Pop']
ar2 = ar2.concat(ar3, ar3)
console.log(ar2.lastIndexOf('Pop'))
console.log(ar2)*/

// Q9
var ar1 = [1, 2, 3],
    ar2 = []
ar2 = ar2.concat(ar1, ar1, ar1)
let num = ar2.find(e => e === 2)
//console.log(num)

// Q10
let ob1 = {
    model: "Jesko",
    make: "Koeigsegg",
    color: "Silver",
    class: "Sports car",
    engineCC: 5056,
    varients: ["Attack", "Absolut"],
    year: 2021,
    assembly: "Angelholm, Sweden"
}
var prop = "color"
ob1[prop] = "Grey"
prop = "forSale"
ob1[prop] = true
/*console.log("Model: ", ob1.model)
console.log("Make: ", ob1.make)
console.log("For sale? ", ob1.forSale)*/

// Q11
var people = {
        friends: []
    },
    f1 = {
        fName: 'name 1',
        lName: 'last name 1',
        id: 1
    },
    f2 = {
        fName: 'name 2',
        lName: 'last name 2',
        id: 2
    },
    f3 = {
        fName: 'name 3',
        lName: 'last name 3',
        id: 3
    }
people.friends.push(f1, f2, f3)
console.log(people)

// Q12

// Q13

// Q14

// Q15

// Q16

// Q17

// Q18

// Q19

// Q20

// Q21

// Q22

// Q23
