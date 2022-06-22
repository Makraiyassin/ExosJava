const  chat = document.getElementById("chat");
const button = document.getElementById("submit");
const reponse = document.getElementById("reponse");

const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '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',
		'X-RapidAPI-Host': 'ai-chatbot.p.rapidapi.com'
	}
};

button.addEventListener("click", (e)=>{
    e.preventDefault();
    let msg;
    if(chat.value){
        fetch(`https://ai-chatbot.p.rapidapi.com/chat/free?message=${msg}&uid=user1`, options)
            .then(response => response.json())
            .then(data => {
                console.log(data);
                reponse.innerText= data.chatbot.response;
                
            })
            .catch(err => console.error(err));

        chat.value="";
    }else{
        reponse.innerText= "yo";
    }
})

