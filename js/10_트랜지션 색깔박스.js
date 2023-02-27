
const colorBox = document.getElementsByClassName("colorBox");
const colorInput = document.getElementsByClassName("colorInput");
for(let i = 0; i < colorInput.length; i++){
    colorInput[i].addEventListener("keyup", function(){ 
        colorBox[i].style.backgroundColor = colorInput[i].value;
        colorInput[i].style.color = colorInput[i].value;

    })    
}

const btn = document.getElementById("btn");
btn.addEventListener("click", function(){   
    const inputSpeed = document.getElementById("inputSpeed");
    document.getElementById("speed").innerText = inputSpeed.value + "초";
    document.getElementById("st").innerHTML =
    ".duration{ transition-duration:" + inputSpeed.value +"s";
})

const reset = document.getElementById("reset");
reset.addEventListener("click", function(){
    for(let i = 0; i < colorBox.length; i++){
        colorBox[i].style.backgroundColor = "transparent";
        document.getElementById("speed").innerText = "0초";
    }
})