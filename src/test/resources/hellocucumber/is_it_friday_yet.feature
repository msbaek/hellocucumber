Feature: 오늘은 금요일인지 확인하기
  모든 사람들은 오늘이 금요일인지 알고 싶어한다

  Scenario: 일요일은 금요일이 아니다
    Given 오늘은 일요일이다
    When 오늘이 금요일인지 물으면
    Then "Nope"이라는 답을 얻어야 함

  Scenario: 금요일은 금요일이다
    Given 오늘은 금요일이다
    When 오늘이 금요일인지 물으면
    Then "TGIF"이라는 답을 얻어야 함