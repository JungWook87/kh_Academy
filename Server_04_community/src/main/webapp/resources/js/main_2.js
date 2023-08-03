console.log("main.js loaded.");
console.log("project check");


// 회원 정보 조회 비동기 통신 (AJAX)
document.getElementById("select1").addEventListener("click", function() {

    const input = document.getElementById("in1");
    const div = document.getElementById("result1");
    
    // AJAX 코드 작성 (jQuery 방식) -> jQuery 라이브러리가 추가 되어있는지 확인!!
    $.ajax({
        url : "member/selectOne",
        data : {"memberEmail" : input.value},
        type: "POST",
        dataType: "JSON", // dataType : 응답데이터 형식 지정
                        // -> JSON으로 지정 시 자동으로 JS객체로 변환
        success: function(member) {
			console.log(member);
			
			
			if(member != null){ // 회원 정보 존재 O

                // 2) ul 요소 생성
                const ul = document.createElement("ul");

                // 3) li 요소 생성 * 5 + 내용 추가
                const li1 = document.createElement("li");
                li1.innerText = "이메일 : " + member.memberEmail;

                const li2 = document.createElement("li");
                li2.innerText = "닉네임 : " + member.memberNickname;

                const li3 = document.createElement("li");
                li3.innerText = "전화번호 : " + member.memberTel;

                const li4 = document.createElement("li");
                li4.innerText = "주소 : " + member.memberAddress;

                const li5 = document.createElement("li");
                li5.innerText = "가입일 : " + member.enrollDate;

                // 4) ul에 li를 순서대로 추가
                ul.append(li1, li2, li3, li4, li5);

                // 5) div에 ul 추가
                div.append(ul);

            } else { // 회원 정보 존재 X

                // 1) h4 요소 생성
                const h4 = document.createElement("h4");

                // 2) 내용 추가
                h4.innerText = "일치하는 회원이 없습니다";

                // 3) 색 추가
                h4.style.color = "red";

                // 4) div에 추가
                div.append(h4);
            }

        }, 
        error: function(request, status, error) {
			console.log("ajax 에러발생");
			console.log("상태코드 : " + request.status); // 404, 500
        }
    })


});

const selectTable = document.getElementById("selectTable");

(function(){
    $.ajax({
        url : "member/selectAll",
        type: "GET",
        dataType: "JSON", 
        success : function(memberList){
            
            for(let i = 0; i < memberList.length; i++){
                const tr = document.createElement("tr");
                
                const td1 = document.createElement("td");
                td1.innerText = memberList[i].memberNo;
                
                const td2 = document.createElement("td");
                td2.innerText = memberList[i].memberEmail;
                
                const td3 = document.createElement("td");
                td3.innerText = memberList[i].memberNickname;
                
                tr.append(td1, td2, td3);
                selectTable.append(tr);

            }
        },

        error: function(request, status, error) {
			console.log("ajax 에러발생");
			console.log("상태코드 : " + request.status); // 404, 500
        }
    })
})();


window.setInterval(function(){
    
    $.ajax({
        url : "member/selectAll",
        type: "GET",
        dataType: "JSON", 
        success : function(memberList){
            
            
            if(memberList.length != 0){
                
                const selectTable = document.getElementById("selectTable");

                selectTable.innerHTML = "<table border='1' id='selectTable'><tr><th>회원번호</th><th>이메일</th><th>닉네임</th></tr></table>";
                
                for(let i = 0; i < memberList.length; i++){

                    const tr = document.createElement("tr");
                    
                    const td1 = document.createElement("td");
                    td1.innerText = memberList[i].memberNo;
                    
                    const td2 = document.createElement("td");
                    td2.innerText = memberList[i].memberEmail;
                    
                    const td3 = document.createElement("td");
                    td3.innerText = memberList[i].memberNickname;
                    
                    tr.append(td1, td2, td3);
                    selectTable.append(tr);

                }
            } else{
                console.log("회원이 없습니다.");
            }

        },

        error: function(request, status, error) {
			console.log("ajax 에러발생");
			console.log("상태코드 : " + request.status); // 404, 500
        }
    })
    
}, 10000);