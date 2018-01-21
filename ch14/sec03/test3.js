// jjs < ch14/sec03/test3.js 명령으로 실행한다.

var javaNetPackage = java.net // JavaPackage 객체
var URL = java.net.URL // JavaClass 객체
var JMath = Java.type('java.lang.Math') // 자바스크립트 Math 객체와 충돌을 피한다.
JMath.floorMod(-3, 10)

var Url = java.net.Url // 철자 오류
Url // 존재하지 않는 패키지
Url = Java.type('java.net.Url') // 철자 오류로 예외가 일어난다.

var url = new URL('http://horstmann.com')
url = new java.net.URL('http://horstmann.com')
url = new (Java.type('java.net.URL'))('http://horstmann.com')

var entry = new java.util.AbstractMap.SimpleEntry('hello', 42)
entry
var Entry = Java.type('java.util.AbstractMap$SimpleEntry')
new Entry('hello', 42)
