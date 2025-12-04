total = 0
with open("D3input.txt", "r") as f:
    for line in f:
        digitsleft = 12
        curindex = 0
        outputstr = ""
        while digitsleft > 0:
            lastindex = len(line) - digitsleft
            curmax = -1
            maxindex = -1
            for i in range(curindex, lastindex):
                if int(line[i]) > curmax:
                    curmax = int(line[i])
                    maxindex = i
            outputstr += line[maxindex]

            curindex = maxindex + 1
            digitsleft -= 1
        total += int(outputstr)                    
print(total)

