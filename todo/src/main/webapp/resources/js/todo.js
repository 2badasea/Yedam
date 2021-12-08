
let url = "http://localhost/prj/todoSelect" ;
const xhttp = new XMLHttpRequest();
xhttp.onload = function() { selectAll(this);}  // 이때 this는 xhttp 자체를 가리킨다. 
xhttp.open("GET", url);
xhttp.send();  // server에 보낸다. 
//전체 조회하는 걸, fetch 함수를 적용해서 밑에 작성

function todoSelect(){
    fetch("http://localhost/prj/todoSelect")
    .then(response => response.json())
    .then((data) => {
        console.table(data);
    });
}
todoSelect();


function selectAll(xhr){
    //ajax fetch(), XmlHttpRequest
    let datas = JSON.parse(xhr.responseText);
    for(data of datas){
        var li = document.createElement("li");
        var t = document.createTextNode(data.contents);
        li.appendChild(t);
        var span = document.createElement("span");
        var txt = document.createTextNode("\u00D7");
        span.className = "close";
        li.setAttribute("data-no", data.no);
        if(data.todoyn ==1){
            li.className = "checked";
        }
        span.appendChild(txt);
        li.appendChild(span);
        document.getElementById("myUL").appendChild(li);

    }
}

// Add a "checked" symbol when clicking on a list item
var list = document.querySelector('ul');
list.addEventListener('click', function(ev) {
  if (ev.target.tagName === 'LI') {
    ev.target.classList.toggle('checked');
    //update ajax 호출. 

  } else if(ev.target.tagName === 'SPAN') {
     // li태그 삭제. 
     //ev.target.querySelector("span").classList.remove("close");
     ev.target.parentElement.remove();
     // 삭제 ajax호출
     let no = ev.target.parentElement.getAttribute("data-no");
     todoDelete(no);
  }
}, false);


// function todoDelete(){
//     let url = "http://localhost/prj/todoDelete?no=" + no;
//     const xhttp = new XMLHttpRequest();
//     xhttp.onload = function() {
//         //alert('')
//     }
//     xhttp.open("GET", url);
//     xhttp.send(); 
// }
// 위를 밑으로 fetch함수 적용해서 다시 식 세우기.
function todoDelete(){
    fetch("http://localhost/prj/todoDelete?no=10", {
        method : 'GET'
    })
    .then(response => response.json())
    .then((data) => {
        console.table(data);
    })
}
//todoDelete();


// function todoInsert(contents){
//     xhttp.open("post", "")
//     xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
// }
// 위를 밑으로 fetch를 적용하여 작성.
function todoInsert(){
    fetch("http://localhost/prj/todoInsert", {
        method : 'post',
        headers : {'Content-Type': 'application/x-www-form-urlencoded'},
        body : 'contents=공부'
    })
    .then(response => response.json())
    .then((data) => {
        console.table(data);
    });
}
//todoInsert();

// Create a new list item when clicking on the "Add" button
function newElement() {
  var li = document.createElement("li");
  var inputValue = document.getElementById("myInput").value;
  var t = document.createTextNode(inputValue);
  li.appendChild(t);
  if (inputValue === '') {
    alert("You must write something!");
  } else {
    document.getElementById("myUL").appendChild(li);
    //ajax요청. 
    todoInsert(inputValue);
  }
  document.getElementById("myInput").value = "";

  var span = document.createElement("SPAN");
  var txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  li.appendChild(span);

  
}