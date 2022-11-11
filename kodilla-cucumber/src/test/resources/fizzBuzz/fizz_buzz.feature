Feature: Is the Number Fizz, Buzz or Fizzbuzz? Or neither?

  Scenario Outline: Is the Number Fizz, Buzz or Fizzbuzz? Or neither?
    Given The number is <number>
    When I ask is it Fizz, Buzz or FizzBuzz?
    Then I should be told <answer>
    Examples:
        | number | answer |
        | 1 | "None" |
        | 4 | "None" |
        | 19 | "None" |
        | 3 | "Fizz" |
        | 9 | "Fizz" |
        | 12 | "Fizz" |
        | 20 | "Buzz" |
        | 5 | "Buzz" |
        | 50 | "Buzz" |
        | 30 | "FizzBuzz" |
        | 15 | "FizzBuzz" |
        | 45 | "FizzBuzz" |