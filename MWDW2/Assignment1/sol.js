/* Q1 */
setInterval(() => {
    var dt = new Date(),
    h = dt.getHours(),
    m = dt.getMinutes(),
    s = dt.getSeconds()
    console.log(`${h}:${m}:${s}`)
}, 1000)


/* Q2 */
function validateUrl(string){
    const res = /^http[s]?:\/\/([^\s]+)/g.exec(string);
    return res != null && (res[0].startsWith("http://") || res[0].startsWith("https://"));
}
var url = "https://github.com"
console.log(validateUrl(url) ? 'Valid URL' : 'Invalid URL')


/* Q3 */
var inp1 = document.getElementById("n1"),
inp2 = document.getElementById("n2"),
res = document.querySelector("p");
function q3M() {
    res.innerText = inp1.value * inp2.value
}
function q3D() {
    res.innerText = inp1.value / inp2.value
}


/* Q4 */
function findMissingNumber(arr) {
    const n = arr.length + 1,
    sumOfNNumbers = n * (n - 1) / 2
    return sumOfNNumbers - arr.reduce((acc, val) => acc + val, 0)
}
var arr = [0, 1, 2, 4, 5];
console.log(findMissingNumber(arr));


/* Q5 */
var num = 5
function isPrime(num) {
    var prime = true;
    for (i = 2; i <= num / 2; i++)
        if (num % i == 0) {
            prime = false;
            break;
        }
    return prime;
}
console.log(isPrime(num))


/* Q6 */
function even(arr) {
    return arr.filter(e => e % 2 === 0)
}
var arr = [1, 2, 3, 4, 5, 6, 7, 8 , 9, 10]
console.log(even(arr))


/* Q7 */
function sum(arr) {
    return arr.reduce((acc, val) => acc + val)
}
var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
console.log(sum(arr))


/* Q8 */
function type(val) {
    return `Type of ${val} is: ${typeof val}`
}
console.log(type("Hello"))
console.log(type(1))
console.log(type({}))
console.log(type(true))


/* Q9 */
class University {
   constructor(name) {
      this.name = name
      this.deps = []
   }
   addDepartments(...depts) {
      depts.forEach(e => this.deps.push(e))
   }
   removeDepartment(depts) {
      let found = this.deps.filter(e => e === depts).length
      if(found) {
         found = this.deps.indexOf(depts)
         this.deps.splice(found, 1)
         console.log(`Department ${depts} removed from ${this.name}`)
      } else
         console.log(`Department ${depts} not found in ${this.name}`)
   }
   showDepartments() {
      console.log(`Departments in ${this.name}:`)
      this.deps.forEach(e => console.log(e))
   }
}
let u1 = new University('SOA')
u1.addDepartments('CSE', 'CSIT', 'ECE', 'EEE', 'EE', 'ME', 'CE')
u1.removeDepartment('ME')
u1.showDepartments()


/* Q10 */
class Book {
    constructor(title, author, year) {
        this.title = title
        this.author = author
        this.year = year
    }
    details() {
        console.log(`
        Title: ${this.title}
        Author: ${this.author}
        Published: ${this.year}`)
    }
}
class eBook extends Book {
    constructor(title, author, year, price) {
        super(title, author, year)
        this.price = price
    }
    details() {
        console.log(`
        Title: ${this.title}
        Author: ${this.author}
        Published: ${this.year}
        Price: ${this.price}`)
    }
}
var b1 = new eBook("The Alchemist", "Paulo Coelho", 1988, 500)
b1.details()
