#!/data/apps/jdk1.8.0/bin/jjs

// 위의 경로(/data/apps/jdk1.8.0)를 자신의 JDK 설치 위치로 변경한 후 다음과 같이 실행한다.
// chmod +x ch14/sec04/test3.js
// ch14/sec04/test3.js -- Fred

if (!arguments[0]) {
    print("Usage: test3 username")
    exit(1)
}

var javaHome = $ENV.JAVA_HOME
print(javaHome)
print("Hello ${$ARG[0]}, please reenter your name")
var username = readLine('Username: ')
var password = java.lang.System.console().readPassword("${username}, please enter your password: ")
print(new java.lang.String(password).replaceAll('.', '*'))
