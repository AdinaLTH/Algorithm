function solution(numbers) {
    let answer = 0;
    let temp = 0;
    for(let i=0; i<numbers.length; i++){
        for(let j=0; j<numbers.length; j++){
          if(numbers[i] > numbers[j]) {;
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
          }
        }
      }
      answer = numbers[0] * numbers[1];
      return answer;
}