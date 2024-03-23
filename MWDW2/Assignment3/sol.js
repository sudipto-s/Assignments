/* Q1 */
document.querySelector('button').addEventListener('click', () => {
   var s = document.querySelector('#output'), sText = document.querySelector('#sText').value, rText = document.querySelector('#rText').value
   
   s.innerText = s.innerText.replace(new RegExp(sText, 'gi'), rText)
})

/* Q2 */
document.querySelector('button').addEventListener('click', () => {
    const email = document.querySelector('input').value, output = document.querySelector('#output')
    if (email.match(/(^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z0-9._-]+)/)) {
        output.innerText = 'Valid Email'
        output.style.color = 'green'
    } else {
        output.innerText = 'Invalid Email!'
        output.style.color = 'red'
    }
})

/* Q3 */
document.querySelector('button').addEventListener('click', () => {
   const txt1 = document.querySelector('textarea')[0], txt2 = document.querySelector('textarea')[1],
   arr = [], reg = /(^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z0-9._-]+)/g,
   
   res = txt1.value.match(reg)
   res.forEach(e => !arr.includes(e) ? arr.push(e) : 0)
   
   txt2.value = arr.join(' ')
})

/* Q4 */
try {
    const url = "test.json",
    xhttp = new XMLHttpRequest()
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4) {
            if (this.status !== 200) {
                console.log("Error fetching", url, this.status)
                return
            }
            const data = JSON.parse(this.responseText)
            console.log(data)
        }
    }
    xhttp.open("GET", url, true)
    xhttp.send()
} catch (err) {
    console.log("Error:", err.message)
}

/* Q5 */
document.querySelector("form").addEventListener
("submit", e => {
    e.preventDefault()  // Prevents form from submitting
    try {
        const xhttp = new XMLHttpRequest()
        xhttp.onreadystatechange = function () {
            if (this.readyState === 4) {
                if (this.status !== 200) {
                    console.log("Error fetching", this.status, this.statusText)
                    return
                }
    
                const data = JSON.parse(this.responseText)
                document.querySelector("#before").innerText = JSON.stringify(data)
                
                const name = e.target.name.value,
                    age = e.target.age.value,
                    email = e.target.email.value
                if (name)
                    data.name = name
                if (age)
                    data.age = age
                if (email)
                    data.email = email
                if (name || age || email)
                    alert("Successfully updated!")
                document.querySelector("#after").innerText = JSON.stringify(data)
            }
        }
        xhttp.open("GET", "test.json", true)
        xhttp.send()
    } catch (err) {
        console.log("Error:", err.message)
    }
})

/* Q6 */
document.querySelector("form").addEventListener
("submit", e => {
    e.preventDefault()  // Prevents form from submitting
    try {
        const xhttp = new XMLHttpRequest()
        xhttp.onreadystatechange = function () {
            if (this.readyState === 4) {
                if (this.status !== 200) {
                    console.log("Error fetching", this.status, this.statusText)
                    return
                }
                const data = JSON.parse(this.responseText)
                console.log(data)

                const field = e.target.same.value,
                    text = e.target.text.value
                const finalD = data.filter(e => e[field] == text)

                if (!finalD.length) {
                    p.innerText = "No data found!"
                    return
                }
                const p = document.querySelector("p")
                p.innerText = ""
                for (let d of finalD)
                    p.innerHTML += JSON.stringify(d) + "<br>"
                console.log(finalD)
            }
        }
        xhttp.open("GET", "test2.json", true)
        xhttp.send()
    } catch (err) {
        console.log("Error:", err.message)
    }
})

/* Q7 */
function fetchData() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status !== 200) {
                console.log("Error fetching", this.status, this.statusText)
                return false
            }
            // Parse the XML response
            var xmlDoc = this.responseXML;

            // Extract required data from the XML
            var data = xmlDoc.getElementsByTagName("data1")[0].childNodes[0].nodeValue;
            
            // Display the extracted data on the webpage
            document.querySelector("p").innerText = data;
        }
    }
    xhttp.open("GET", "example.xml", true)
    xhttp.send();
}
fetchData()

