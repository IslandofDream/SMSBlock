# SMSBlock

안드로이드 스터디의 일환으로 일주일에 한 번씩 주제를 정하여 적절한 문제예시를 들고 예제코드를 작성하였습니다. 

### <스터디 전체 내용>

[https://chartreuse-kookaburra-a53.notion.site/a6570dd9326746ee9d9722273b1fe5ce?v=60f10b6351ae4679b7cd82a2c7fcabba](https://www.notion.so/a6570dd9326746ee9d9722273b1fe5ce)

### <예제 코드 주제>
**문제**

BroadcastReceiver에서 메세지 클릭시 앱에서 SMS를 받고, 문자보관함으로 이동하지 않게 하는 방법은 뭐가 있을까?

**정답**

abortBroadcast()를 사용해야한다. 이것은 sendOrderedBroadcast사용시에만 사용할 수 있다. 우선순위도 그럼 최대로 높혀놔야겠지?
