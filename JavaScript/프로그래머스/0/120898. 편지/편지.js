function solution(message) {
    let answer = 0;
    for(const msg of message){
        answer++;
    }
    return answer*2;
}