const  chat = document.getElementById("chat");
const  input = document.getElementById("input");
const button = document.getElementById("submit");

const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': 'c7708bfd53msh584eb32b618c011p16766fjsnf7c5b652670e',
		'X-RapidAPI-Host': 'ai-chatbot.p.rapidapi.com'
	}
};

button.addEventListener("click", (e)=>{
    e.preventDefault();
    let msg = input.value;
    let paragraphes = document.querySelectorAll("#chat p");
    if(input.value){
        fetch(`https://ai-chatbot.p.rapidapi.com/chat/free?message=${msg}&uid=user1`, options)
            .then(response => response.json())
            .then(data => {
                console.log(data);
                chat.insertAdjacentHTML("beforeend", `<p class="me">${input.value}</p>`)
                chat.insertAdjacentHTML("beforeend", `<p class="bot">${data.chatbot ? data.chatbot.response : "une erreur est survenue" }</p>`)
                input.value="";
            })
            .catch(err => console.error(err));
    }else{
        chat.insertAdjacentHTML("beforeend", `<p class="bot">write something please....</p>`)
    }
})

