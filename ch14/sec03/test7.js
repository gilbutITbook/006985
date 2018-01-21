// jjs < ch14/sec03/test7.js 명령으로 실행한다.

var names = java.util.List.of('Fred', 'Wilma', 'Barney')
var first = names[0]
names[0] = 'Duke'
for each (var name in names) print(name)
var scores = new java.util.HashMap
scores['Fred'] = 10 // scores.put('Fred', 10)을 호출한다.
for each (var e in scores.entrySet()) print(e.key + "->" + e.value)
