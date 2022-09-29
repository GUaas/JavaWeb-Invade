function check(form){
    var accountName = $("#accountName"),$password = $("#password");
    var accountName = accountName.val(),password = $password.val();
    if(!accountName || accountName == ""){
        showMsg("请输入用户名");
        form.accountName.focus ();
        return false;
    }
    if(!password || password == ""){
        showMsg("请输入密码");
        form.password.focus ();
        return false;
    }
    var password = document.getElementById("password").value;
    var accountName = document.getElementById("accountName").value;
        if(accountName=="admin"&&password=="123456"){
            window.location.href = '../html/userinterface.html';
            }
        else{
            alert("您填写的用户名或密码有误，请在输入一遍")
        }
    }
function showMsg(msg){
    $("#CheckMsg").text(msg);
}
var left =  0;
var timer;
run();
function run(){
    if(left <= -3435){
        left = 0;
    }
    imglist.style.marginLeft = left + 'px';
    var n = (left % 1145 == 0) ? n = 2400 : n = 0.01;
    left -= 5;
    timer = setTimeout(run, n)
}
function llbutton(){
    x=document.getElementById("lle").value;
	if(x)
	{
        i = x
        window.open('http://c.biancheng.net/'+ i);
	}
}

