<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
注意这里登录，不能放到web-inf里面，因为web-inf里面是通过接口在跳进去的
在web-inf外面的不需要接口，刚刚一直不行就是这个问题额我知道了哈
<form action="shiro/login" method="POST">
    username: <input type="text" name="username"/>
    <br><br>
    password: <input type="password" name="password"/>
    <br><br>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
