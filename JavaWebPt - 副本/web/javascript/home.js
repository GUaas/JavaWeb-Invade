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
