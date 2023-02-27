const id = document.getElementById("idInput");

id.addEventListener("keyup", function(){
    let regEx = /^[a-z]{5,}$/;
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
    let regEx = /^[a-zA-Z\d]{8,}$/;
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
    let regEx = /^010\-\d{3,4}\-\d{4,4}$/;

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
