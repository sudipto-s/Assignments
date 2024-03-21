/* Q1 COMPLETE
document.querySelector('button').addEventListener('click', () => {
   var s = document.querySelector('#output'), sText = document.querySelector('#sText').value, rText = document.querySelector('#rText').value
   
   s.innerText = s.innerText.replace(new RegExp(sText, 'gi'), rText)
}) */

/* Q2 COMPLETE
document.querySelector('button').addEventListener('click', () => {
    const email = document.querySelector('input').value, output = document.querySelector('#output')
    if (email.match(/(^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z0-9._-]+)/)) {
        output.innerText = 'Valid Email'
        output.style.color = 'green'
    } else {
        output.innerText = 'Invalid Email!'
        output.style.color = 'red'
    }
}) */

/* Q3 COMPLETE
document.querySelector('button').addEventListener('click', () => {
   const txt1 = document.querySelector('textarea')[0], txt2 = document.querySelector('textarea')[1],
   arr = [], reg = /(^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z0-9._-]+)/g,
   
   res = txt1.value.match(reg)
   res.forEach(e => !arr.includes(e) ? arr.push(e) : 0)
   
   txt2.value = arr.join(' ')
}) */

/* Q4 COMPLETE
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
} */

/* Q5
function updateFields(e) {
    try {
        const xhttp = new XMLHttpRequest()
        xhttp.onreadystatechange = function () {
            if (this.readyState === 4) {
                if (this.status !== 200) {
                    console.log("Error fetching", this.status, this.statusText)
                    return
                }
    
                const data = JSON.parse(this.responseText)
                console.log("Before updatation:", data)
                
                const name = e.name.value,
                    age = e.age.value,
                    email = e.email.value
                if (name)
                    data.name = name
                if (age)
                    data.age = age
                if (email)
                    data.email = email
                if (name || age || email)
                    alert("Successfully updated!")
                console.log("After updatation:", data)
            }
        }
        xhttp.open("GET", "test.json", true)
        xhttp.send()
    } catch (err) {
        console.log("Error:", err.message)
    }

    return false
} */

/* Q6
document.querySelector("form").addEventListener
("submit", e => {
    e.preventDefault()  // Prevents form from submitting
    try {
        const xhttp = new XMLHttpRequest()
        xhttp.onreadystatechange = function () {
            if (this.readyState === 4) {
                if (this.status !== 200) {
                    console.log("Error fetching", this.status, this.statusText)
                    return false
                }
                const data = JSON.parse(this.responseText)
                console.log(data)
                const field = e.same.value, text = e.text.value
                const finalD = data.filter(e => e[field] == text)

                console.log(finalD)
            }
        }
        xhttp.open("GET", "test2.json", true)
        xhttp.send()
    } catch (err) {
        console.log("Error:", err.message)
    }
    return false
}) */

/* Q7
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
fetchData() */

/* Q8
function up() {
    // Update data
    const xhttp = new XMLHttpRequest()
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4)
            if (this.status !== 200) {
                console.log("Error fetching", this.status, this.statusText)
                return false
            }
    }
    xhttp.open("POST", "example.xml", true)
    xhttp.setRequestHeader("Content-Type", "text/xml")
    xhttp.send(xmlContent)

    // Show data
    var xmlContent = '<?xml version="1.0" encoding="UTF-8"?><root><data>123546</data></root>';
    var xhttp1 = new XMLHttpRequest();
    xhttp1.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status !== 200) {
                console.log("Error fetching", this.status, this.statusText)
                return false
            }
            // Parse the XML response
            var xmlDoc = this.responseXML;

            // Extract required data from the XML
            var data = xmlDoc.getElementsByTagName("data")[0].childNodes[0].nodeValue;

            // Display the extracted data on the webpage
            document.querySelector("p").innerText = data;
        }
    }
    xhttp1.open("GET", "example.xml", true)
    xhttp1.send();
}
up() */

/* Q9*/
document.querySelector("form").addEventListener
("submit", e => {
    e.preventDefault()  //Prevents form from submitting
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
                const field = e.same.value,
                    text = e.text.value
                const finalD = data.filter(e => e[field] == text)

                console.log(finalD)
            }
        }
        xhttp.open("GET", "example.xml", true)
        xhttp.send()
    } catch (err) {
        console.log("Error:", err.message)
    }
}) 

/* Q10 COMPLETE
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
} */

