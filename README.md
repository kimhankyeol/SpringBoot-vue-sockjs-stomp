# SpringBoot-vue-sockjs-stomp
스프링부트로 웹소켓 이용해 실시간 채팅 구현 (mqtt 통신)

## MQTT
MQTT(Message Queueing Telemetry Transport)는 2016년 국제 표준화 된 (ISO 표준 ISO/IEC PRF 20922) 발행-구독(Publish-Subscribe) 기반의 메시지 송수신 프로토콜이다.

### 브로커를 통한 통신
MQTT의 발행-구독 메시징 패턴은 오로지 브로커를 통해서만 통신할 수 있으며 개설된 Topic에 메시지를 발행하면 해당 Topic을 구독하는 클라이언트들에게 메시지를 발행할 수 있다.
그렇기에 일대일, 혹은 일대다의 통신이 모두 가능하다.
<p align="center"><img src="https://miro.medium.com/max/1170/1*lKWgSNIYc1Pil5FFoAHMkA.png" /></p>
## 구현 방법
pub 서버는 발행 서버 
sub 서버는 구독 서버

메시지 브로커를 pub에서 구현 하고 sub는 vue단에서 sockjs , stomp client 를 통해 pub 서버에 메시지 브로커를 구독한뒤 데이터를 조회한다.
sub 서버에서는 실시간 채팅을 위해 pub 서버에 pub/* 로 데이터를 보내주고(데이터 발행) , pub 브로커에 데이터가 가면 다시 sub로 데이터를 조회하면 실시간 채팅 구현 완료

### 문제점 
구현에는 큰 문제가 없었지만 역시 대부분의 문제는 CORS 설정 문제에 있다 .
pub서버에 config 폴더에 FilterConfig 와 WebSockConfig 를 참고하면 된다.


#### 더 문제점 
어렵다.. 공부해야된다 통신..

