const  chat = document.getElementById("chat");
const  input = document.getElementById("input");
const button = document.getElementById("submit");

const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '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',
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
                chat.insertAdjacentHTML("beforeend", `<p class="me">${input.value}</p>`)
                chat.insertAdjacentHTML("beforeend", `<p class="bot">${data.chatbot.response ? data.chatbot.response : "une erreur est survenue" }</p>`)
                input.value="";
            })
            .catch(err => console.error(err));
    }else{
        chat.insertAdjacentHTML("beforeend", `<p class="bot">write something please....</p>`)
    }
})

