function solution(sides) {
      sides.sort((a, b) => a - b);
      let answer = sides[0] + sides[1] > sides[2] ? 1 : 2;
      console.log(sides);
      return answer;
}