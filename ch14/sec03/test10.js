// jjs ch14/sec03/test10.js 명령으로 실행한다.
// (재지정을 사용하지 않음)

list = new java.util.ArrayList()
try {
   var first = list.get(0)
   print(first)
} catch (e) {
   if (e instanceof java.lang.IndexOutOfBoundsException)
      print('list is empty')     
}
