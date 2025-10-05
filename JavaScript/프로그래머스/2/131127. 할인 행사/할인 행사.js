function solution(want, number, discount) {
    let answer = 0;
    const map = new Map();
    for(let i = 0 ; i < want.length ; i ++){
        map.set(want[i],number[i])
    }
    const totalCount = number.reduce((sum,value) => sum += value,0);
    
    const discountMap = new Map();
    for(let i = 0 ; i < totalCount ; i ++){
        discountMap.set(discount[i] , (discountMap.get(discount[i])||0) + 1 )
    }

    if(checkMap(map,discountMap)) answer++;
    for(let i = totalCount ; i < discount.length ; i++){
        const newItem = discount[i]
        const oldItem = discount[i - totalCount];
        discountMap.set(oldItem , (discountMap.get(oldItem)-1))
        discountMap.set(newItem,(discountMap.get(newItem) || 0) + 1)
        if(checkMap(map,discountMap)) answer++;
        
    }
    return answer;
}

function checkMap(map1,map2){
    let isMatch = true;
    for([k,v] of map1){
        if((map2.get(k) || 0) != v){
            isMatch = false;
            break;
        }
    }
    return isMatch;
}