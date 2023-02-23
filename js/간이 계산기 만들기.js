const num1 = document.getElementById("num1"); // 요소 추적 O, 값, 속성 추적 X
const num2 = document.getElementById("num2");
const result = document.getElementById("result");

// parseInt() : 함수
// Number() : 형변환 자료형
function plus(){
    
    result.innerText = parseInt(num1.value) + parseInt(num2.value);
}

function minus(){

    result.innerText = Number(num1.value) - Number(num2.value);
}

function multiple(){
    result.innerText = Number(num1.value) * Number(num2.value);
}

function divide(){

    if(num2 != 0){
        result.innerText = Number(num1.value) / Number(num2.value);
    } else{
        result.innerText = "두번째 값에 0 금지";
    }

}

function modulus(){
    result.innerText = Number(num1.value) % Number(num2.value);
}