function solution(n) {
    if(n===1) return 4;
    for(let i = 1; i < n/2;i++){
        // console.log(i+" "+n/i +" "+ n%i);
        if(n/i===i){
            return (i+1)*(i+1);
        }
    }
    return -1;
}
