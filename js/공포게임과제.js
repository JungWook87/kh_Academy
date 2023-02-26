const div1 = document.getElementById("div1");
    let cnt = 0;
    let str = "";

div1.addEventListener("mouseover", function(){
    
    if(cnt < 10){
        str += "사랑해";
        div1.innerText = str;
        div1.classList.add("love");
        div1.classList.remove("stop");
    } else {
        div1.innerText = "그만해!!!";
        div1.classList.add("stop");
        div1.classList.remove("love");
    }
    
})

div1.addEventListener("mouseleave", function(){
    div1.classList.remove("love");
    div1.classList.remove("stop");
    div1.innerText = "나에게 마우스를 올려봐";
    cnt++;
})