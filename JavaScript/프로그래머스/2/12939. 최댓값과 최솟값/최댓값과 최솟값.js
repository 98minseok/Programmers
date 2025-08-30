function solution(s) {
    array = s.split(" ").map((e) => +e)
    return (Math.min(...array) + " " + Math.max(...array));
}
