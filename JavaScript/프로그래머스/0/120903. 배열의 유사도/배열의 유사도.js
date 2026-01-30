function solution(s1, s2) {
  let answer = 0;
  for(let ele of s1) {
    s2.indexOf(ele) != -1 ? ++answer : answer;
  }
  return answer;
}