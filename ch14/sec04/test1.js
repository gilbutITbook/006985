// jjs -scripting ch14/sec04/test1.js 명령으로 실행한다.
// (리눅스/유닉스/macOS)

var output = `ls -al`

print(output)

var output2 = $EXEC('grep -v java', `ls -al`)

print(output2)