/* Q8 */
function updateXML() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status !== 200) {
                console.log("Error fetching", this.status, this.statusText)
                return
            }
            // Parse the XML response
            var xmlDoc = this.responseXML;

            // Create a new elements
            const book = xmlDoc.createElement("book"),
            title = xmlDoc.createElement("title"),
            author = xmlDoc.createElement("author"),
            year = xmlDoc.createElement("year"),
            price = xmlDoc.createElement("price")

            // Set attributes
            book.setAttribute("category", "cooking")
            title.setAttribute("lang", "en")

            // Set text contents
            title.textContent = "Everyday Italian"
            author.textContent = "Giada De Laurentiis"
            year.textContent = "2005"
            price.textContent = "30.00"

            // Append title, author, year & price tags in book & book tag in xmlDoc
            book.append(title, author, year, price)
            xmlDoc.documentElement.append(book)

            document.querySelector("p").innerText = "Successfully updated data!"
            console.log(xmlDoc)
        }
    }
    xhttp.open("GET", "example.xml", true)
    xhttp.send();
}
updateXML()

/* Q9 incomplete */
document.querySelector("form").addEventListener
("submit", evnt => {
    evnt.preventDefault() //Prevents form from submitting
    try {
        const xhttp = new XMLHttpRequest()
        xhttp.onreadystatechange = function () {
            if (this.readyState === 4) {
                if (this.status !== 200) {
                    console.log("Error fetching", this.status, this.statusText)
                    return
                }
                var xmlDoc = this.responseXML

                var filter = evnt.target.filter.value,
                data = evnt.target.data.value,
                ol = document.querySelector("ol")
                ol.innerText = ""
                
                if (!data.trim()) {
                    ol.innerText = "No result found!"
                    return
                }
                if (filter === "tag") {
                    var result = xmlDoc.getElementsByTagName(data)
                    console.log(result)
                    if (!result.length) {
                        ol.innerText = "No result found!"
                        return
                    }

                    for (var e of result) {
                        console.log(e)
                        var li = document.createElement("li")
                        li.innerText = e.childNodes[0].nodeValue
                        ol.append(li)
                    }
                } else {
                    var result = xmlDoc.getElementsByTagName("book")
                    
                    var found = false
                    for (var i = 0; i < result.length; i++) {
                        if (result[i].getAttribute("category") == data) {
                            var title = result[i].childNodes[1].childNodes[0].nodeValue,
                            author = result[i].childNodes[3].childNodes[0].nodeValue,
                            year = result[i].childNodes[5].childNodes[0].nodeValue,
                            price = result[i].childNodes[7].childNodes[0].nodeValue

                            var li = document.createElement("li")
                            li.innerText = `Title: ${title}
                            Author: ${author}
                            Year: ${year}
                            Price: ${price}`
                            ol.append(li)
                            found = true
                        }
                    }
                    if (!found)
                        ol.append("No result found!")
                }

                console.log(xmlDoc)
            }
        }
        xhttp.open("GET", "bookstore.xml", true)
        xhttp.send()
    } catch (err) {
        console.log("Error:", err.message)
    }
}) 

/* Q10 */
function updateWeather() {
    const inp = document.querySelector('input').value,
    url = `https://api.weatherapi.com/v1/current.json?q=${inp}&key=df1745f8c6cc4466bf545635232304`;
    if (!inp.trim()) {
        alert("Enter location to continue!")
        return
    }
    try {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function () {
            if (this.readyState === 4) {
                if (this.status !== 200) {
                    console.log("Error fetching", url, this.status, this.statusText)
                    return
                }
                var data = JSON.parse(this.response);
                console.log(data)
    
                document.querySelector('#location').innerText = `${data.location.name}, ${data.location.country}`
                document.querySelector('#temp').innerText = `${data.current.temp_c}°C`
                document.querySelector('#humid').innerText = `${data.current.humidity}%`
                document.querySelector('#condition').innerText = `${data.current.condition.text}`
                document.querySelector('#wind').innerText = `${data.current.wind_kph} Kmph / ${data.current.wind_mph} mph (${data.current.wind_degree}° - ${data.current.wind_dir})`
                document.querySelector('#pressure').innerText = `${data.current.pressure_mb} hPa`
                document.querySelector('img').src = data.current.condition.icon
            }
        }
        xhttp.open("GET", url, true);
        xhttp.send();
    } catch (err) {
        console.log("Error:", err.message)
    }
}

