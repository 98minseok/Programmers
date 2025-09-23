function solution(brown, yellow) {
    let sum = brown + yellow;
    let width = 0;
    let height = 0;
    for(i = 0 ; i < sum ; i++){
        width = i;
        height = Math.floor(sum / i);
        if (width >= height && (width-2) * (height-2) == yellow && width*height - yellow == brown){
            break;
        }
    }
    return [width,height]
}