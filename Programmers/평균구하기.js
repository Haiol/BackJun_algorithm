function solution(arr) {
    // var answer = arr.reduce((a,b) => a+b)/arr.length;
    let answer = 0;
    for(let i of arr)
        answer += i;
    return answer/arr.length;
}
// reduce , in 과 of 의 차이
// in 
