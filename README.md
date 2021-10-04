# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
1 Game (야구 게임)
	1.1 새로운 라운드 시작 기능
	1.2 라운드 종료 이후 Game 완전종료 or 새라운드 시작 선택 기능
		1.2.1 1입력 : 새 라운드시작
		1.2.2 2입력 : 게임 완전종료
		1.2.3 1,2 이외의 값 입력 : [ERROR]메시지 출력과 함께 입력 대기 유지
2 Round (야구 게임의 한 라운드)
	2.1 Round시작 시 정답 배열 생성 
		2.1.1 1~9중 중복되지 않는 숫자만으로 구성
		2.1.2 배열의 길이는 3
	2.2 사용자 숫자 입력 기능
		2.2.1 사용자 입력값 조건
			2.2.1.1 길이 : 3자리
			2.2.1.2 1~9사이의 숫자만 가능
	2.3 사용자 입력 숫자와 해당 라운드의 정답 비교 후 스트라이크, 볼 갯수 저장
		2.3.1 스트라이크 : 숫자의 존재여부와 위치 모두 동일
		2.3.2 볼 : 다른 위치에 숫자 존재		
	2.4 3스트라이크(3자리 숫자 모두 존재&위치 동일) 발생 시 라운드 종료
