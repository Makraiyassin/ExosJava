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
    let paragraphes = document.querySelectorAll("#chat p")
    if(paragraphes.length >=10) paragraphes[0].remove() ;
    if(input.value){
        fetch(`https://aeona3.p.rapidapi.com/?text=${msg}`, options)
        .then(response => response.text())
        .then(data => {
                chat.insertAdjacentHTML("beforeend", `<p class="me">${input.value}</p>`)
                chat.insertAdjacentHTML("beforeend", `<p class="bot">${data}</p>`)
                input.value="";
            })
            .catch(err => console.log(err));
    }else{
        chat.insertAdjacentHTML("beforeend", `<p class="bot">write something please....</p>`)
    }

})
