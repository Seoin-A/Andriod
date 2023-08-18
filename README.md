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
1. 안드로이드 4대 구성 요소
 <details>
 <summary> </summary> 
  
  - **액티비티 : 사용자에게 유저 인터페이스 제공**
  - 서비스 : 백그라운드 동작 수행
  - 브로드캐스트 리시버 :  Brodcast + Receiver
  - 콘텐트 프로바이더(제공) : Content + Provider <=> 콘텐트 리졸버(수취) 

</details><br>

2. Activity 생명 주기
<details>
<summary> </summary> 
 
- onCreate -> onStart => onResume -> 실행 중 -> onPause -> onStop -> onDestroy -> Activity 종료
- onRestart : onStop -> onStart

 ![image](https://github.com/Seoin-A/Andriod/assets/129828463/d9befb54-846e-46dc-bb98-c26facf42334)
 
</details><br>   

3. Fragment
<details>
<summary> </summary> 
 
- 액티비티 안에 종속되어야 한다
- 액티비티의 생명주기에 영향을 받지만, 고유의 생명주기가 존재한다.
- 액티비티가 실행 중일 때 프래그먼트를 추가하거나 제거할 수 있다.
     
  ![image](https://github.com/Seoin-A/Andriod/assets/129828463/1e862e65-7e7a-4ec8-b554-872249e9291d)

  - onAttach() : 프래그먼트가 액티비티에 더해지고 나서 실행되는 함수
  - onCreateView() : 프래그먼트에 그릴 뷰를 그릴떄 생성하는 함수 ( 뷰를 반환)
  - onActivityCreated() : 액티비티 실행 이후 프래그먼트에서 해줘야 할 작업이 있을 경우에 작성

 ![image](https://github.com/Seoin-A/Andriod/assets/129828463/645a3dd2-c750-4111-8f95-79f86cb4e0d2)

 - onDestroyView : view 리소스 사용해제 ( <=> onCreateView() )
 - onDetach() : 액티비티와 연결을 완전히 끝 ( <=> onAttatch() )

</details>
<br>

## 2) VIew
1. view
<details>
<summary></summary> 
 
   >- 위젯 : 볼 수 있는 뷰, 유저와 상호작용
    - view Group : 그릇 역활, 배치, 레이아웃
    ![image](https://github.com/Seoin-A/Andriod/assets/129828463/8dc9ad0d-28c6-4c40-9518-e1a7a505a378)

</details>
<br>

2. view 공통 속성
<details>
<summary></summary> 
 
>    * 너비와 높이
      ![image](https://github.com/Seoin-A/Andriod/assets/129828463/579d09a5-94df-493f-92d9-d3483f47ced3)
        1. matcj_parent : 부모 레이아웃과 맞추기
        2. wrap_content : 컨텐츠에 맞추기
        3. 직접 지정 : dp를 직정 지정
    * dp : 픽셀로 지정할 경우, 화면의 크기는 같더라도 해상도가 다르면 크기가 달라진다. => density-independent pixel. dp를 사용하면 사용자의 해상도를 고려하지 않아도 됨

>    * 패딩과 마진
      ![image](https://github.com/Seoin-A/Andriod/assets/129828463/8caf4c77-c672-4090-9408-3b8b8c528ee6)

</details><br>

 3. view 종류
<details>
<summary></summary>
 
    - TextVIew : 텍스트를 보여주는 뷰
    - sp : 글자 크기를 표현하는 단위 => 큰 시스템 글자 선택이나 보통 시스템 글자 선택에 따라 달라지도록 하기 위해 sp를 사용한다
>   - ImageVIew
>      - ScaleType
>         1. fitCenter : 이미지 뷰의 가로나 세로 둘 중 하나의 길이로 고정하고 나머지 쪽은 여백으로 처리한다.
>         2. fitXY : 이미지뷰에 맞게 x와 y를 연장한다 (번형 발생 )
>         3. centerCrop : 이미지뷰의 중앙에 맞추고 나머지 부분은 잘라준다
>         4. center : 원본 이미지 크기 그대로 중앙에 맞춘다.
         ![image](https://github.com/Seoin-A/Andriod/assets/129828463/4cdda1ca-5d36-4458-83b3-880df4513a35)  
 
     - Button  : TextView와 동일
     
<br>

>    - EditText
>      ![image](https://github.com/Seoin-A/Andriod/assets/129828463/62d4f8f2-56ef-4884-84ab-391b30da2831)


</details><br>


## 3) Layout
1. Layout이란
    <details><summary></summary>뷰 그룹의 일종으로 뷰나 다른 레이아웃을 배치하는 역할</details>

2. 대표적인 5가지 레아이웃
    <details>
        <summary></summary>
         
   ![image](https://github.com/Seoin-A/Andriod/assets/129828463/65970159-7e24-44a3-be78-d5681dbe8e89)
        
         - 리니어 레이아웃 : 수직 or 수평방향으로 차례로 위치
         - 상대적 레이아웃 : 부모 or 다른 뷰를 기준으로 해당 뷰를 위치
         - 컨스트레인트 레이아웃 : 수직방향과 수평방향에 뷰를 제약하여 위치
         - 테이블 레이아웃 : 테이블 형태로 뷰를 위치
         - 프레임 레이아웃 : 액자처럼 위치
         
   </details>

3. 리니어레이아웃
     <details>
         <summary> </summary>
      
      1) 리니어 레이아웃이란
       ![image](https://github.com/Seoin-A/Andriod/assets/129828463/e0dec857-4f0f-4227-8f64-50bd3fceddba)
    
        - vertical : 수직 방향
          - layout_gravity : start, center, end => 수평 정렬
        - horizontal : 수평 방향
          - layout_gravity : top, center, bottom => 수직 정렬
        - weight : 비중 지정
        - weightSum : 전체 비중 지정 
    
     </details>

 
4. 상대적 레이아웃 ( Relative Layout)
    <details>
        <summary></summary>
        
        1) 상대적 레이아웃이란?      다른 뷰를 기준으로 위치 


    </details> 

 

 



