// jjs --language=es6 < ch14/sec03/test8.js 명령으로 실행한다.

var square = function(x) { return x * x}
   // 오른쪽은 익명 함수다.
var result = square(2) 
   // () 연산자는 함수를 호출한다.
result

var words = Java.to('Mary had a little lamb'.split(' '), Java.type('java.lang.String[]'))
java.util.Arrays.sort(words, function(s, t) { return s.length - t.length })
java.util.Arrays.toString(words)

java.util.Arrays.sort(words, (s, t) => s.length - a.length)
java.util.Arrays.toString(words)
