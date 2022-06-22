const  chat = document.getElementById("chat");
const  input = document.getElementById("input");
const button = document.getElementById("submit");

const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': 'c7708bfd53msh584eb32b618c011p16766fjsnf7c5b652670e',
		'X-RapidAPI-Host': 'aeona3.p.rapidapi.com'
	}
};




button.addEventListener("click", (e)=>{
    e.preventDefault();
    let msg = input.value ? input.value : "a";
    fetch(`https://aeona3.p.rapidapi.com/?text=${msg}`, options)
        .then(response => response.text())
        .then(data => {
            if(input.value){
                chat.insertAdjacentHTML("beforeend", `<p class="me">${input.value}</p>`)
                chat.insertAdjacentHTML("beforeend", `<p class="bot">${data}</p>`)
                input.value="";
            }else{
                chat.insertAdjacentHTML("beforeend", `<p class="bot">write something please....</p>`)
            }
        })
        .catch(err => console.log(err));

})
