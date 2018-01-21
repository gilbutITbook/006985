// jjs ch14/sec03/test9.js 명령으로 실행한다.
// (재지정을 사용하지 않음)

var RandomIterator = Java.extend(java.util.Iterator, {
   next: function() Math.random(),
   hasNext: function() true
}) // RandomIterator는 클래스 객체다.
var iter = new RandomIterator() // 클래스 객체 RandomIterator로 인스턴스를 생성한다.
print(iter.next())
print(iter.next())
print(iter.next())

var task = new java.lang.Runnable(function() { print('Hello') })
task.run()

iter = new java.util.Iterator {
   count: 10,
   next: function() { this.count--; return Math.random() },
   hasNext: function() this.count > 0 
}

while (iter.hasNext()) print(iter.next())

var arr = new (Java.extend(java.util.ArrayList)) {
   add: function(x) {
      print('Adding ' + x);
      return Java.super(arr).add(x)
   }
}

arr.add('Fred')
print(arr)
