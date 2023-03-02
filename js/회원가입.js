const id = document.getElementById("idInput");
id.addEventListener("keyup", function(){
    let regEx = //;

    if(regEx.test(id.value)){
        id.style.backgroundColor = "springgreen";
        id.style.color="black";
    } else if(id.value == 0){
        id.style.backgroundColor = "transparent";
        id.style.color="black";
    } else{
        id.style.backgroundColor = "red";
        id.style.color="white";
    }
})

