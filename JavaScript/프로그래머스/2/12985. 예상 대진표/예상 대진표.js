function solution(n,a,b)
{
    for(i = n , j = 1; i != 1 ; i /= 2){
        min = Math.min(a,b);
        max = Math.max(a,b);
        if(min % 2 == 1 && max - min == 1) break;
        j++;
        a = Math.ceil(a/2);
        b = Math.ceil(b/2);
        
        
    }

    return j;
}