const mainHTML = document.querySelector("#main")
const applePrice = 1
const pearPrice = 2
const cherryPrice = 3

const inputApple = document.createElement("input")
inputApple.setAttribute("type", "number")
inputApple.setAttribute("placeholder", "nombre de pomme")

const inputPear = document.createElement("input")
inputPear.setAttribute("type", "number")
inputPear.setAttribute("placeholder", "nombre de poir")

const inputCherry = document.createElement("input")
inputCherry.setAttribute("type", "number")
inputCherry.setAttribute("placeholder", "nombre de cerise")

const buttonTotal = document.createElement("button")
buttonTotal.innerText= "Calculez le total"

const totalHTML = document.createElement("p")


mainHTML.appendChild(inputApple)
mainHTML.appendChild(inputPear)
mainHTML.appendChild(inputCherry)
mainHTML.appendChild(buttonTotal)
mainHTML.appendChild(totalHTML)

const total = ()=>{
    const appleNumber = parseInt(inputApple.value) ? parseInt(inputApple.value) : 0
    const pearNumber = parseInt(inputPear.value) ? parseInt(inputPear.value) : 0
    const cherryNumber = parseInt(inputCherry.value) ?  parseInt(inputCherry.value) : 0

    let tot = (appleNumber * applePrice) + (pearNumber * pearPrice) + (cherryNumber * cherryPrice) 
    if(appleNumber >=1 && pearNumber >=1 && cherryNumber >=1){
        tot = tot*0.9
    }
    return tot
}

document.querySelector("button").addEventListener("click", ()=>{
    totalHTML.innerText= `le total est: ${total()} €`
})
