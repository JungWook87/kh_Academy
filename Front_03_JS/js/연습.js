function bgChange(){
    const box = document.getElementById("box");

    if(box.style.backgroundColor != "red"){
        box.style.backgroundColor="red";
    } else{
        box.style.backgroundColor="yellow";
    }
}

function bgChange2(){
    const innerBox = document.getElementsByClassName("innerBox");

    innerBox[0].style.backgroundColor="green";
    innerBox[1].style.backgroundColor="yellow";
    innerBox[2].style.backgroundColor="red";

    for(let i = 0; i < innerBox.length; i++){
        innerBox[i].innerText = i + "번째 요소입니다.";
    }
}

function bgChange3(){
    const lis = document.getElementsByTagName("li");

    for(let i = 0; i < lis.length; i++){
        lis[i].style.backgroundColor = "rgb(100, " + lis[i].innerText + ", 130)";
    }
}

function fnInput(){
    const inputValue = document.getElementById("inputValue");

    alert(inputValue.value);

    inputValue.value = "";
}

function hobby(){
    const hobby = document.getElementsByName("hobby");
    const result = document.getElementById("result");

    let cnt = 0;
    let str = "";

    for(let i = 0; i < hobby.length; i++){
        if(hobby[i].checked){
            cnt++;
            str += hobby[i].value + " ";
        }
    }

    if(str != ""){
        result.innerText = str;
        result.innerHTML += "<br><br> 선택된 개수 : " + cnt;
    } else{
        result.innerText = "선택된게 없음";
    }


}
