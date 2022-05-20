Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario Outline: Today is or is not Friday
    Given 오늘은 "<day>" 요일이다
    When 금요일인지 물으면
    Then 예산되는 답변 "<answer>"을 받아야 함

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |