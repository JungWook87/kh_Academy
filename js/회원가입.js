const id = document.getElementById("idInput");
const pw = document.getElementById("pwInput");
const pw2 = document.getElementById("pw2Input");
const equalPw = document.getElementById("equalPw");
const nm = document.getElementById("nmInput");
const nmConfirm = document.getElementById("nmConfirm");
const reset = document.getElementById("reset");
const submit = document.getElementById("submit");
const radio = document.getElementsByName("gender");
const tel = document.getElementById("telInput");
const email = document.getElementById("emailInput");

let idCon = 0;
let pwCon = 0;
let nmCon = 0;

id.addEventListener("keyup", function(){
    let regEx = /^[a-z][\w-_]{5,13}$/;

    if(regEx.test(id.value)){
        id.style.backgroundColor = "springgreen";
        id.style.color="black";
        idCon = 1;
    } else if(id.value == 0){
        id.style.backgroundColor = "transparent";
        id.style.color="black";
        idCon = 0;
    } else{
        id.style.backgroundColor = "red";
        id.style.color="white";
        idCon = 0;
    }
})



pw.addEventListener("keyup", function(){
    if(pw.value == pw2.value){
        if(pw.value == 0 && pw2.value == 0){
            equalPw.innerText = "";
            pwCon = 0;
        } else{
            equalPw.innerHTML = "<span id='equalPw' style='color:green'>비밀번호 일치</span>";
            pwCon = 1;
        }
    } else{
        equalPw.innerHTML = "<span id='equalPw' style='color:red'>비밀번호 불일치</span>";
        pwCon = 0;
    }
})

pw2.addEventListener("keyup", function(){
    if(pw.value == pw2.value){
        if(pw.value == 0 && pw2.value == 0){
            equalPw.innerText = "";
            pwCon = 0;
        } else{
            equalPw.innerHTML = "<span id='equalPw' style='color:green'>비밀번호 일치</span>";
            pwCon = 1;
        }
    } else{
        equalPw.innerHTML = "<span id='equalPw' style='color:red'>비밀번호 불일치</span>";
        pwCon = 0;
    }
})



nm.addEventListener("keyup", function(){
    const regEx = /^[가-힣]{2,5}$/;
    const regEx2 = /^[가-힣]{6,}$/;

    if(regEx.test(nm.value)){
        nmConfirm.innerHTML = "<span id='nmConfirm' style='color:green'>정상입력</span>";
        nmCon = 1;
    } else if(nm.value == 0){
        nmConfirm.innerText = "";
        nmCon = 0;
    } else{
        if(regEx2.test(nm.value)){
            nmConfirm.innerHTML = "<span id='nmConfirm' style='color:red'>5글자 초과</span>";
            nmCon = 0;   
        } else{
            nmConfirm.innerHTML = "<span id='nmConfirm' style='color:red'>한글만 입력하세요</span>";
            nmCon = 0;
        }
    }
})



reset.addEventListener("click", function(){
    id.style.backgroundColor = "transparent";
    equalPw.innerText = "";
    nmConfirm.innerText = "";
})

function validate(){
    let flag = 1;

    if(radio[0].checked + radio[1].checked == 0){
        alert("성별을 선택해주세요");
        flag = 0;
    } else{
        let regEx = /^0\d{1,2}\-\d{3,4}\-\d{4}$/;
        if(regEx.test(tel.value) == false){
            alert("전화번호의 형식이 올바르지 않습니다");
            flag = 0;
        } else{
            let regEx2 = /^\w+@\w+\.com$/;
            if(regEx2.test(email.value) == false){
                alert("이메일의 형식이 올바르지 않습니다");
                flag = 0;
            }
        }
    }

    let sum = idCon + pwCon + nmCon;
    console.log(sum);
    if(flag ==1 && sum != 3){
        if(idCon == 0) alert("아이디를 바르게 입력해주세요");
        else if(pwCon == 0) alert("비밀번호를 바르게 입력해주세요");
        else if(nmCon == 0) alert("이름을 바르게 입력해주세요")
    }
}