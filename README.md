# TEAM3
# 1. 앱 이름

TrendChat


# 2. 앱 설명

노인분들을 위한 SNS어플 개발을 하려고 했으나 기존 카카오톡 어플에서 UI만 변경하는 것 뿐이여서 다른 어플에 새롭게 게시판 기능을 추가하는 것으로 방향을 정하였다. (기존 firebase friendly chat app 에서 UI 변경 및 게시판 UI를 추가한 후 연령대 별로 게시판 기능을 추가 하는 것으로 정하였다.)

트랜드 챗은 기존 firebase friendly chat의 채팅 기능을 사용 할 수 있다. 또한 채팅 기능 옆에 게시판 버튼을 클릭하면 게시판 기능으로 옮겨간다. 게시판 기능은 연령대를 10대, 20대, 30대, 40대, 50대 이상으로 나눈 후 각 연령대를 클릭하면 각 연령대의 현재 네이버 급상승 검색어 1~20위에 해당하는 키워드에 대한 뉴스를 보여준다. 


# 3. 앱 설치 방법 및 사용법

## 앱 설치 방법

trendChat.apk 파일을 안드로이드 기기에 다운로드하고, 파일을 실행하여 설치한다.
<div>
   <img width = "200" src="https://user-images.githubusercontent.com/43198806/50041112-da58f900-0092-11e9-8d7e-b244aeb46a70.png">
   <img width = "200" src="https://user-images.githubusercontent.com/43198806/50041134-328ffb00-0093-11e9-9c47-f6b3c24953ab.png">
   <img width="200" src="https://user-images.githubusercontent.com/43198806/50041136-43407100-0093-11e9-8b34-17089fe8c24c.png">
   </div>

## 앱 사용법
1. TrendChat 어플리케이션 설치 후 google 계정으로 로그인하여 사용한다.

<img width="200" src="https://user-images.githubusercontent.com/43198806/50042992-f61ec800-00af-11e9-91b6-65fc28f54049.png"></img>

2. 게시판 탭을 누른 후, 본인 연령대의 탭을 누르면 본인 연령대의 관심 기사가 키워드 당 2개의 기사씩 나오게 됩니다.
<div>
   <img width = "200" src="https://user-images.githubusercontent.com/43198806/50042998-0d5db580-00b0-11e9-8c09-38b3cc0f860a.png">
   <img width = "200" src="https://user-images.githubusercontent.com/43198806/50043001-1cdcfe80-00b0-11e9-9712-980d7e8ca136.png">
   <img width="200" src="https://user-images.githubusercontent.com/43198806/50043008-30886500-00b0-11e9-8e26-84c5f0a15931.png">
   </div>


# 4. 주요 기능 및 관련 코드/API 설명 

## 1) 게시판 UI 생성

### 1.1 연령대 별 버튼 생성

<img width="500" src="https://user-images.githubusercontent.com/43198806/50043510-c45e2f00-00b8-11e9-86cd-eea1286654a3.PNG"></img>

Menuactivity class를 생성하고, 10대부터 50대 이상까지 총 5개의 버튼을 생성한다.

### 1.2 버튼 눌렀을 때의 Event처리

<img width="500" src="https://user-images.githubusercontent.com/43198806/50043519-dd66e000-00b8-11e9-921a-bc5bfc880d22.PNG"></img>

사용자가 버튼을 눌렀을 때 setOnClickListener를 통해 Board10sActivity.class을 실행하게 되며, 변수 age는 사용자가 누른 연령대로 값을 받게 된다.

## 2) Data와 Item에 대한 View생성

### 2.1 기사내용을 넣을 ArrayList 생성

<img width="500" src="https://user-images.githubusercontent.com/43198806/50043571-e4dab900-00b9-11e9-8f09-c4aa7d067ca3.PNG"></img>

### 2.2 activity_board10s 레이아웃의 새로운 뷰 생성

<img width="500" src="https://user-images.githubusercontent.com/43198806/50043580-ff149700-00b9-11e9-8c13-31b671dc58bb.PNG"></img>

### 2.3 View의 content를 대체

<img width="500" src="https://user-images.githubusercontent.com/43198806/50043584-0cca1c80-00ba-11e9-927d-a41161178f78.PNG"></img>

MyItemArrayList에 저장된 내용을 이 클래스에서 생성한 변수에 문자화하여 가져온다. 

예를 들면, MyItemArrayList에서 title에 담긴 내용을 mytitle에 문자화하여 가져온다.

Firbase friendly chat app https://github.com/firebase/friendlychat-android

# 5. 개발자 정보

## 팀원 이름 (Github ID) 및 맡은 역할

소민진 (kzxwer): 네이버 검색 api 적용, xml파일 parsing작업 개발, 코드 설명

이연정 (LeeYunJung): 사용자 인터페이스 개발 및 api 적용 수정, 코드 설명, 프로젝트 디버깅, 최종프로젝트 발표

강수지 (szfrost): firebase chat app 적용 및 사용자 인터페이스 개발, 어플 아이콘 제작, ppt제작, 최종 발표 대본 작성

손수민 (GODSOOMIN): 크롤링 이용 검색 키워드 적용, 코드 옮기기, 코드 설명, Readme 파일 작성, git project 관리, 프로젝트 디버깅

현혜진 (hyejinhyun): firebase chat app 적용 및 사용자 인터페이스 개발, ppt 제작, Readme 파일 작성, 최종 발표 대본 초안

# +. 브랜치 정보
팀 프로젝트 저장소에서 브랜치하고 커밋 작업 하지 않고 각자 개인 저장소에서 clone 했기 때문에 저장소에 커밋 내용 저장되어 있지 않아서 문서로 작성합니다.

1. firebase friendly chat 가져오기 && ui 수정 (게시판 ui 추가) 11/28 (수)

   https://github.com/hyejinhyun/HyejinFriendlyChat - 수지, 혜진, 연정

2. 게시판 기능에 네이버 검색 api 적용 12/5 (수)

   https://github.com/kzxwer/MinjinFriendlyChat_scrollable - 민진

3. 적용된 검색 api의 검색 키워드 적용 12/5 (수)

   https://github.com/GODSOOMIN/SoominFriendlychatreal - 수민

4. api적용 UI 수정 12/10 (일)

   https://github.com/LeeYunJung/YunJungFriendlyChat2 - 연정 

5. 코드 주석 추가 및 메뉴 UI 변경 12/12 (수) - 민진, 혜진

6. APP ICON 디자인 12/12 (수) - 수지

7. 디버깅 프로젝트 푸쉬 12/12 (수) - 연정, 수민

8. 여러 검색키워드에 대한 뉴스 불러오기 12/14 (금) - 민진

   https://github.com/kzxwer/TrendChat-master

9. 주석 추가 12/14 (금) - 연정

   https://github.com/LeeYunJung/TrendChat-yunjung
   
10. apk 추출 및 readme 수정 12/15(토) - 혜진




# 라이센스 정보
See [LICENSE](https://github.com/GODSOOMIN/TEAM3/blob/master/LICENSE), Apache License 2.0
