function solution(n) {
    let str = '';
    while(n!==0){
    str= (n%2?'수':'박') + str;        
    n--;
    }
    return str;
}
