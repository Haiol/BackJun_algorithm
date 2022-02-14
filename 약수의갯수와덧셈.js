function solution(left, right) {
    var answer = 0;
    for(let i=left;i<=right;i++){
        let temp = divisor(i).length;
        answer = answer+(temp%2?i*-1:i);
    }
    return answer;
}

function divisor(n){
    let answer = [];
    for(let i=1;i<=n/2;i++)
        if(n%i==0)
            answer.push(i);
    answer.push(n);
    return answer;
}
