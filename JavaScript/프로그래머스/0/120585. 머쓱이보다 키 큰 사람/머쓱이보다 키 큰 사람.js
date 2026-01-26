function solution(array, height) {
    let answer = 0;
    for (const arr of array) {
        if (height < arr) {
            answer++;
        }
    }
    return answer;
}