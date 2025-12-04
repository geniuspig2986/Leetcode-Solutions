ranges = input().split(",")
total = 0
for x in ranges:
    lowerbound = int(x.split("-")[0])
    upperbound = int(x.split("-")[1])
    for i in range(lowerbound, upperbound+1):
        stri = str(i)
        for y in range(2,len(stri)+1):
            if len(stri) % y == 0:
                newstri = stri[:len(stri)//y]*y
                if(newstri == stri):
                    total+= i
                    break
                    

print(total)
