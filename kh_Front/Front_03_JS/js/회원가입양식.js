const id = document.getElementById("idInput");

id.addEventListener("keyup", function(){
    let regEx = /^(?=.*[a-z])(?=.*[0-9])[a-z0-9]{5,}$/;
    if(regEx.test(id.value)){
        document.getElementById("idResult").classList.remove("idError");
        document.getElementById("idResult").classList.add("idConfirm");
        document.getElementById("idResult").innerText = "아이디 사용 가능";
    } else{
        document.getElementById("idResult").classList.add("idError");
        document.getElementById("idResult").classList.remove("idConfirm");
        document.getElementById("idResult").innerText = "아이디 사용 불가능";
    }
})

const pw = document.getElementById("pwInput");

pw.addEventListener("keyup", function(){
    let regEx = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*\(\)])[a-zA-Z0-9!@#$%^&*\(\)]{8,}$/;
    if(regEx.test(pw.value)){
        document.getElementById("pwResult").classList.remove("pwError");
        document.getElementById("pwResult").classList.add("pwConfirm");
        document.getElementById("pwResult").innerText = "비밀번호 사용 가능";
    } else{
        document.getElementById("pwResult").classList.add("pwError");
        document.getElementById("pwResult").classList.remove("pwConfirm");
        document.getElementById("pwResult").innerText = "비밀번호 사용 불가능";
    }
})

const pw2 = document.getElementById("pw2Input");

pw2.addEventListener("keyup", function(){
    if(pw.value == pw2.value){
        document.getElementById("pw2Result").classList.add("pw2Confirm");
        document.getElementById("pw2Result").classList.remove("pw2Error");
        document.getElementById("pw2Result").innerText = "비밀번호 일치";
    } else{
        document.getElementById("pw2Result").classList.remove("pw2Confirm");
        document.getElementById("pw2Result").classList.add("pw2Error");
        document.getElementById("pw2Result").innerText = "비밀번호 불일치";
    }
})

const nm = document.getElementById("nameInput");

nm.addEventListener("keyup", function(){
    let regEx = /^[가-힣]{2,}$/;

    if(regEx.test(nm.value)){
        document.getElementById("nameResult").classList.add("nameConfirm");
        document.getElementById("nameResult").classList.remove("nameError");
        document.getElementById("nameResult").innerText = "양식 일치";
    } else{
        document.getElementById("nameResult").classList.remove("nameConfirm");
        document.getElementById("nameResult").classList.add("nameError");
        document.getElementById("nameResult").innerText = "양식 불일치";
    }
})

const tel = document.getElementById("telInput");

tel.addEventListener("keyup", function(){
    let regEx = /^010\-\d{3,4}\-\d{4}$/;

    if(regEx.test(tel.value)){
        document.getElementById("telResult").classList.add("telConfirm");
        document.getElementById("telResult").classList.remove("telError");
        document.getElementById("telResult").innerText = "양식 일치";
    } else{
        document.getElementById("telResult").classList.remove("telConfirm");
        document.getElementById("telResult").classList.add("telError");
        document.getElementById("telResult").innerText = "양식 불일치";
    }
})

const birth = document.getElementById("birth");
const noResult = document.getElementById("noResult");

birth.addEventListener("keyup", function(){
    let regEx = /^\d{6}$/;

    if(regEx.test(birth.value)){
        birth.classList.add("birthConfirm");
        birth.classList.remove("birthError");
    } else{
        birth.classList.remove("birthConfirm");
        birth.classList.add("birthError");
    }

    if(birth.classList.value == "birthConfirm" && no.classList.value == "noConfirm"){
        noResult.style.color = "green";
        noResult.innerText = "양식 일치"
    } else{
        noResult.style.color = "red";
        noResult.innerText = "양식 불일치"
    }   
})

const no = document.getElementById("no");

no.addEventListener("keyup", function(){
    let regEx = /^[1-4]{1}\d{6}/;
    
    if(regEx.test(no.value)){
        no.classList.add("noConfirm");
        no.classList.remove("noError");
    } else {
       no.classList.remove("noConfirm");
       no.classList.add("noError"); 
    }

    if(birth.classList.value === "birthConfirm" && no.classList.value === "noConfirm"){
        noResult.style.color = "green";
        noResult.innerText = "양식 일치"
    } else{
        noResult.style.color = "red";
        noResult.innerText = "양식 불일치"
    }   
})

const email = document.getElementById("email");

email.addEventListener("keyup", function(){
    let regEx = /^\w+@\w+\.com$/;

    if(regEx.test(email.value)){
        document.getElementById("emailResult").classList.add("emailConfirm");
        document.getElementById("emailResult").classList.remove("emailError");
        document.getElementById("emailResult").innerText = "양식 일치";
    } else{
        document.getElementById("emailResult").classList.remove("emailConfirm");
        document.getElementById("emailResult").classList.add("emailError");
        document.getElementById("emailResult").innerText = "양식 불일치";
    }
})

document.getElementById("btn").addEventListener("click", function(){
    if(document.getElementById("idResult").classList.value == "idConfirm" &&
    document.getElementById("pwResult").classList.value == "pwConfirm" &&
    document.getElementById("pw2Result").classList.value == "pw2Confirm" &&
    document.getElementById("nameResult").classList.value == "nameConfirm" &&
    document.getElementById("telResult").classList.value == "telConfirm" &&
    document.getElementById("emailResult").classList.value == "emailConfirm"){
        alert("제출이 완료되었습니다.");
    } else{
        alert("작성이 잘못되었습니다");
    }
}) 