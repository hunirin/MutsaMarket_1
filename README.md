♻️ 멋사 마켓_MiniProject_Basic_LeeGwnaghun
=============
🌐 멋사 마켓_ERD
--------------
 <img src="erd.png" width="500">

## ✅ Project Infomation
#### 🔸 개발 기간: 23. 06. 29 ~ 23. 07. 04
#### 🔸 소개
> 사용자가 중고 물품을 자유롭게 올리고, 댓글을 통해 소통하며, 최종적으로 구매 제안에 대하여 수락할 수 있는 형태의 중고 거래 플랫폼
#### 🔸 주요 기능
- Postman을 통해 POST/GET/PUT/DELETE 등 물품을 등록, 조회, 수정, 삭제할 수 있다.
- 물품에 댓글을 달고, 조회, 수정, 삭제를 할 수 있다.
- 물품에 거래 제안(금액)을 할 수 있고, 조회 및 수정, 삭제를 할 수 있다.

## ✅ Project Guide
#### 🔸 요구사항
    • IntelliJ 
      - sdk : graalvm-ce-19 java version "19.0.2"
      - Language level: 17 - Sealed types, always-stric floating-point semantics
    • Postman 2.1
#### 🔸 설치 방법
    $ git clone https://github.com/likelion-backend-5th/MiniProject_Basic_LeeGwanghun
#### 🔸 테스트 방법
```MiniProject_Collection.json``` 파일을 Postman으로 불러와서 양식에 맞추어 작성

## ✅ update
#### 🔸 1일차
     물품 등록, 조회, 수정, 이미지 첨부, 삭제 기능 추가
#### 🔸 2일차
     물품에 대한 댓글 등록, 조회, 수정, 삭제, 댓글에 대한 답글 기능 추가
#### 🔸 3일차
     물품에 대한 구매 제안 등록, 조회, 수정, 삭제 기능 추가
     구매 제안에 대한 답변 등록, 물품에 대한 상태 변경 기능 추가

## ✅ feedback
#### 1️⃣ 결과창에 필요없는 필드값이 나옴
    - GET 사용시 password까지 나옴
#### 2️⃣ Dto와 Entity를 정확하게 구분해서 사용하지 못함
    - Dto는 Controller / Entity는 Service로 막연하게 알고있으나 되는대로 사용함
#### 3️⃣ 중복된 @PutMapping 사용을 함
    - Proposal을 PUT할 때 URL만 바꿔서 세개 만듦
    - PutMapping 하나에 넣을 방법을 모름
#### 4️⃣ 구매 제안 부분 구현 못함
    - 구매 제안이 확정될 경우, 확정되지 않은 다른 구매 제안의 상태는 모두 거절이 된다.

## ✅ Info
### 이광훈 ☺️
#### hun053@naver.com
#### https://github.com/hunirin

