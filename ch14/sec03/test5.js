// jjs < ch14/sec03/test5.js 명령으로 실행한다.
// 
// *주의: JDK 8 최신 버전(8u162)의 jjs로는 제대로 작동하지만, JDK 9(현재 9.0.4)의 jjs로는 구현체 버그 때문에 제대로 작동하지 않는다.
// JDK 9.0.4의 jjs로 실행하면 price = 10 문장 실행 후 price의 클래스가 java.lang.Double로 유지되어,
// 반대로 두 번째 format이 제대로 작동하고 세 번째 format에서 예외가 일어난다.
// (Number 함수 호출 직후에는 타입이 java.lang.Double이지만 format 메서드의 인수로 사용되는 순간 java.lang.Integer로 바뀐다.)

'Hello'.slice(-2.99)
var price = 9.95
java.lang.String.format('Price: %.2f', price)
price = 10
java.lang.String.format('Price: %.2f', price)
   // 오류: f 포맷은 java.lang.Integer에 유효하지 않다.
java.lang.String.format('Price: %.2f', Number(price))
