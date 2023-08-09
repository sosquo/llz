function check() {
    var un = document.getElementById("username").value;
    var pd = document.getElementById("password").value;
    if (un == "") {
        alert("请输入账号！");
    } else if (pd == ""){
        alert("请输入密码！");
    }
}