/* Q1 */
document.querySelector('button').addEventListener('click', () => {
    var s = document.querySelector('#output'),
        sText = document.querySelector('#sText').value,
        rText = document.querySelector('#rText').value

    s.innerText = s.innerText.replace(new RegExp(sText, 'gi'), rText)
})

/* Q2 */
document.querySelector('button').addEventListener('click', () => {
    var email = document.querySelector('input').value,
        output = document.querySelector('#output')
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
    var txt = document.querySelectorAll('textarea'),
        arr = [], reg = /([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z0-9._-]+)/g,

        res = txt[0].value.match(reg)
    res.forEach(e => !arr.includes(e) ? arr.push(e) : 0)

    txt[1].value = arr.join()
})

/* Q4 */
var url = "test.json",
xhttp = new XMLHttpRequest()
xhttp.onreadystatechange = function() {
    if (this.readyState === 4) {
        if (this.status !== 200) {
            console.log("Error fetching", url, this.status)
            return
        }
        var data = JSON.parse(this.responseText)
        console.log(data)
    }
}
xhttp.open("GET", url, true)
xhttp.send()

/* Q5 */
document.querySelector("form").addEventListener("submit", e => {
    e.preventDefault() // Prevents form from submitting

    var name = e.target.name.value,
        age = e.target.age.value
        email = e.target.email.value

    var data = {
        name: name,
        age: age,
        email: email
    }

    var xhttp = new XMLHttpRequest()
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status !== 200) {
                alert(`Error upddating: ${this.status} ${this.statusText}`)
                console.log("Error updating", this.status, this.statusText)
                return
            }

            document.querySelector("#msg").innerText = "Successfully updated"
        }
    }
    xhttp.open("POST", "update.php", true)
    xhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8")
    xhttp.send(JSON.stringify(data))
})

/* Q6 */
document.querySelector("form").addEventListener
("submit", e => {
    e.preventDefault()  // Prevents form from submitting

    var xhttp = new XMLHttpRequest()
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status !== 200) {
                console.log("Error fetching", this.status, this.statusText)
                return
            }
            var data = JSON.parse(this.responseText)
            console.log(data)

            var field = e.target.same.value,
                text = e.target.text.value
            var finalD = data.filter(e => e[field] == text)

            var p = document.querySelector("p")
            if (!finalD.length) {
                p.innerText = "No data found!"
                return
            }
            p.innerText = ""
            for (let d of finalD)
                p.innerHTML += JSON.stringify(d) + "<br>"
            console.log(finalD)
        }
    }
    xhttp.open("GET", "users.json", true)
    xhttp.send()
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
document.querySelector('form').addEventListener('submit', e => {
    e.preventDefault();

    var id = e.target.id.value,
        name = e.target.name.value,
        age = e.target.age.value

    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            if (this.status !== 200) {
                alert(`Error upddating: ${this.status} ${this.statusText}`)
                console.log("Error updating", this.status, this.statusText)
                return
            }

            document.querySelector('#msg').textContent = 'Data updated successfully.';
        }
    }

    xhr.open('POST', 'update_xml.php', true)
    xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded')
    xhr.send(`id=${encodeURIComponent(id)}&name=${encodeURIComponent(name)}&age=${encodeURIComponent(age)}`)
})

/* Q9 */
document.querySelector("form").addEventListener
("submit", e => {
    e.preventDefault() //Prevents form from submitting
    var xhttp = new XMLHttpRequest()
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status !== 200) {
                console.log("Error fetching", this.status, this.statusText)
                return
            }
            var xmlDoc = this.responseXML
            console.log(xmlDoc)

            var aqi = xmlDoc.getElementsByTagName("air_quality")[0],
            alerts = xmlDoc.getElementsByTagName("alerts")[0],
            p = document.querySelector("p")

            if (filter === "current") {
                p.innerHTML = `<h2>${val(xmlDoc, "name")}, ${val(xmlDoc, "country")}</h2>
                Temperature: ${val(xmlDoc, "temp_c")}°C<br>
                Wind: ${val(xmlDoc, "wind_kph")} Km/h<br>
                Pressure: ${val(xmlDoc, "pressure_mb")} hPa<br>
                Humidity: ${val(xmlDoc, "humidity")}%`
            } else if (filter === "aqi") {
                p.innerHTML = !aqi ? "No result found!" :
                `<h2>${val(xmlDoc, "name")}, ${val(xmlDoc, "country")}</h2>
                CO: ${val(xmlDoc, "co")}<br>
                NO<sub>2</sub>: ${val(xmlDoc, "no2")}<br>
                O<sub>3</sub>: ${val(xmlDoc, "o3")}<br>
                SO<sub>2</sub>: ${val(xmlDoc, "so2")}<br>
                PM<sub>2.5</sub>: ${val(xmlDoc, "pm2_5")}<br>
                PM<sub>10</sub>: ${val(xmlDoc, "pm10")}<br>
                EPA Index: ${val(xmlDoc, "us-epa-index")}`
            } else {
                p.innerHTML = !alerts ? "No result found!" :
                `<h2>${val(xmlDoc, "name")}, ${val(xmlDoc, "country")}</h2>
                ${val(xmlDoc, "event")}`
            }
        }
    }

    var search = e.target.location.value, filter = e.target.filter.value
    xhttp.open("GET", `https://api.weatherapi.com/v1/current.xml?q=${search}&key=df1745f8c6cc4466bf545635232304&${filter}=yes`, true)
    xhttp.send()
})
function val(xml, tag) {
    return xml.getElementsByTagName(tag)[0].childNodes[0].nodeValue
}

/* Q10 */
function updateWeather() {
    var inp = document.querySelector('input').value,
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

                document.querySelector('#location').innerText = `${data.location.name}, ${data.location.region} ${data.location.country}`
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
