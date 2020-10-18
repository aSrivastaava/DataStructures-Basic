def solve(balls,length):
    ballfreq = {x:0 for x in set(balls)}
    for x in range(len(balls)):
        ballfreq[balls[x]]+=1
    while length > 0:
        if length in ballfreq:
            length -= ballfreq[length]
        else:
            return "NO"
    if length == 0:
        return "YES"
    else:
        return "NO"
 
tc = int(input())
while tc != 0:
    length = int(input())
    balls = list(map(int,input().split()))
    print(solve(balls,length))
    tc -= 1