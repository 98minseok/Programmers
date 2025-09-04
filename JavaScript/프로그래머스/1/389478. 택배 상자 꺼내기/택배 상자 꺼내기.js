function solution(n, w, num) {
    const getFloor = (number) => Math.floor((number - 1) / w);
    const targetFloor = getFloor(n);
    const selectedFloor = getFloor(num);

    const getPosition = (number, floor) => {
        const isEvenFloor = floor % 2 === 0;
        const basePos = number - floor * w - 1;
        return isEvenFloor ? basePos : w - basePos - 1;
    };
    const targetPos = getPosition(n, targetFloor);
    const selectedPos = getPosition(num, selectedFloor);

    const isTargetFloorEven = targetFloor % 2 === 0;
    const isTargetAfterSelected = isTargetFloorEven 
        ? targetPos >= selectedPos 
        : targetPos <= selectedPos;
    
    return targetFloor - selectedFloor + (isTargetAfterSelected ? 1 : 0);
}