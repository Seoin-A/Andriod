# Chapter 1. Andriod - FirstAndroid

## 1) 프로젝트 생성하기
## 2) MainActivity.kt 코드 파일 분석
## 3) 레이아웃 생성 및 분석
## 4) 가상 에뮬레이터 생성
## 5) 실제 기기 실행

- USB 유선 연결 확인

- Wifi 무선 연결 확인

<br><br>
# Chapter 2. Android - Basic
## 1) Activity & Fragment
> 1. 안드로이드 4대 구성 요소
>- **액티비티 : 사용자에게 유저 인터페이스 제공**
>- 서비스 : 백그라운드 동작 수행
>- 브로드캐스트 리시버 :  Brodcast + Receiver
>- 콘텐트 프로바이더(제공) : Content + Provider <=> 콘텐트 리졸버(수취)

> 2. Activity 생명 주기
>- onCreate -> onStart => onResume -> 실행 중 -> onPause -> onStop -> onDestroy -> Activity 종료
>- onRestart : onStop -> onStart
>  <br>

> ![image](https://github.com/Seoin-A/Andriod/assets/129828463/d9befb54-846e-46dc-bb98-c26facf42334)

 3. Fragment
>- 액티비티 안에 종속되어야 한다
>- 액티비티의 생명주기에 영향을 받지만, 고유의 생명주기가 존재한다.
>- 액티비티가 실행 중일 때 프래그먼트를 추가하거나 제거할 수 있다.
>     
>  ![image](https://github.com/Seoin-A/Andriod/assets/129828463/1e862e65-7e7a-4ec8-b554-872249e9291d)
>
>  - onAttach() : 프래그먼트가 액티비티에 더해지고 나서 실행되는 함수
>  - onCreateView() : 프래그먼트에 그릴 뷰를 그릴떄 생성하는 함수 ( 뷰를 반환)
>  - onActivityCreated() : 액티비티 실행 이후 프래그먼트에서 해줘야 할 작업이 있을 경우에 작성
>
> ![image](https://github.com/Seoin-A/Andriod/assets/129828463/645a3dd2-c750-4111-8f95-79f86cb4e0d2)
>
> - onDestroyView : view 리소스 사용해제 ( <=> onCreateView() )
> - onDetach() : 액티비티와 연결을 완전히 끝 ( <=> onAttatch() )

<br>

## 3) VIew
 - view
>    1. 위젯 : 볼 수 있는 뷰, 유저와 상호작용
>    2. view Group : 그릇 역활, 배치, 레이아웃
>      
>      ![image](https://github.com/Seoin-A/Andriod/assets/129828463/bcc23a11-35af-4365-bd8c-7a6ddcd67890)
>      
> - view 공통 속성 :
> - view 종류
>  



